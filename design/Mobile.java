package com.jsp.design;

public class Mobile {
//attributes of mobile
	private String mobile_name;
   private String brand;
	private double price;
	private String ram;
	//acheives has -a relationship with Sim1
	private Sim1 sim1;
	//acheives has -a relationship wits sim2
	private Sim2 sim2;
	
	public Mobile() {
		System.out.println("No arg");
	}
	//constructor of mobile
	public Mobile(String mobile_name, String brand, double price, String ram)
	{
		this.mobile_name=mobile_name;
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		}
	//public getter and setter
	public String getMobile_name() {
		return mobile_name;
	}
	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public Sim1 getSim1() {
		return sim1;
	}
	public void setSim1(Sim1 sim1) {
		this.sim1 = sim1;
	}
	public Sim2 getSim2() {
		return sim2;
	}
	public void setSim2(Sim2 sim2) {
		this.sim2 = sim2;
	}
  public void printEntireMobileDetails(){
	System.out.println("Mobile config...");
	System.out.println(mobile_name+"is the mobile name");
	System.out.println(brand+"is the brand");
	System.out.println(price+"is the cost");
	System.out.println(ram+"is the ram config");
	
	if(sim1 !=null) {
		sim1.printSim1Details();
	}else {
		System.out.println("Sim1 is not inserted");
		}
	if(sim2!=null) {
		System.out.println("Sim2 config...");
		System.out.println(sim2.getService_Provider());
		System.out.println(sim2.getContact_number());
	}else {
		System.out.println("Sim2 is not presented");
	}
}
}
