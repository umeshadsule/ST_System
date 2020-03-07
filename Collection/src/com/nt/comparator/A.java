package com.nt.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class A {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new MyComparator());
		
		ts.add(10);
		ts.add(20);
		ts.add(2);
		ts.add(5);
		ts.add(1);
		System.out.println(ts);

	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer) obj1;
		Integer i2=(Integer) obj2;
		
		if(i1>i2) {
			
			return -1;
		}
		else {
			if(i1<i2)
			return 1;
			
			else
				return 0;
		}
		
		
		
		
	}	
}