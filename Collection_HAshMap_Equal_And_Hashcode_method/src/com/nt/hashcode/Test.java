package com.nt.hashcode;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Object obj=new Object();
		Object obj2=obj;
		obj.hashCode();
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		
		*/
		
		Test test=new Test();
		
		System.out.println(test.hashCode());
		
		
      Map map=new HashMap();
      Map map1=new HashMap();
      
      
      map.put("a", 10);
      System.out.println(map.hashCode());
      map.put("b", 20);
      System.out.println(map.hashCode());
      System.out.println(map1.equals(map1));
      if(map.equals(test)) {
    	  System.out.println("this class obj");
      }

	}

}
