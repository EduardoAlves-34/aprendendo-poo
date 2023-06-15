package com.brs.brsaplication.api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {

    private List<String> listaAfazeres = new ArrayList<>(5);


    @GetMapping("/todo_List/")
    public String buscarLista() {

        return listaAfazeres.toString();
    }
    @GetMapping("/umItem/{item}")
    public String buscarUm(@PathVariable ("item") int algumIndice) {

        return listaAfazeres.get(algumIndice);
    }

    @PostMapping("/criar_item/{id}")
    public String criarUmItemNaLista(@PathVariable("id") String identificador) {
        listaAfazeres.add(identificador);

        return identificador + " " + "Criado com Sucesso";
    }
    @PatchMapping("/atualizarItem/{name}/{id}")
    public String atualizarItem(@PathVariable ("name") String name,@PathVariable ("id") int id) {
        listaAfazeres.set(id,name);

        return name + id + " " + "Atualizado com Sucesso";
    }

    @DeleteMapping("/remover_item/{id}")
    public String removerUmItem(@PathVariable("id") int identificador) {
        listaAfazeres.remove(identificador);

        return identificador + " " + "Deletado com Sucesso";

    }

}
