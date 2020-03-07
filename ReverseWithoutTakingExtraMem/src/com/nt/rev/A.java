package com.nt.rev;

import java.util.Arrays;

public class A {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,49};
		int start=0;
		int end=a.length-1;
		int middle=end/2;
		
		for(;start<=middle;start++,end--) {
			
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			
		}
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
