package com.jsp.abstraction;

public abstract class Hdfc {
	
   abstract public void payment();

   abstract public void transfer();
   
   abstract public void checkstatement();
   

public  void  m1() {
	System.out.println("concrete method allowed");
}
}
