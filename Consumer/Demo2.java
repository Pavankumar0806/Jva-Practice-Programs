package Consumer;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

class Employee{
	String ename;
	int salary;
	String gender;
	
	Employee(String ename,int salary,String gender){
		this.ename=ename;
		this.salary=salary;
		this.gender=gender;
	}}
public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		
		emplist.add(new Employee("pavan",50000,"male"));
		emplist.add(new Employee("lokesh",30000,"male"));
		emplist.add(new Employee("purna",20000,"female"));
		emplist.add(new Employee("nani",60000,"male"));
		
		//Function
		Function<Employee,Integer> f=emp->(emp.salary*10)/100; //task1
		
		//Predicate
		Predicate<Integer> p=b->b>=5000;
		
		//Consumer
		Consumer <Employee> c=emp->{
			System.out.println(emp.ename);
			System.out.println(emp.salary);
			System.out.println(emp.gender);           
		}; //task 3
		for(Employee e:emplist) {
			int bonus=f.apply(e); //calculate bonus invoked function
			
			if(p.test(bonus)) { //invoked predicate
				c.accept(e); //invoke consumer
				System.out.println("Employee bonus:"+bonus);
			}
		}
		
	}}
