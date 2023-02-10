package Function;

import java.util.function.Function;

public class Demo1 {
	public static void main(String[] args) {
		Function<Integer,Integer> f=n->n*n;
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(3));
		
		//String length
		
		Function<String,Integer> fn=s->s.length();
		System.out.println(fn.apply("Pavan"));
		System.out.println(fn.apply("java program"));
		
	}}
