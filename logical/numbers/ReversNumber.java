package com.jsp.logical.numbers;

import java.util.Scanner;
public class ReversNumber {
	public static boolean reversNumber(int n) {
		int rev = 0; int temp = n;
		while(n>0)
		{
			int temp2 = n%10;
			rev = rev*10+temp2;
			n=n/10;
			
		}
		if(temp==rev) {
			return true;
			
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbe to be reversed");
		int n = sc.nextInt();
		System.out.println(reversNumber(n));
		

		}

	

}
