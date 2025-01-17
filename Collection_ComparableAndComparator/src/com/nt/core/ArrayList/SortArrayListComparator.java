package com.nt.core.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie1 implements Comparable<Movie1> {
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


	public Movie1(String name, int year) {
		this.name=name;
		this.year=year;
	}


	@Override
	public int compareTo(Movie1 m) {
		// TODO Auto-generated method stub
		return this.year-m.year;
	}


	
	
	
}

class SortByName implements Comparator<Movie1>{

	@Override
	public int compare(Movie1 m, Movie1 m2) {
		
		return m.getName().compareTo(m2.getName());
	}
	
	
}

public class SortArrayListComparator {

	public static void main(String[] args) {
		ArrayList<Movie1> list=new ArrayList<Movie1>();
		list.add(new Movie1("zar",1974));	
		list.add(new Movie1("zar",1975));
		SortByName sortbyname=new SortByName();
		Collections.sort(list,sortbyname);
		Collections.sort(list);
		
		
		for(Movie1 m:list) {
			System.out.println(m.name+"::year::"+m.year);
		}
		
		

	}

}
