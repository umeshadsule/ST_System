package com.nt.dup;

import java.util.HashSet;
import java.util.Set;

public class D {
	public static void main(String[] args) {
		
		int[] a= {1,1,2,3,3,5,6,7};
		
		Set<Integer> s=new HashSet();
		for(int i=0;i<=a.length-1;i++) {
			
			if(s.add(a[i])==false) {
				
				System.out.println(a[i]);
			}
			
		}
		
		
		
		
	}

}
