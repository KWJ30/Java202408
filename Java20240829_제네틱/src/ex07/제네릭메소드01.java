package ex07;

class Box<T>{ // 제네릭 타입(클래스,인터페이스)
	private T obj;

	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
}

class BoxFactory{
	//제네릭메소드
	public static <T> Box<T> markBox(T o){ // <T> : 타입 파라미터 정의. 
		                //Box<T> : 리턴타입. markBox(T o) : 메소드명과 매개변수(들)
		Box<T> box = new Box<T>();
		box.setObj(o);
		return box;
	}
}

public class 제네릭메소드01 {

	public static void main(String[] args) {
		
		Box<String> sBox = BoxFactory.markBox("Sweet"); //제네릭메소드 호출
		System.out.println(sBox.getObj());
		
		Box<Integer> iBox = BoxFactory.markBox(10);
		System.out.println(iBox.getObj());

	}

}
