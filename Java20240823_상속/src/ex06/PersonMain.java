package ex06;

public class PersonMain {

	public static void main(String[] args) {
		
		//상위클래스는 하위클래스를 참조가능하지만, 접근할 수 있는 영역은 상위클래스로 제한됨
		
		Person p = new Person();   
	
		//Student s1 = new Person(); 에러. s1은 Student 참조변수라 Student(하위)와 Person(상위)의 모든 정보를 사용가능
		//하지만 Person(상위)객체를 참조하면 Person정보 뿐이어서 기능이 제한됨.
		
		Person ps1 = (Person)new Student(); //자동타입변환
		
		Student ps2 = (Student) ps1; //강제타입변환, 자동변환된 걸 다시 변환할때만
	
	    // Student p1 = (Student) p; 컴파일에러가 아니라 빨간줄은 없지만 런타임에러가 발생함. 강제타입변환 불가
		
	}

}
