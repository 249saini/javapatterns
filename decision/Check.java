package com.jsp.decision;

public class Check 
{
	public static void main (String args[])
	{
		char ch = '$';
		
		if (ch>'A'&&ch<'Z'||ch>'a'&&ch<='z')
		{
			System.out.println(ch+"It is alphabet");
		}
		else
			if(ch>'0'&& ch<'9')
			{
				System.out.println(ch+"It is an alphabet");
				
				}
			else
			{
				System.out.println(ch+"It is a special character");
				
	}
	}
	

}
