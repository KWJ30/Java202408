package ex01;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person("홍길동", 20); //Person 객체 생성
		
		person.introduce(); //메소드 호출
		person.walk();

		System.out.println("----------");
		
		Student student = new Student("홍길동", 20, "아주대학교", "12345678");
		
		student.introduce();
		student.walk();
		student.study();
		
		System.out.println("----------");
		
		SalesMan sales = new SalesMan("홍길동", 20, "삼성", 10000);
		
		sales.introduce();
		sales.walk();
		sales.work();
		
	}

}
