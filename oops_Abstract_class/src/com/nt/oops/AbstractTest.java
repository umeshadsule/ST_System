package com.nt.oops;

public class AbstractTest extends B {
	public static void main(String[] args) {
	B b=new C();
		
		b.m2();
	}

	@Override
	public void m2() {
		System.out.println("Abstarct test m2");
		
	}


}

 abstract class B {
	 
	 abstract void m2();
	
    static void m1() {
		
		System.out.println("static mtod in abstract");
	}
	
}

  class C extends B{
	  
	public  void  m2(){
		  System.out.println("c m2");
	  }
	 
 }