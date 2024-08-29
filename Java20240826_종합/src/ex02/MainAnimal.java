package ex02;

class Animal{

	private String name; //name = 동물; 멤버변수 or 인스턴스변수 . 생성된 객체들이 개별적으로 가지고 있음

	private static int count; //정적변수 or 클래스변수 (static). 공유자원
	
	public Animal() {
		this("동물");
		//this.name = "동물";
		count++;
	}
	
	public Animal(String name) {
		this.name = name;
		count++;
	}
	
	void speak() {
		
	}
	
	void info() {  //메소드 or 인스턴스메소드
		System.out.println(name+"입니다.");
		System.out.println(count);
	}
	
	static void staticInfo() {  //정적메소드 or 클래스메소드
		//name= "동물"; 에러. 인스턴스변수 사용불가
		count++;
		//info(); 에러. 인스턴스메소드 사용불가
	}
	
}

public class MainAnimal {


	public static void main(String[] args) {

		Animal dog = new Animal("개"); //객체생성 or 인스턴스생성
		
		dog.info();
		
		Animal cat = new Animal();
		
		cat.info();
		
		dog.staticInfo();
		
		dog.info();
		
		dog.info();
	}
		
}
