package com.nt.core.TreeMap;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
	//	NavigableMap<String,String> map=new TreeMap<String,String>(Collections.reverseOrder());
		NavigableMap<String,String> map=new TreeMap<String,String>(Collections.reverseOrder());
		
		map.put("a","A");
		map.put("d","B");
		map.put("c","C");
		map.put("b","D");
		
	    System.out.println(map);
	   // System.out.println(Collections.reverseOrder());

	}

}
