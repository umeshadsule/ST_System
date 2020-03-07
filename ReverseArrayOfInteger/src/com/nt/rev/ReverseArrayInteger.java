package com.nt.rev;

import java.util.Arrays;

public class ReverseArrayInteger {

	public static void main(String[] args) {
		
		int[] a= {20,10,12,3,2,1};
		int[] j= new int[6];
		int l=0;
		for(int i=a.length-1;i>=0;i--) {
			//System.out.println(a.length-1);
			
			 j[l]=a[i];
			 l++;
			// System.out.println(Arrays.toString(j));
		}
		 System.out.println(Arrays.toString(j));
			
	}

}
