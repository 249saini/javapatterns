
package com.jsp.design;

public class Author { 
	private String name;
	private String email;
	private String contact_number;
	//Acheive has a relationship
	private Address address;
	
	public Author(String name, String email,String contact_number)
	{
		this.name=name;
		this.email=email;
		this.contact_number=contact_number;
		}
	// getter and setter for Author & Address

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
    //print author details
	public void printAuthorDetails() {
		System.out.println("=====Author=====");
		System.out.println(name);
		System.out.println(email);
		System.out.println(contact_number);
	
		if(address!=null) {
		address.printAddressDetails();
	}
			else {
		System.out.println("Address has not been disclosed");
	}
	}
}
	
	
