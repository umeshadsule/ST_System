package com.nt.count;

import java.util.HashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello";
		Map<Character,Integer>map=new HashMap();
		char[] charArray=s.toCharArray();
		for(char ch:charArray) {
		if(!map.containsKey(ch)) {
			map.put(ch, 1);
		}
		else {
			int cnt=map.get(ch);
			map.put(ch, cnt+1);
			
		}
		System.out.println(map);
	}
	}

}
