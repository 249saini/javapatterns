package com.jsp.logical.numbers;

public class PerfectNumber 
{
	public static String isperfect(int n)
	{
		int sum = 0;
		for(int i=1; i<n; i++)
		{
			if (n%i==0)
			{
				sum =sum+i;
				}
			if(sum==n)
			{
				return "Given no is perfect";
			}
			else 
			{
				return "Not perfect";
		}
		}
		return null;
		
		

	}
	
public static void main(String[] args) {
	String res = isperfect(28);
	System.out.println(res);
}
}