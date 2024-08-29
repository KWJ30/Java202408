package ex05emp;

public class Sales extends Employee implements Bonus{

	public Sales(){}
	public Sales(String name, int number, String department, int salary){
		super(name,number,department,salary);
	}
	
	@Override
	public double tax() {return getSalary()*0.13;}
	
	@Override
	public void incentive(int pay) {
		setSalary((getSalary()+(int)1.2*pay));
	}
	
	@Override
	public double getExtraPay() {return getSalary()*0.03;}

}
