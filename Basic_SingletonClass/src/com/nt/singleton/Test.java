package com.nt.singleton;

public class Test {

	
		
		public static void main(String[] args) {
			
			SingletonTest test=SingletonTest.getInstance();
			
			
			System.out.println(test.s);
			
			test.s=test.s.toUpperCase();
			SingletonTest test1=SingletonTest.getInstance();
			System.out.println(test1.s);
			System.out.println(test.s);

		}
	}

