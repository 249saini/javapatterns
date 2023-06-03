package com.jsp.constructors;


   public class CalculatorDriver {
	   public static void main(String[] args) {
		Calculator.addTwoNumbers(10, 20);
		Calculator.subTwoNumbers(20, 10);
		
		Calculator c1 = new Calculator();
		System.out.println(c1.divideTwoNumbers(10, 2));
		System.out.println(c1.mulTwoNumbers(10, 2));
		
	}
	   
   }