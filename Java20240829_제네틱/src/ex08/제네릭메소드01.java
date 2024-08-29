package ex08;

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
	public static <T extends Number> Box<T> markBox(T o){ // <T> : 타입 파라미터 정의. 
		                //Box<T> : 리턴타입. markBox(T o) : 메소드명과 매개변수(들)
		Box<T> box = new Box<T>();
		box.setObj(o);
		return box;
	}
}

public class 제네릭메소드01 {

	public static void main(String[] args) {
		
//		Box<String> sBox = BoxFactory.markBox("Sweet"); //제네릭메소드 호출
                                           //<T extends Number> 이므로 에러
		
		Box<Integer> iBox = BoxFactory.markBox(10);
		System.out.println(iBox.getObj());
		
		Box<Integer> IBox = BoxFactory.markBox(new Integer(1000)); //그냥 1000 써도 된다는 뜻. 자동변환(오토박싱)
		System.out.println(IBox.getObj());
		
		Box<Double> dBox = BoxFactory.markBox(10.0); //여기 10쓰면 integer 로 오토박싱. 에러
		System.out.println(dBox.getObj());
		
		Box<Double> DBox = BoxFactory.markBox(new Double(10)); //10을 Double 로 박싱.
		System.out.println(DBox.getObj());
		

	}

}
