package com.demo;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
	
	public static void main(String [] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(100, "purna");
		map.put(105, "raju");
		map.put(103, "Adhikari");
		
		
		//System.out.println(map);
		//System.out.println(map.remove(100));//remove
		
		  
		
		
	//	map.clear();             //to remove all
//	System.out.println(map);
		
	//map.size();
	//System.out.println(map);
		
//		for (Integer i : map.keySet()) {
//			  System.out.println(i);
//			}                                //to print only keys
		
//		for(Map.Entry m :map.entrySet()) {  //iteratio
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		
		for(String i : map.values()) {  // to print only values
			System.out.println(i);
		}
		
	}

}
