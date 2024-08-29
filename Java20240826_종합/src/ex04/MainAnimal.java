package ex04;

public class MainAnimal {

	public static void main(String[] args) {
	
		//상위클래스는 하위클래스를 참조할 수 있다. 
		//접근영역- 본인 클래스 또는 (본인 클래스의) 상위클래스만
		
		Animal an1 = new Animal();
		Animal an2 = new Dog();
		Animal an3 = new 진돗개();
		
		an1.info();
		an2.info(); //animal의 info 메소드를 쓴 것, 오버라이딩 된 게 호출됨
		an3.info();
		
		// Dog dog1 = new Animal(); 에러
		Dog dog2 = new Dog();
		Dog dog3 = new 진돗개();
		
		dog2.speak();
		dog3.speak();
		
		// 진돗개 jin1 = new Animal(); 에러
		// 진돗개 jin2 = new Dog(); 에러
		진돗개 jin3 = new 진돗개();
	
		jin3.func2();
		
		Animal an4 = new Dog();
		Dog dog4 = (Dog)an4;  //강제형변환
		dog4.info(); //Dog의 info메소드를 쓴 것
		
		Animal an5 = new 진돗개();
		진돗개 jin4 = (진돗개)an5; //강제형변환
		// an5.func2(); 에러
		jin4.func2();
	}

}
