package com.jsp.design;

public class MobileDriver {
	public static void main(String[] args) {
		Mobile m1=new Mobile("Oppo","f21",20000,"8GB");
		m1.printEntireMobileDetails();
		m1.setSim1(new Sim1("airtel",8108839179l));
		m1.printEntireMobileDetails();
		m1.setSim2(new Sim2("Jio",74506457112l));
		m1.printEntireMobileDetails();
		
	}
}
