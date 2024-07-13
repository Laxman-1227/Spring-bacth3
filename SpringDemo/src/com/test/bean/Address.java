package com.test.bean;

public class Address {
	
	String city;
	String HouseNo;
	String pincode;
	
	public Address(String city, String houseNo, String pincode) {
		super();
		this.city = city;
		HouseNo = houseNo;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", HouseNo=" + HouseNo + ", pincode=" + pincode + "]";
	}
	
	
	

}
