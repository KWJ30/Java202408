package ex03;

class Apple{
	@Override
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am an orange";
	}
}

class Box<T>{  //제네틱 기반의 클래스 정의
	private T obj;
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class FruitAndBox {

	public static void main(String[] args) {

//		Box aBox = new Box(); 
//		aBox.setObj(new Apple());
//		Apple ap = (Apple)aBox.getObj(); 
//		System.out.println(ap);
		
		Box<Apple> aBox = new Box<>();  //Box<T> 의 T자리에 Apple 이 들어감
		aBox.setObj(new Apple());
		Apple ap = aBox.getObj();   // 형변환 필요없음
		System.out.println(ap);

//		aBox.setObj("new Apple()"); 에러
		
		Box<Orange> oBox = new Box<>();
		oBox.setObj(new Orange());
		Orange or = oBox.getObj();
		System.out.println(or);
		
		Box<Integer> a = new Box<>(); //기본타입은 래퍼클래스로. 객체형태로 다룰 수 있게
		a.setObj(12345);
		System.out.println(a.getObj());
		
		Box<String> b = new Box<>(); //java 에서 기본제공하는 클래스인 String
		b.setObj("제네릭");
		System.out.println(b.getObj()); 
		
		// Box<Number> c = new Box<Short>();
		
	}

}
