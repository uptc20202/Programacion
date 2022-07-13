package model;

import java.util.Arrays;

public class Employee {
	
	private int id;
	private String name;
	private Address address;
	private long[] phoneNumbers;
	
	public Employee() {}
	
	public Employee(int id, String name, Address address, long[] phoneNumbers) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAdress() {
		return address;
	}

	public long[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setPhoneNumbers(long[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumbers="
				+ Arrays.toString(phoneNumbers) + "]";
	}
	
	
	
}
