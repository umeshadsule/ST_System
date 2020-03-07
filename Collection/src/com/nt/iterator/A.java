package com.nt.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("umesh");
		l.add("Akash");
		l.add("Shri");
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()+"");
		}

	}

}
