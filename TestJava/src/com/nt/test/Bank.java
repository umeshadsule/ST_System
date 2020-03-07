package com.nt.test;

public class Bank {
	//instance variable
	int balance;
	
	//static intstance variable
	static int c=10;
	
	static int e=10;
	
	
	//static block
	static {
		
		System.out.println("ststic block");
	}
	
	
	//non static block
	{
		
		System.out.println("nonstatic block");
	}
	
	
	//by default running constructor
	Bank(){
	System.out.println("zero parameter");	
	}
	
	
	
	//parametrized constructor
	Bank(int balance){
		//local variable
		int d=10;
		
		
		this.balance=balance;
		
		System.out.println("paramater const===Balnce is=="+balance);
		
	}
	
	//static method 
	//it can call in main method without creating object 
	public static int bill() {
		
		System.out.println("bill");
		return 10;
	}
	
	//method
	public void withdraw(int w) {
		//local variable
		//int b=10;
		int total=balance-w;
		System.out.println("withdraw=="+w+"total balance"+total);
	}
	
	public void deposit(int d) {
		int total=balance+d;
		System.out.println("deposit=="+d+"total"+total);
	}
	
	public static void main(String[] args) {
	
		//System.out.println("Rani ");
		System.out.println(c);
		Bank rani=new Bank();
		//Bank u=new Bank(500);
		//u.withdraw(50);
		//u.deposit(250);
	}
	
}
