package com.kodewala.constructors1;

public class Driver {

	public static void main(String[] args) {
		//type refName = new Class();
		
		Account acc = new Account();//Accont("Kodewala", 300)---> calling a constructor

		System.out.println(acc.amount +" and "+acc.name);
		
		Account acc1 = new Account(2000, "Kodewala");//calling constructor which expects String and int
		
		System.out.println(acc1.amount +" and "+acc1.name);
	}

}
