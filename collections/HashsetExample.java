package com.demo;
import java.util.*;
public class HashsetExample {

	public static void main(String[] args) {
		
		 HashSet<String> hs = new HashSet<String>();
		  
	        // Adding elements using add() method
	        hs.add("Geek");
	        hs.add("For");

	        hs.add("Geeks");
	        hs.add("Geeks");
	        hs.add("nbk");
	  
	        // Printing all string el=ntries inside the Set
	        System.out.println( hs);
	        
	       // hs.remove("For");
	       //System.out.println(hs);
	        
	        Iterator itr = hs.iterator();
	        
	        while (itr.hasNext())
	            System.out.print(itr.next() + ", ");
	}

}
