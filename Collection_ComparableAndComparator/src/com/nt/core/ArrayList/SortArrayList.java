package com.nt.core.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

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
	public int compareTo(Movie  m) {
		
		return this.year-m.year;
	}
	
	
}

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie("star",1997));
		list.add(new Movie("war",2015));
		Collections.sort(list);
		
		
		for(Movie m:list) {
			System.out.println(m.name+"::year::"+m.year);
		}
		
		

	}

}
