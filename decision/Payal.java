package com.jsp.decision;

import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Payal {
	public static void main(String[] args) {
		
		int age;
		Scanner s = new Scanner (System.in);
		  age =s.nextInt();
		  System.out.println("enter age ");
		  
		  if(age>50) {System.out.println("more ex. porsone");
		   }
		  else if(age>20) {
			  System.out.println("Fresher");
		  }
			  else if (age>15) {
				  System.out.println("teneger");
			  }
			  
		  }
		}
	


