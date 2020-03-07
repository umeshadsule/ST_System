package com.nt.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterator {

	public static void main(String[] args) {
		Map<String,String>map=new HashMap();
		map.put("a", "Akash");
		map.put("b", "Umesh");
		map.put("c", "Shri");
		
//using Iterator
		
		/*Iterator<Map.Entry<String ,String>> itr=map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<String,String>entry=itr.next();
			System.out.println(""+entry.getKey()+" "+entry.getValue());
			*/
		
		
//using forEach
		map.forEach((k,v)->System.out.println("KEy::"+k+",value::"+v));
			
			
		}

	}


