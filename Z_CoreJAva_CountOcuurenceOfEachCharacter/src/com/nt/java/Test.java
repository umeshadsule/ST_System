package com.nt.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String s="java";
		char[] ch=s.toCharArray();
		int l=ch.length;
		int count=1;
		Set set=new HashSet();
		for(int i=l-1;i>=0;i--) {
		if(set.add(ch[i])==false) {
			count++;
			
			System.out.println(ch[i]+"::count:"+count);
			
		}
		}
		
		System.out.println("******************************************");
		
		String ss="hello";
		
		char[] ch1=ss.toCharArray();
		int count1;
		Map<Character,Integer> map=new HashMap();
		for(char ch2:ch1) {
		if(!map.containsKey(ch2)) {
		map.put(ch2, 1);
		}else {
			count=map.get(ch2);
			map.put(ch2, count+1);
			
		}
	}
		System.out.println(map);
	}

}
