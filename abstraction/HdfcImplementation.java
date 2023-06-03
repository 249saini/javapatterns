package com.jsp.abstraction;

public class HdfcImplementation extends Hdfc {
	
	@Override
	
	public void payment() {
		System.out.println("payment");
	}
	
	@Override
	
	public void transfer() {
		System.out.println("transfer..");
		
	}
	@Override
	public void checkstatement() {
		System.out.println("checkstatement");
	}

}