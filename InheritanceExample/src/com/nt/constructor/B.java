package com.nt.constructor;

import com.nt.constructor2.A;
public class B extends A{
	public B(){
		super();
	}
	public B(int a){
		super(a);
	}
	
	public static void main(String[] args) {
		
		B b=new B(10);
	}
	}

