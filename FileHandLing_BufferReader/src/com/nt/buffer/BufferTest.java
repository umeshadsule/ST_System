package com.nt.buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferTest {

	public static void main(String[] args) throws Exception {

//Create File		
		
		/*  try {
		      File myObj = new File("E:\\test.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }*/
		  
//Read File	
		
	File file=new File("E:\\test.txt");
	BufferedReader br = new BufferedReader(new FileReader(file)); 
	 String st; 
	  while ((st = br.readLine()) != null) 
	    System.out.println(st); 
	  
	  
//Write into File

try {
    FileWriter myWriter = new FileWriter("filename.txt");
    myWriter.write("Files in Java might be tricky, but it is fun enough!");
    myWriter.close();
    System.out.println("Successfully wrote to the file.");
  } catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }
}
}

