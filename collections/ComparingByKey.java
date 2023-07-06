package com.demo;
import java.util.Map;
import java.util.Comparator;
import java.util.HashMap;


public class ComparingByKey {
	
	public static void main(String args[]){ 
	
	Map<Integer,String> map=new HashMap<Integer,String>();          
    map.put(10,"a");    
    map.put(20,"b");    
    map.put(30,"c");   
    
           
//    map.entrySet().stream().sorted(Map.Entry.comparingByKey()) 
//    .forEach(System.out::println);
    map.entrySet()
    .stream()  
    
    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())) 
    //ekkada comparatr.reverseOrder() isthe decending order lo print cheyochu
    
    .forEach(System.out::println);  
}  
}


