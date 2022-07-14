package com.yash;

import javax.annotation.Resource;

public class Employee {

	@Resource(name = "address")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting the Address");
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside the Employee address constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee() {
		super();
	}

}
