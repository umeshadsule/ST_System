package com.nt.test2;

 class A {

	
	static int a=m1();
	static int m1() {
		System.out.println("ASV");
		return 10;
	}
	
	static {
		System.out.println("A SB");
	}
	
	
	public static void main(String[] args) {
		System.out.println("A main");
	}
	
	
}

public class B extends A{
	
	static int b=m2();
	static int m2() {
		System.out.println("B SV");
		return 20;
	}
	
	static {
		System.out.println("BSB");
		
	}
	
	public static void main(String[] args) {
		System.out.println("B main");
		System.out.println("\n B main a:"+a);
		System.out.println("B main b"+b);
	}
}
