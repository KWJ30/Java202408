package ex12;

class A{}
class B extends A{}
class C extends B{}

class Box<T>{ // 제네릭 타입(클래스,인터페이스)
	private T obj;

	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	@Override
		public String toString() {
		if (obj == null) {
            return "Box is empty";
        }
			return obj.toString();
		}
}

class BoxFactory{
	//와일드카드 하한 제한
	//set 만 가능. 저장용도
	public static void peekBox(Box<? super B> box) {
		System.out.println(box);
	}
	
}

public class 와일드카드01 {

	public static void main(String[] args) {
		
		Box<A> a = new Box();
		Box<B> b = new Box();
//		Box<C> c = new Box();
		
		BoxFactory.peekBox(a); 
		BoxFactory.peekBox(b);
//		BoxFactory.peekBox(c); C는 B의 상위클래스가 아님
		
	}

}
