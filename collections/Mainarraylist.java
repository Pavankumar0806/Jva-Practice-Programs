package com.demo;

import java.util.*;



public class Mainarraylist {

	public static void main(String[] args) {
		
		ArrayList<String> li = new ArrayList<String>();
		
		li.add("pavan");
		li.add("nani");
		li.add("ntr");
		
		//System.out.println(li);
		//li.add(1,"for");             //adding
		
		ArrayList la = new ArrayList();
		
		la.addAll(li);
		la.add("nbk");
		la.add("rocky");
		//---------------------different methods------------------
		//la.remove(2);
		  la.remove("nani");
		  
		  for (String str : li)
	            System.out.print(str + " ");
		//System.out.println(la);
		
		
		Collections.sort(la);
		//System.out.println(la);
		
		
	}

}
