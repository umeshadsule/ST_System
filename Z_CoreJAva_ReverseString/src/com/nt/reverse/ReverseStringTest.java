package com.nt.reverse;

public class ReverseStringTest {

	public static void main(String[] args) {
		
		System.out.println("Using char Array ");
		String s="core java";
		String s1="";
		 char[] ch=s.toCharArray();
		System.out.println("t");
		for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
		
		}	
		System.out.println();
		
		
		System.out.println("****************************");
		
		System.out.println("using String charAt()");
		
		String s2="";
		String s3="mava";
		for(int k=s3.length()-1;k>=0;k--) {
			s2=s2+s3.charAt(k);
		
		}
		System.out.println(s2);
		}

	}

