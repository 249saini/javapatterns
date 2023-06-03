package com.jsp.methodoverloading;

public class A {
public static void m1() {
	System.out.println("No arg method");
}
public void m1(int a ) {
	System.out.println(a);
}
public static void main(String[] args) {
	A a = new A();
	a.m1();
	a.m1(25);
}
}
