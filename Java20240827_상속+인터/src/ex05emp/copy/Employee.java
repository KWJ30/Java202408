package ex05emp.copy;

public abstract class Employee {
	
	private String name;
	private int number;
	private String department;
	private int salary;
	
	Employee(){}
	Employee(String name, int number, String department, int salary){
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	double tax() {return 0;}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int a) {
		this.salary = a;
	}
	public double getExtraPay() {
		return 0;
	}
	
}
