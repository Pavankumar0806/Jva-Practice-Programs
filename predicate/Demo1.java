package predicate;

import java.util.function.Predicate;

public class Demo1 {
	public static void main(String[] args) {
		//EXAMPLE 1
		
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(20));
		System.out.println(p.test(5));
		
		//EX 2 :check the given length is greater than 4 or not
		
		Predicate<String> pp = s->(s.length()>4);
		System.out.println(pp.test("pavan"));
		System.out.println(pp.test("ram"));
		
		//EX 3 :Print array elements whose size is>4 from array
		String names[]= {"Ram","Pavan","Lokesh","Pratap"};
		
		for(String name:names) {
			if(pp.test(name)) {
				System.out.println(name);
			}
			//if(name.length()>4){
			//System.out.println(name);
			//}
		}}}
