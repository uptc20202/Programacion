package model;

public class Address {

	private String street;
	private String city;
	private int zipcode;
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city, int zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
