package com.nt.comparable;

import java.util.Collections;
import java.util.TreeSet;

public class A {

	public static void main(String[] args) {
		TreeSet<Student> ts=new TreeSet<Student>();
		
		
  ts.add(new Student(10,111));
  ts.add(new Student(111,120));
  for(Student ts2:ts) {
  System.out.println(ts2);
  }
	}
       
}


class Student implements  Comparable{
	int balance;
	int accno;
	
	

	public Student(int balance, int accno) {
		
		this.balance = balance;
		this.accno = accno;
	}



	@Override
	public String toString() {
		return "Student [balance=" + balance + ", accno=" + accno + "]";
	}



	@Override
	public int compareTo(Object o) {
		
		return 0;
	}

	}