package com.mp.simple;

public class Simple {   
	
	private int  a=10;
	
	static int b=10;
	
	static {
		System.out.println(b);
	}
	
	{
		
		System.out.println("non static block");
	}
	
	Simple(){
		
	}
	
	public void m() {
		
		
		
		
	}
	
	public static void m2() {
		
		int a=11;
		System.out.println("m2");
		
	}
	
	
	
	
	

	
	
	
	public static void main(String[] args) {
		System.out.println("rani");
		Simple s=new Simple();
		s.m2();
	}
	
	
	

	 private class A
	{
		
	}

}

