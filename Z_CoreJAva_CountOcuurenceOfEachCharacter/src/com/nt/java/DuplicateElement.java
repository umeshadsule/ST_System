package com.nt.java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] a= {1,2,1,5,4,7};
		 int l=a.length;
		 
	//using collection api	
		Set set=new HashSet();
		
		Set set2=new HashSet();
		for(int i=0;i<=l-1;i++) {
		if(set.add(a[i])==false) {
			
			set2.add(a[i]);
		}
		System.out.println(set2);
	}
		System.out.println("****************");
		
 // using simple logic
		
		for( int i=0;i<=l-1;i++) {
			
			for(int j=i+1;j<=l-1;j++) {
               
				if(a[i]==a[j]) {
					
					System.out.println(a[i]);
				
              }
				
				
			}
			
			
			
		}
		
}

}