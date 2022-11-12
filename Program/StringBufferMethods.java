package RowdyString;

public class StringBufferMethods {

	public static void main(String[] args) {
		
		//1st method APPEND
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" pavan");
		System.out.println(sb);
		
		//2nd method INSERT
		
		StringBuffer sb1 = new StringBuffer("pavan");
		
		sb1.insert(2,"java");
		System.out.println(sb1);
		
		//3rd method
		StringBuffer sb2 =new StringBuffer("Hello");  
		sb2.replace(1,3,"Java");  
		System.out.println(sb2);
		
		//4th method DELETE
		StringBuffer sb4=new StringBuffer("Hello");  
		sb4.delete(1,3);  
		System.out.println(sb4);
		
		//5th method REVERSE
		StringBuffer sb5 =new StringBuffer("pavan");  
		sb5.reverse();  
		System.out.println(sb5);
		
		//6th method CAPACITY
		StringBuffer sb6 =new StringBuffer();  
		System.out.println(sb6.capacity());//default 16 
		
		sb6.append("Hello");  
		System.out.println(sb6.capacity());//now 16  
		
		sb6.append("java is my favourite language");  
		System.out.println(sb6.capacity()); 

	}

}
