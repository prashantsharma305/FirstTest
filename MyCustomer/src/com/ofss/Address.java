package com.ofss;

public class Address {

	int flatNo;
	String streetName;
	String city;
	int pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(int flatNo, String streetName, String city, int pincode) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		
		String address = this.flatNo+","+this.streetName+","+this.city+" "+this.pincode;
		
		// TODO Auto-generated method stub
		return address;
	}
}
