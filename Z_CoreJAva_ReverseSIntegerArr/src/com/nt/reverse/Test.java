package com.nt.reverse;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("with new array");
		int [] a= {0,1,2,3,4};
		int [] b=new int[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--) {
			b[k]=a[i];
			k++;
		}
		System.out.println(Arrays.toString(b));
		
		System.out.println("***********************8");
		
		System.out.println("without extra array");
		String s="core";
		System.out.println(s.length());
		int [] c= {0,1,2,3,4,6};
		int temp;
		int end=c.length-1;
		System.out.println(end);
		int middle=(c.length-1)/2;
		System.out.println(middle);
		for(int i=0;i<=middle;i++) {
			temp=c[i];
			c[i]=c[end];
			c[end]=temp;
			end--;
			System.out.println(Arrays.toString(c));
		}
		
		

	}

}
