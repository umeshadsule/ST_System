package com.nt.inner;

/*1) Nested Inner class
2) Method Local inner classes
3) Anonymous inner classes
4) Static nested classes
*/

//1.Nested inner class

//nested inner class is object of its outer class so we cant write atatic method in inner class
//private member of outer class can be acessed by inner nested class



/*class Outer { 
	private static int a=10;
	
	
	   // Simple nested inner class 
	   class Inner { 
	      public void show() { 
	           System.out.println("In a nested class method"+a); 
	      } 
	      
	      //Dont have static method in inner class
	      
	      public static void m() {
	    	  System.out.println("static method");
	      }
	      
	   } 
	} 

public class Main { 
	   public static void main(String[] args) { 
	      Outer.Inner in = new Outer().new Inner(); 
	       in.show(); 
	   } 
	} */



class Outer { 
	void outerMethod() { 
		System.out.println("inside outerMethod"); 
		// Inner class is local to outerMethod() 
		class Inner { 
			void innerMethod() { 
				System.out.println("inside innerMethod"); 
			} 
		} 
		Inner y = new Inner(); 
		y.innerMethod(); 
	} 
} 
class MethodDemo { 
	public static void main(String[] args) { 
		Outer x = new Outer(); 
		x.outerMethod(); 
		
	} 
} 
