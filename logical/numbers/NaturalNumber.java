package com.jsp.logical.numbers;

public class NaturalNumber {

	public static void printNaturalNumber(int start, int end_limit) 
		
	{
		while(start <=end_limit)
		{
		System.out.print(start+ " ");
		start++;
		
		}
	}
public static void main(String[] args) 
{
	printNaturalNumber(10,50);
	
}	
	
}
