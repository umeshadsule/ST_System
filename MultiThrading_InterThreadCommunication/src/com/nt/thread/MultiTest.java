package com.nt.thread;

public class MultiTest {

	public static void main(String[] args) {
		Messege msg=new Messege();
		
		new CreatedMsg(msg);
		new ReadedMsg(msg);
		//System.out.println("end");

	}

}
