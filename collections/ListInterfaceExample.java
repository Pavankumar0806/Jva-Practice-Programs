package com.demo;
import java.util.*;
public class ListInterfaceExample {

	public static void main(String[] args) {
	
		List<String> al = new ArrayList<>();
		 
        // Adding elements to object of List interface
        
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");
 
        
      //  System.out.println(al);
        al.set(1, "For");
        
        // Print and display the updated List
        System.out.println( al);

	}

}
