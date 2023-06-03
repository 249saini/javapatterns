package com.jsp.design;

public class CarDriver {
public static void main(String[]args)
{
	Car c1 = new Car("X5","BMW","White",950000);
	c1.printCarDetails();
	System.out.println("===============================");
	c1.setEngine(new Engine("335","2993"));
	c1.printCarDetails();
}
}
