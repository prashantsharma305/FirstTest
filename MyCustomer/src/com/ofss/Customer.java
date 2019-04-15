package com.ofss;

public class Customer {

	String customerName;
	Address address;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, Address address) {
		super();
		this.customerName = customerName;
		this.address = address; //Dependency Injection - Has a relationship
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.customerName+" "+this.address;
	}
}
