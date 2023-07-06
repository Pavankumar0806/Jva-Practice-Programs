package com.demo;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class MapExample {
	
	public static void main(String args[]){ 
		
		Map me = new HashMap();
		me.put(1, "pavan");
		me.put(2, "lokesh");
		me.put(7, "dhoni");
		me.put(3, "raina");
		
		System.out.println(me);
		
		Set set = me.entrySet();    //traversing
		Iterator itr=set.iterator(); 
		
		while(itr.hasNext()) {
			
		 Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" "+entry.getValue()); 
			
			
		}
			
			
		
		
	}
}
