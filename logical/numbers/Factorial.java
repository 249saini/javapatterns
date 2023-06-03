package com.jsp.logical.numbers;

public class Factorial
{
	public static int factorialOfNumber(int n)
	{
		int pro = 1;
		
		while(n>0)
		{
			pro*=n;
			n--;
		}
		for(int i=1;1<=n;i++)
		{
			pro = pro*1;
		}
	return pro ;
		}
	public static void main(String[] args)
	{
		System.out.println(factorialOfNumber(5));
	}
	
}