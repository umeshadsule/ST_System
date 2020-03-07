package com.nt.thread;

public class ReadedMsg implements Runnable {
	Messege msg;
	
	ReadedMsg(Messege msg){
		 this.msg=msg;
		 
		 new Thread(this,"read").start();
		
	}
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
		msg.readMSg();
		}
	}
	
	

}
