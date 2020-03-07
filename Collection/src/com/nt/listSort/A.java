package com.nt.listSort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class A {
	
	//No need of impemlements comparable ,or comparator for Integer ,String like all
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("java");
		al.add("mava");
		al.add("bava");
		
		//TreeSet<String> ts=new TreeSet<String>(al);
		TreeSet<String> ts=new TreeSet<String>();
		ts.addAll(al);
		System.out.println(ts);
	}
}

