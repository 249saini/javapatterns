package com.jsp.logical.numbers;

public class DigitCount {
	public static int digitCount(int n) {
		int count=0;
		
		while(n>0)
		{
			n=n/10;
			count++;
			
		}
		return count;
		
	}

	public static void main(String[] args) {
		{
			int res =  digitCount(245);
			System.out.println(res);
		}
	}
}
