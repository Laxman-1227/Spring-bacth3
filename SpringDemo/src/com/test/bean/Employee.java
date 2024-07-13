package com.test.bean;

public class Employee {
	
	String name;
	int id;
	double salary;
	
	Address address;
	
	Employee(){
		
	}

	public Employee(String name, int id, double salary, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
	




	

	
	
}
