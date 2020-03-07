package com.nt.immu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableArrayList {
	final private ArrayList<String> list;
	
	ImmutableArrayList(ArrayList<String> list){
		this.list=(ArrayList<String>) Collections.unmodifiableList(list);
		
	}
	
	

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("java");
		list.add("Spring");
		
		System.out.println(list);
		

	}

}
/*
 class Example {
    final private ArrayList<String> list;

    Example(ArrayList<String> listArg) {
        list = Collections.unmodifiableList(listArg);
    }
}*/
