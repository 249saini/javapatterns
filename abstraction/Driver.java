package com.jsp.abstraction;

public class Driver {

	public static void main(String[] args) {
		
		HdfcImplementation hdfc  = new HdfcImplementation() ;
		hdfc.payment();
		hdfc.transfer();
		hdfc.checkstatement();
		hdfc.m1();
				
	}
}
