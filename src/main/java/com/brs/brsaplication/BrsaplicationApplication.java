package com.brs.brsaplication;

import com.brs.brsaplication.dao.ContaBanco;



//@SpringBootApplication
public class BrsaplicationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BrsaplicationApplication.class, args);

		ContaBanco p1 = new ContaBanco();
		ContaBanco p2 = new ContaBanco();
		ContaBanco p3 = new ContaBanco();

		p1.setUser("Bruno");
		p1.setAccountNum(15);
		p1.setBalance(1000.00);
		p1.setAccountType("cc");
		p1.setStats(false);

		p2.setUser("Pedro");
		p2.setAccountNum(17);
		p2.setBalance(2000.00);
		p2.setAccountType("cp");
		p2.setStats(false);

		p3.setUser("Fabricio");
		p3.setAccountNum(20);
		p3.setBalance(3000.00);
		p3.setAccountType("cc");
		p3.setStats(false);



		System.out.println(p3.getBalance());

	}
}
