package com.brs.brsaplication;

import com.brs.brsaplication.bank.ContaBanco;
import com.brs.brsaplication.combat.Character;
import com.brs.brsaplication.combat.Fight;
import com.brs.brsaplication.encapsulamento.ControlImpl;


//@SpringBootApplication
public class BrsaplicationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BrsaplicationApplication.class, args);

		Character P[] = new Character[5];
		Fight UFC = new Fight();

		P[0] = new Character("Ciri","brazil","female",20,1.70,75.00,100,0,0);

		P[1] = new Character("Yennefer","United States","female" ,28,1.71,77.00,50,0,10);

		UFC.brandFight(P[0],P[1]);
		UFC.toFight();

		P[0].status();

		P[1].status();








	}
}
