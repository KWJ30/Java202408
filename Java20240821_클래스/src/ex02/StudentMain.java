package ex02;

public class StudentMain {

	public static void main(String[] args) {
		//new Student() 객체(인스턴스)생성
		//Student() (디폴트생성자 또는 함수) 호출
		Student s1 = new Student();
		s1.info();
		
		Student s2 = new Student("차은우" , 30 , "012-3456-7890");
		
		s2.info();

		Student s3 = new Student("홍길동" , 20 , "010-1234-5678");
		
		s3.info();
		
		Student s4 = new Student("지리산");
	
		s4.info();
	
		Student s5 = new Student("내장산", 30);
		
		s5.info();
		
	}
	

}
