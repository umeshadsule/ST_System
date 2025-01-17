package com.nt.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class HAshSet {
	
	public static void main(String[] args) {
		Set<String>set=new HashSet<String>();
		set.add("umesh");
		set.add("Akash");
		set.add("Shri");
		
		System.out.println("Using forEach() loop\n");
		set.forEach((k)->System.out.println(k));
		
		
		System.out.println("*****************************************");
	
		System.out.println("USing for loop");
		
		for(String s:set) {
			System.out.println(s+"\n");
			
		}
		
	
		System.out.println("*****************************************");
		
		System.out.println("Using Arraylist object in HashSet");
		List<String>lst=new ArrayList();
		lst.add("A");
		lst.add("A");
		
		Set<List>hash1=new HashSet<List>();
		hash1.add(lst);
		
		for(Object obj:hash1) {
			
			System.out.println(obj.toString());
				
			}
		
		System.out.println("*****************************************");
		
		
		
		}
	}
	


