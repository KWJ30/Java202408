package ex02;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person("이름1", 20); //Person 객체 생성
		
		person.introduce(); //메소드 호출
		person.walk();

		System.out.println("----------");
		
		Student student = new Student("이름2", 30, "아주대학교", "12345678"); //객체 생성
		
		student.introduce(); //메소드호출
		student.walk();
		student.study();
		
		System.out.println("----------");
		
		SalesMan sales = new SalesMan("이름3", 40, "삼성", 10000);
		
		sales.introduce();
		sales.walk();
		sales.work();
		
	}

}
