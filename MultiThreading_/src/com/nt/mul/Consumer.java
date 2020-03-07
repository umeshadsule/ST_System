package com.nt.mul;

public class Consumer implements Runnable  {
	Factory fa;
	
	Consumer (Factory fa){
		this.fa=fa;
		
		new Thread(this,"consumer").start();
	}
	
	@Override
	public void run() {
		System.out.println("15 inside consume run");
		int i=1;
		
		while(i<=4){
			System.out.println(" 16 inside while consume run");
			
			
			fa.consumer();
			System.out.println("21 after method call consumer");
			i++;
			
		}
		
	}

}
