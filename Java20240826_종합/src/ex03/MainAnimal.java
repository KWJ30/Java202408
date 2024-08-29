package ex03;

public class MainAnimal {

	public static void main(String[] args) {
		
        Animal animal = new Animal("동물");
        
        animal.info();
		
        Animal dog = new Dog("개", 5);
        
		dog.info();
		dog.speak();
		
		Animal cat = new Animal();
		
		cat.info();
		
		Animal cat1 = new Cat("고양이", 10);
		
		cat1.info();
		cat1.speak();
	}

}
