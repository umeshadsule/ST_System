package com.nt.mul;

class Display {
	public synchronized void wish(int n)
	{
		
		for(int i=0;i<n;i++)
		{    
			System.out.print("N::"); 
			try    {
				wait();
				}    catch (InterruptedException e)    {}
			System.out.println(i);
			}
		}
	} 


class MyThread extends Thread {  
	Display d; 
	int n;
	MyThread(Display d,int n)

{   this.d=d;
this.n=n;
}
	
public void run()  {
	d.wish(n);
	notify();
	}
} 

public class MulTest {
	public static void main(String[] args)  {
		Display d1=new Display();
		MyThread t1=new MyThread(d1,50);
		MyThread t2=new MyThread(d1,100);
		t1.start();   
        t2.start(); 
        
} 
} 