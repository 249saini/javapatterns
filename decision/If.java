package com.jsp.decision;

public class If{

  public static void main(String[] args)
	{
		int a=5;
		int b=4;
		int c=50;
	if (a>b && a>c)
		System.out.println(a+ "is the greatest");
		
	else
		if (b>c)
	{
		System.out.println(b+"is the greatest");
	}
	else
	{
		System.out.println(c+"is the greatest");
	}
	}
}














