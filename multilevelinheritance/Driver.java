package com.jsp.multilevelinheritance;

public class Driver {
	public static void main(String[] args) {
		Father father = new Father();
		father.buyLand();
		
		Son s= new Son();
		s.buyhouse();
		s.buyLand();
		
		GrandSon gs = new GrandSon();
		gs.buyCar();
		gs.buyhouse();
		gs.buyCar();
		

	}
}
