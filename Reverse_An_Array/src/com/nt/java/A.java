package com.nt.java;

import java.util.Arrays;

public class A {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("reverse");
		int[] a= {10,20,30,40,440,50};
		reverse(a);
		

	}
	
	public static void reverse(int[] a) {
		 
		 int [] b=new int[a.length];
		 int j=0;
		 for(int i=a.length-1;i>=0;i--) {
			 System.out.println("in loop");
			 b[j]=a[i];
			 j++;
			 }
		System.out.println(Arrays.toString(b));
	}

}
