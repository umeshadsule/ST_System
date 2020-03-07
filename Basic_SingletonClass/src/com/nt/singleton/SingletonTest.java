package com.nt.singleton;

public class SingletonTest {
	
	private static SingletonTest singleInstance;
	
	String s;
	private SingletonTest() {
		
		s="singleton";
	}
	
	public static SingletonTest getInstance(){
		
		
		if(singleInstance==null)
			singleInstance =new SingletonTest();
		
		return singleInstance;
		
		
		
		
	}

}

