package com.nt.nonrepeat;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {
	
	
	public static void main(String[] args) {
		Map<Character,Integer> map=new LinkedHashMap();
		
		String s="SimpleS";
		char[] charArray=s.toCharArray();
		
		for(char ch:charArray) {
			
			map.put(ch, map.containsKey(ch) ? map.get(ch)+1 :1);
			
			
		}
		System.out.println(map);
		Set<Entry<Character,Integer>> entryset=map.entrySet();
		
		for(Entry<Character,Integer>entry:entryset) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
