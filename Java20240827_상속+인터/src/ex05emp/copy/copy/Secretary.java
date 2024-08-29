package ex05emp.copy.copy;

public class Secretary extends Employee {

	public Secretary(){}
	public Secretary(String name, int number, String department, int salary){
		super(name,number,department,salary);
	}
	
	@Override
	public double tax() {return getSalary()*0.1;}
	
	@Override
	public void incentive(int pay) {
		setSalary((getSalary()+(int)(0.8*pay)));
	}
	
	
	
	
	
}
