package com.nt.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	
	public static void removeD(List list){
		
		Set set=new HashSet();
		set.addAll(list);
		list.clear();
		
		list.addAll(set);
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(1);

		removeD(list);
		
		
		

	}

}
