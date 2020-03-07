package com.nt.test3;

 class A {

	
	static int a=10;
	
	
	static {
		System.out.println("A SB");
		System.out.println("B"+B.getB());
		System.out.println("");
	}
	
	
	
}

public class B extends A{
	
	static int b=20;
	
	
	static {
		System.out.println("BSB");
		
	}
	
	static int getB() {
		
		return 20;
	}
	
	
	public static void main(String[] args) {
		System.out.println("B main");
		System.out.println("\n B main a:"+a);
		System.out.println("B main b"+b);
	}
}
