package com.nt.thread;

public class CreatedMsg implements Runnable{
	Messege msg;
	
	CreatedMsg(Messege msg){
		this.msg=msg;
		
		new Thread(this,"createor").start();
		//System.out.println("crete msg");
		
		
		
	}

	@Override
	public void run() {
		//System.out.println("cr msg run");
		for(int i=0;i<=5;i++) {
		
		msg.createMsg("java");
		
		}
	}

}
