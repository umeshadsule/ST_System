package com.nt.comparator;

import java.util.Comparator;
import java.util.TreeSet;

class Employee4 implements Comparable{
	
	String name;
	int eid;
	

	public Employee4(String name, int eid) {
		
		this.name = name;
		this.eid = eid;
	}
	
	public String toString() {
		return "NAme:"+name+",Eid::"+eid;
	}

	public int compareTo(Object obj) {
		int eid=this.eid;
		Employee4 e= ( Employee4) obj;
		int eid2=e.eid;
		System.out.println(eid);
		//return this.compareTo(e);
		if(eid<eid2) {
			
			return -1;
			}
			else {
				if(eid>eid2)
				return 1;
				else
					return 0;
			}
		}
}

	




public class DemoCompator {

	public static void main(String[] args) {
		Employee4 e1=new Employee4("nag",200);
		Employee4 e2=new Employee4("shri",100);
		Employee4 e3=new Employee4("Hari",500);
		
		TreeSet ts=new TreeSet();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		System.out.println(ts);
		
		TreeSet ts1=new TreeSet(new MyComparator1() );
		ts1.add(e1);
		ts1.add(e2);
		System.out.println(ts1);
		

	}

}

class MyComparator1 implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
	Employee4 e1=(Employee4) obj1;
	Employee4 e2=(Employee4) obj2;
	
	String s1=e1.name;
	String s2=e2.name;
	

		return s1.compareTo(s2);
	}
	
}