package ex05;

public class PersonMain {

	public static void main(String[] args) {
		
		//상위클래스는 하위클래스를 참조가능하지만, 접근할 수 있는 영역은 상위클래스로 제한됨
		
		Person p = new Person();   
		
		Person ps1 = (Person)new Student(); //자동타입변환
		
		Person pps1 = (Person)new PartTimeStudent(); 
		
	}

}
