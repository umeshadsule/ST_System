package com.nt.forEach;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestForEach {

	public static void main(String[] args) {
		//Hashmap methods  ,2.keySet(),3.get(),values()
		//Entry Methods 1.entrySet(),2.entry.getKey(),3.entry.getValue()
		
		Map<String,String> map=new HashMap<>();
		map.put("a","A");
		System.out.println("Using for(:) loop");
		for(Map.Entry<String,String> entry:map.entrySet()) {
			
			System.out.println("key:"+entry.getKey()+":Values:"+entry.getValue());
		}
		//************************************************************8
		
		System.out.println("Using ForEach()");
		 map.forEach((k,v)->System.out.println("key:"+k+":Value:"+v));
		
	//*********************************************************	
		System.out.println("Using map.keySet()  and map.get(key)");
		  for (String name : map.keySet())  
	        { 
	            // search  for value 
	            String url = map.get(name); 
	            System.out.println("Key = " + name + ", Value = " + url); 
	        } 
		
		//************************************************************
	System.out.println("	Using Iterator");
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator(); 
         
	        while(itr.hasNext()) 
	        { 
	             Map.Entry<String, String> entry = itr.next(); 
	             System.out.println("Key = " + entry.getKey() +  
	                                 ", Value = " + entry.getValue()); 
	        } 
		
		
	}
}
	


//Collection 
/*Collection Interface methods:
 * void clear(),int size(),boolean remove(),boolean removeAll(),retainAll,boolean add(),boolean contains(),boolean containsAll(),boolean equal(),int hashCode(),addAll
 * Interfaces:Sorted Set,NavigableSet
 * List::ArrayList,LonkedList
 * Set::HashSet,LinkedHashSet,TreeSet
 * legacy::Vector,Stack
  
 * 
 * 
 * 
 * */

//MAp
  
/*
 * Map:
 * HashMap,LinkedHashMap,TreeMap,
 * Methods:
 *      v put(obj key,object value),void putAll(Map map),v remove(Object key),
 *      boolean remove(object key ,object value),Set keySet(),Set<Map.Entry<K,V>>entrySet(),void clear(),
 *      boolean containsValue(Object value),boolean containsKey(Object key)	,boolean equals(Object o)
 *      V get(Object key),int hashCode(),boolean isEmpty(),V replace(K key, V value),V replace(K key, V value),
 *      boolean replace(K key, V oldValue, V newValue),Collection values(),int size()
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 
