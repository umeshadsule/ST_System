package com.nt.java;

public class Test {

	public static void main(String[] args) {
		String s="core java";
		String[] words;
		words=s.split(" ");
		
		for(String word:words) {
			String rev=" ";
			int l=word.length()-1;
			for(int i=l;i>=0;i--) {
				
				rev=rev+word.charAt(i);
				
			}
			System.out.print(rev);
			
		}

	}

}
