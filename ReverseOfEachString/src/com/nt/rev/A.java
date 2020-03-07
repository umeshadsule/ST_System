package com.nt.rev;

public class A {
	
	
	
	public static void main(String[] args) {
		String s="Hello World";
		String output="";
		String [] words=s.split(" ");
	for(String word:words) {
		String revWord="";
		for(int i=word.length()-1;i>=0;i--) {
			
			revWord=revWord+word.charAt(i);
		}
		output=output+revWord+" ";
		
	}
	System.out.println(output);
	
 }

}
