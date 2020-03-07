package com.nt.dup;

import java.util.HashSet;
import java.util.Set;

public class D2 {
	
	public static void main(String[] args) {
		
	
	String s="one two three two";
	
	Set<String>st=new HashSet();
	
	Set<String>dup=new HashSet();
	
	
	
	String [] words=s.split(" ");
	
	for(String s1:words) {
		boolean b=st.add(s1);
		if(!b) {
			System.out.println(dup.add(s1));
		}
		
	}
	System.out.println(dup);

}
}
