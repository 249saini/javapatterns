package com.jsp.constructors;

public class carDriver {
public static void main(String[] args)
{
	Car car = new Car("Hyundai","Aura","Vintage",10);
	System.out.println(car.brand);
	System.out.println(car.name);
	System.out.println(car.color);
	System.out.println(car.price);
}
}
