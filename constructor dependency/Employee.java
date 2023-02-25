package cm.sprin.java;

public class Employee {
	
	int empid;
	String Empname;
	Address address;
	
	public Employee(int empid, String empname,Address address) {
		super();
		this.empid = empid;
		Empname = empname;
		this.address=address;
	}
	public void showdetails() {
		System.out.println(empid+"  "+Empname);
		System.out.println(address.toString());
	}}
