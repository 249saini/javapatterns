package com.jsp.design;

public class Sim2 {

private String Service_Provider;
private long Contact_number;
//constructor
public Sim2(String service_provider , long contact_number) {
	this.Service_Provider=service_provider;
  this.Contact_number=contact_number;
  }
//public getter setter for Sim2
public String getService_Provider() {
	return Service_Provider;
}
public void setService_Provider(String service_Provider) {
	Service_Provider = service_Provider;
}
public long getContact_number() {
	return Contact_number;
}
public void setContact_number(long contact_number) {
	Contact_number = contact_number;
}
// method to print details Sim1 object
public void printSim1Details() {
	System.out.println("Sim2 config...");
	System.out.println("Sim2 service provider name is"+ Service_Provider);
	System.out.println("Sim2 contact number"+Contact_number);
	
	
}

}
