package com.nt.oop;


//you can increase the visibilty but you can not decrease
class A{
	
	 public static void m1() {
		
		System.out.println("A");
		
	}
	
	
}

public class Test extends A {
	
	public static void m1() {
		System.out.println("Test");
	}
	
	
	
	
	public static void main(String[] args) {
		
		A a=new Test();
		a.m1();
		
	}

}
