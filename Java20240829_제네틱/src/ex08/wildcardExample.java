package ex08;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class wildcardExample {
    // 메서드에서 ? extends Animal 와일드카드를 사용하여 Animal의 서브타입을 처리할 수 있습니다.
    public static void printAnimalSounds(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound(); // Animal의 서브타입인 Dog, Cat 모두 사용 가능
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        // Dog와 Cat 리스트를 모두 처리할 수 있습니다.
        printAnimalSounds(dogs); // 출력: Bark
        printAnimalSounds(cats); // 출력: Meow
    }
}
