package com.nt.mul;

public class MulTest  extends Thread{
	
	synchronized void thOne(){
		System.out.println("th1");
		try {
			wait();
			System.out.println("after wait");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized void thTwo() {
		System.out.println("th2");
		
		notify();
	}
@Override
public void run() {
	System.out.println("in run");
	this.thOne();
	
	this.thTwo();
		//t.thOne();
		//t.thTwo();
	}
	public static void main(String[] args) {
		MulTest t=new MulTest();
		MulTest t2=new MulTest();
		System.out.println("obj created");
		
		Thread th1=new Thread();
		System.out.println("thread created");
		t.start();
		t2.start();
	
		//t.thOne();
		//t.thTwo();
		
		//Thread th2=new Thread();
		

	}

}