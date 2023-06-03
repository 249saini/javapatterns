package com.jsp.logical.numbers;

public class Factors {

	public void factorsOfNumbers(int n) {
		
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.print(i+"");
		}
	}
	}
public static void main(String[] args) {
	Factors factors = new Factors();
	factors.factorsOfNumbers(8);
	
}	
}
