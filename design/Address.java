package com.jsp.design;

public class Address {
private String street_name;
private String state;
private String city;
//constructor
public Address(String street_name,String state,String city) {
	this.street_name= street_name;
	this.state=state;
	this.city=city;
	}
//getter and seeter for Address
public String getStreet_name() {
	return street_name;
}
public void setStreet_name(String street_name) {
	this.street_name = street_name;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
// method 
public void printAddressDetails() {
System.out.println("========Address=====");
System.out.println("Address street nameis"+ street_name);
System.out.println("Address state is"+ state);
System.out.println("Address city"+city);


}
}
