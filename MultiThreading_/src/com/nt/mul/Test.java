package com.nt.mul;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory bajaj=new Factory();
		System.out.println(" 1 factory created");
		new Producer(bajaj);
		System.out.println("test bajaj");
		new Consumer(bajaj);
		System.out.println("14 Test After consume obj creation");
		
		
	}

}
