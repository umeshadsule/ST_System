package com.nt.core.Treeet;

import java.util.TreeSet;



class Movie implements Comparable<Movie>{
	String name;
	int year;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public Movie(String name, int year) {
		this.name=name;
		this.year=year;
	}


	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return this.year-m.year ;
	}


	
	
}



public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Movie> ts =new TreeSet<Movie>();
		/*ts.add("a");
		ts.add("C");
		ts.add("B");
		ts.add("4");
		System.out.println(ts);
*/
		
		ts.add(new Movie("war",1999));
		ts.add(new Movie("bar",1997));
		//ts.comparator();
		
		for(Movie m:ts) {
			System.out.println(m.name+"::Year::"+m.year);
			
		}
		}

}