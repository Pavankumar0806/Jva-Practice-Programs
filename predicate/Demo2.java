package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	int experience;
	
	Employee(String name,int sal,int exp){
		ename=name;
		salary=sal;
		experience=exp;
	}
}
public class Demo2 {

	public static void main(String[] args) {
		//EX 1
	Employee emp = new Employee("pavan",40000,5);
	
	//emp obj --.return name of the emplo if sal>30k  exp>3
	Predicate<Employee> pr=e->(e.salary>30000 && e.experience>3);
	System.out.println(pr.test(emp));
	
	//EX 2:
	ArrayList<Employee> al=new ArrayList<Employee>();
	al.add(new Employee("pavan",50000,5));
	al.add(new Employee("lokesh",30000,3));
	al.add(new Employee("ram",20000,2));
	al.add(new Employee("kalyan",40000,6));
	
	for(Employee e:al) {
		if(pr.test(e)) {
			System.out.println(e.ename+" "+e.salary);
		}}}}
