package ex06;

interface Aable{};

class B implements Aable{};

class C {};

class Box<T extends Aable>{ //T 전달은 인터페이스 Aable의 구현클래스만 전달가능. 
	              //즉 뒤에 implements Aable 이 붙어있거나 그런 클래스의 하위클래스만.
	private T obj;

	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class 인터페이스구현 {

	public static void main(String[] args) {
		
		Box<B> bBox = new Box();
		Box<Aable> aBox = new Box();
//		Box<Integer> iBox = new Box(); 에러.
		
//		Box<C> cBox = new Box(); 에러.

	}

}
