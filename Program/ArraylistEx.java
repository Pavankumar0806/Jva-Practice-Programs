package Ramsethu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEx {
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add("Pavan");
		arr.add("pavan");
		arr.add("mani");
		arr.add("Ajay");
		arr.add("Sai");
		
		int arr1=arr.size();
		System.out.println(arr1);
		System.out.println(arr);
		ArrayList arr2 = new ArrayList();//adding some names
		
		arr2.addAll(arr);
		arr2.add("pk");
		System.out.println(arr2);
		
		Collections.sort(arr);//SORTING
		System.out.println(arr);
	}}
		



