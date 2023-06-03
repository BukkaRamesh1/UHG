package com.sample.sweta;

public class Address {

}
private String street;
private String city;
private String state;
private String zipcode;

Address () {
}

	Address(String street) {
		this.street = street;
		
	}


public Address(String street, String city, String state, String zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
public void method1() {
	System.out.print("this is from Addresss ");
}
public String getStreet() {
	return street;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public String getZipcode() {
	return zipcode;
}


public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}


}
