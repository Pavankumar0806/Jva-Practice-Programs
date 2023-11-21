package Mapinterface;
import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm1 = new HashMap<Integer, String>(); 
        

    // Inserting the Elements 
    hm1.put(1, "pk"); 
    hm1.put(2, "good"); 
    hm1.put(3, "Geeks"); 
    
    Map<Integer, String> hm2 = new HashMap<Integer, String>(); 
//    
//
//    // Inserting the Elements 
   hm2.put(6, "kk"); 
    hm2.put(10, "divi"); 
    hm2.put(30, "ram"); 

    System.out.println( hm1); 
//    for(String i : hm1.values()) {  // to print only values
//		System.out.println(i);
//	}
//
//    for (Integer i : hm1.keySet()) {
//		  System.out.println(i);
//		}                                //to print only keys
    
    // hm1.put(2, "good");
    // hm1.remove(1,"pk");
   
    //hm1.clear();                //clear method
    
    //System.out.println(hm1.containsKey(4));       //contains key method
    
   // System.out.println( hm1.containsValue("pk"));  //contains value method
    
   // System.out.println(hm1.entrySet());
    
   // System.out.println("Equality: " + hm1.equals(hm2));       //equals method
    
   // System.out.println("the key is :" +hm1.get(2));   //getting value of 2
    
   // System.out.println("the value is :" +hm1.get("pk"));  ///getting value of pk
    
//    Map<String, String> map = new HashMap<>(); 
//    
//    System.out.println(map); 

   // System.out.println(map.isEmpty());       //is empty method
    
   // System.out.println(hm1.isEmpty());
    
//    Set<Integer> s = new HashSet<>();       //keyset method
//    s = hm1.keySet(); 
//    System.out.println(s); 
    
    hm1.putAll(hm2);                //put all method merging
    System.out.println(hm1);
   
} 

	}


