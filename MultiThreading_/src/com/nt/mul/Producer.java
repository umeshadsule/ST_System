package com.nt.mul;

public class Producer implements Runnable {
	Factory fa;
	
	Producer (Factory fa){
		this.fa=fa;
		
		new Thread(this,"producer").start();
		System.out.println("2 Constructor produce create thread");
	}
	
	@Override
	public void run() {
		System.out.println("3 inside produce run");
		int i=1;
		
		while(i<=4){
			System.out.println(" 4 inside while produce run");
			
			fa.produce(i++);
			
			System.out.println(" 12 after method call produe");
			
		}
		
	}

}
