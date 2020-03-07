package com.nt.exception;

import javax.management.IntrospectionException;

class A{
	
	static void m1() throws InterruptedException {}
}

public class Test2 extends A {
	
	static void m1() throws InterruptedException  {
		A.m1();
	}
	

	public static void main(String[] args) /*throws InterruptedException*/{
		
	}

}

