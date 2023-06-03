package com.jsp.encapsulation;

public class SstudentDrive {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(35);
		s1.setName("Payal");
		s1.setEmail("sainipayal690@gmail.com");
		s1.setCourse("testing");
		
		
		Student s2=new Student();
		s2.setId(42);
		s2.setName("Azam");
		s2.setEmail("sainipayal630@gmail.com");
		s2.setCourse("development");
		
		
		System.out.println(s2.getCourse());
		System.out.println(s2.getEmail());
		System.out.println(s2.getName());
		System.out.println(s2.getId());
		
		System.out.println(s1.getName());
		 
			
		}
	}


