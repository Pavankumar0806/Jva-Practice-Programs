package com.demo;

import java.util.Map;
import java.util.Comparator;
import java.util.HashMap;

public class CompareByKey {
	
	public static void main(String args[]){  
		Map<Integer,String> map=new HashMap<Integer,String>();          
		      map.put(100,"Amit");    
		      map.put(101,"Vijay");    
		      map.put(102,"Rahul");    
  
		      map.entrySet() .stream()  
		      
		      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
//decending order kavalantey  Comparator.reverseOrder() evvali
		    
		      .forEach(System.out::println);  
		 }  

}
