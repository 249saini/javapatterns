package com.jsp.constructors;

public class Pen 
{
	String brand;
	String name;
	String color;
	double price;
	
	public Pen(String brand, String name, String color, double price)
	{
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
		
	}
public Pen(String color, String brand, String name ) {
	this.brand=brand;
	this.name=name;
	this.color=color;
	
}
}
