package com.jsp.Nested;

public class Mobile {
	
public static void main(String[] args) 
{
	int n=5;
	for(int i =1; i<n; i++)
	{
		int temp=i;
	for(int s=1; s<=n; s++)
	{
		System.out.println(" ");
	}
	for(int j=1; j<=i; j++)
	{
		System.out.print(temp);
		temp++;
	}
	System.out.println();
	}
}
}
