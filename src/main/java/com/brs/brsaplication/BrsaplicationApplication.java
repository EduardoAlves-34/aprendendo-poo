package com.brs.brsaplication;

import com.brs.brsaplication.dao.ContaBanco;



//@SpringBootApplication
public class BrsaplicationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BrsaplicationApplication.class, args);

		ContaBanco Pedrin = new ContaBanco();
		ContaBanco brunao = new ContaBanco();


		brunao.setUser("Brunão");
		brunao.setAccountNum(15);
		brunao.setBalance(1000.00);
		brunao.setAccountType("cc");
		brunao.setStats(false);

		Pedrin.setUser("Pedrinho");
		Pedrin.setAccountNum(17);
		Pedrin.setBalance(2000.00);
		Pedrin.setAccountType("cp");
		Pedrin.setStats(false);

		Pedrin.openNewAccount();
		Pedrin.payTuition();

		System.out.println(Pedrin.getBalance());

	}
}
