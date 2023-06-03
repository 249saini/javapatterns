package com.jsp.logical.numbers;

public class NeonNumber
{
public static String isNeonNumber(int n) 

{
	
	int sqr = n*n;
	int sum = 0;
	while(sqr!=0)
	{
		int last = sqr%10;
		sum=sum+last;
		sqr= sqr/10;
	}
	if(sum==n)
	{
		return "The number is neon";
					}
	else
	{
		return "Not neon";
		
	}
}

public static void main(String[] args) {
	 System.out.println(9);
}
}
