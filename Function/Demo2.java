package Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	
	Employee(String ename,int salary){
		
		this.ename=ename;
		this.salary=salary;
	}
}
public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList <Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee("Pavan",50000));
		emplist.add(new Employee("kalyan",30000));
		emplist.add(new Employee("lokesh",20000));
		
		Function<Employee,Integer> f1=e->{
			
			int sal=e.salary;
			
			if(sal>=10000 && sal<=20000)
				return(sal * 10/100);
			else if(sal>20000  && sal<=30000)
				return(sal * 20/100);
			else if(sal>30000  && sal<=50000)
				return(sal * 30/100);
			else 
				return(sal * 40/100);
			
		           };
		Predicate <Integer> p =b->b>5000;
		
		for(Employee emp:emplist) {
			int bonus=f1.apply(emp);
			
			if(p.test(bonus)){  //Predicate
			
			System.out.println(emp.ename+" "+emp.salary);
			System.out.println("Bonus is :"+bonus);
		}
	}}}
