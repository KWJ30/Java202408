package ex01;

class Animal{

	private String name;
	
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}
	
	void speak() {
		
	}
	
	void info() {
		System.out.println(name+"입니다.");
	}
	
}

public class MainAnimal {


	public static void main(String[] args) {

		Animal dog = new Animal("개");
		
		dog.info();
		
	}
		
}
