package com.jsp.constructors;

public class Marker {
	double price; // variable declaration
		String name;
 static String brand = "Camlin" ;
		String color; // properties/ attributes
		
		public static void main(String[] args) {
			Marker marker = new Marker();
			System.out.println(marker.brand+"is the brand");
			System.out.println(marker.price);
			System.out.println(marker.name);
			marker.color = "RED";
			System.out.println(marker.color+"is m1 color");
			System.out.println("==========Marker2==========");
			
			Marker marker2 = new Marker();
			marker2.color = "Blue";
			System.out.println(marker2.brand+"is the brand");
			System.out.println(marker2.price);
			System.out.println(marker2.name);
			System.out.println(marker2.name);
			System.out.println(marker2.color+"is the m2 color");
			
			System.out.println("========Marker3=======");
			Marker marker3 = new Marker();
			System.out.println(marker3.brand);
			System.out.println(marker3.color);
		}
	}


