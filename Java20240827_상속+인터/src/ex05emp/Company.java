package ex05emp;

public class Company {

	public static void main(String args[]) {
	 
//		Employee [] emp = new Employee [2];
//		emp [0] = new Secretary("Duke",1,"Secretary",800);
//		emp [1] = new Sales("Tuxi",2,"sales",1200);// Employee 배열에 객체들을 생성하여 저장한다.
//		Secretary secretary = (Secretary) emp[0];
//		Sales sales = (Sales) emp[1];
		
		Secretary secretary = new Secretary("Duke", 1, "Secretary", 800);
		Sales sales = new Sales("Tuxi", 2, "sales", 1200);
		
		Employee[] emp = {secretary, sales};	
		
		printEmployee(emp,true);// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보를 출력한다.
		// 이 때는 세금을 출력하지 않는다.
		secretary.incentive(100);
		sales.incentive(100);
		// 모든 직원에게 인센티브로 100씩 지급한다.(직원에 따라 적용되는 인센티브 금액은
		// 다르다.
		Company.printEmployee(emp, false);
		// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보
		// 와 세금을 출력한다.
	}
	
	public static void printEmployee(Employee[] emp, boolean isTax) {

		if(isTax) {
			System.out.println("name     department        salary     extra pay");
			System.out.println("-----------------------------------------");
			
			for(Employee emps : emp) {
				System.out.printf("%s\t %8s\t %8d\t %.1f\n",
						emps.getName(), emps.getDepartment(), emps.getSalary(),emps.getExtraPay());				
			}
			
			System.out.println();
			
		}else {
			System.out.println("name     department          salary        tax            extra pay");
			System.out.println("-----------------------------------------");
			for(Employee emps : emp)
				System.out.printf("%s\t %8s\t %8d\t %8.1f\t %8.1f\n",
						emps.getName(), emps.getDepartment(),emps.getSalary(),emps.tax(),emps.getExtraPay());			
		
		}
	}
		// 객체의 정보를 출력한다.(실행 결과를 참조)
		// isTax 의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다.
}