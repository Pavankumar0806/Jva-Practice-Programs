package Mehods;

public class StringMehodsEx {

	public static void main(String[] args) {

		//String s = "Pavan";                        //upper case and lowercase mehods
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
		
//---------------------------------------------------------
//		String s = " Pavan ";                  //Trim method
//		System.out.println(s.trim());
		//-------------------------------------------------------------
		
//		String s ="Pavan";                  //charAt method
//		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(4));
		//---------------------------------------------------------
//		String s = "Pavan";                  //length method
//	System.out.println(s.length());
		//------------------------------------------------------------------
		
//		String a= "cc";                    //valueOff method
//		String s= String.valueOf(a);
//		System.out.println(a+s);
		//-------------------------------------------------
		
//		String s = "pavan is good boy";            //replace method
//		System.out.println(s.replace("good","bad"));
		
//		StringBuffer s = new StringBuffer("jack");  //append method
//		System.out.println(s.append(" sparrow"));
//-----------------------------------------------------------
//		 String str = "Welcome to Javatpoint portal";      //printing odd letters     
//	        for (int i=0; i<=str.length()-1; i++) {  
//	            if(i%2!=0) {  
//	                System.out.println("char at "+i+" place "+str.charAt(i));  
//	            }  
//	        }  
		//-----------------------------------------
//		String s1="hello";                    //compareTo method
//		String s2="hello";  
//		String s3="meklo";  
//		String s4="hemlo";  
//		String s5="flag";  
//		System.out.println(s1.compareTo(s2)); 
//		System.out.println(s1.compareTo(s3));  
//		System.out.println(s1.compareTo(s4));  
//		System.out.println(s1.compareTo(s5));
		//-----------------------------------------------------------
//		String s ="pavan";                          //concat method
//		System.out.println(s.concat("divi"));
		//--------------------------------------------
//		String name="what do you know about me";     //contains method
//		System.out.println(name.contains("do you know"));  
//		System.out.println(name.contains("about"));  
//		System.out.println(name.contains("hello"));  
		//------------------------------------------------------
//		String s1="java by javatpoint";  //endsWith method
//		System.out.println(s1.endsWith("t"));  
//		System.out.println(s1.endsWith("point"));  
		//--------------------------------------------
//		String s1="javatpoint";  //equals method
//		String s2="javatpoint";  
//		String s3="JAVATPOINT";  
//		String s4="python";  
//		System.out.println(s1.equals(s2));//true because content and case is same  
//		System.out.println(s1.equals(s3));//false because case is not same  
//		System.out.println(s1.equals(s4));//false because content is not same  
 //------------------------------------------------------------------
//		String s1="javatpoint";  //equalsIgnoreCase method
//		String s2="javatpoint";  
//		String s3="JAVATPOINT";  
//		String s4="python";  
//		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
//		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
//		System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
		//--------------------------------------------------------------------
//		String str = new String("Welcome to JavaTpoint").intern(); // statement - 1 intern method  
//		String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2  
//		System.out.println(str1 == str); // prints true
		//-------------------------------------------------------
//		String s1="";             //isEmpty method
//		String s2="javatpoint";  
//		  
//		System.out.println(s1.isEmpty());  
//		System.out.println(s2.isEmpty()); 
		//------------------------------------------------------------------
//		String joinString1=String.join("-","welcome","to","javatpoint");  //join method 
//		System.out.println(joinString1);
		//-------------------------------------------------------------------
//		String str = "This is index of example";  //lastIndexOf
//		System.out.println(str.lastIndexOf('s'));
//        System.out.println(str.lastIndexOf('s',5));
        //---------------------------------------------------
//		String s1="java string split method by javatpoint";  //split method
//		String[] words=s1.split("\\s");//splits the string based on whitespace  
//		//using java foreach loop to print elements of string array  
//		for(String w:words){  
//		System.out.println(w);}  
	//-------------------------------------------------------------------
		String s1="java string split method by javatpoint";  //startsWith  
		System.out.println(s1.startsWith("ja"));  
		System.out.println(s1.startsWith("java string"));  
		System.out.println(s1.startsWith("Java string"));  
		//------------------------------------------------------------------
	}

}
