package com.nt.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionCopyMAp {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("java", "Umesh");
		map.put("Akash", "Surendra");
		
		Map<String,String> map0=new HashMap<String,String>();
		map.put("shri", "Umesh");
		String s=map.put("shri", "Surendra");
		System.out.println("s::"+s);
		
		
		Map<String,String> map1=new HashMap<String,String>();
		map1.putAll(map);
		
		
		for(Map.Entry<String,String> entry:map1.entrySet()){
			
			System.out.println(entry.getKey()+":::values::"+entry.getValue());
			
		}
		
		
		//map itertor practcice 
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			
			Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+";;Values"+entry.getValue());
			//System.out.println(itr.next());
		}

	}

}
