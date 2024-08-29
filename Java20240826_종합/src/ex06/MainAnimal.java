package ex06;

public class MainAnimal {

	public static void main(String[] args) {
	
		// Animal an = new Animal(); 에러. 추상클래스에서 객체생성불가
		
		Dog dog = new Dog("개",5);
		dog.speak();
		dog.info();
		Cat cat = new Cat("고양이",10);
		cat.speak();
		cat.info();
		Cow cow = new Cow();
		cow.speak();
		
		speakTest(dog);
		speakTest(new Cat());
		speakTest(new Cow());
		
	}

	static void speakTest(Animal an) {
		an.speak();
	}
	
}
