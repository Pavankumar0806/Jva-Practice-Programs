package Bhapu;

import java.util.HashSet;

public class HashsetExample3 {
	public static void main(String[] args) {
		HashSet stt=new HashSet();
		
		stt.add("Bjp");
		stt.add("congress");
		stt.add("tdp");
		stt.add("Bjp");
		
		System.out.println(stt);
      
		HashSet stt1=new HashSet();
		stt1.add("pk");
		stt1.add("lokesh");
		stt.addAll(stt1);
		System.out.println(stt);
	}}
