package com.nt.thread;

public class Messege {
	String msg;
	boolean isMsg;
	
	void createMsg(String msg){
		
		//System.out.println("method cr msg");
		
		/*if(isMsg) {
			//System.out.println("inside cr if");
			
			try {
				wait();
				
				
			}catch(InterruptedException ie) {
				
				
			}
		}	*/
			this.msg=msg;
			System.out.println("created msg::"+msg);
			isMsg=true;
			notify();
		
		
		
		
		
	}
	
	
	
	String readMSg() {
		
		/*if(!isMsg) {
			try {
				
				wait();
			}catch(InterruptedException ie) {
				
			}
		}*/
		
		System.out.println("msg readed::"+msg);
		isMsg=false;
		notifyAll();
		
		return msg+"->Readed";
	}
	
	
	

}
