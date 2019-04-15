package com.ofss;

public class TestCustomer {

	public static void main(String[] args) {

		 Address a1 = new Address(535,"Ranka Colony","Bangalore",560076);
		 Customer c1 = new Customer("Prashant", a1);
		 
		 System.out.println(c1); //Display heap memory address
	}

}
