package ex06;

public class Person {

	String name;
	int age;
	
	public Person() {
////		
////		//this.name = null;
////		//this.age = 0;
////		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	
	}

	public void introduce() {
		System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
	}
	
	public void walk() {
		System.out.println(name + "이(가) 걷고 있습니다.");
	}
}
