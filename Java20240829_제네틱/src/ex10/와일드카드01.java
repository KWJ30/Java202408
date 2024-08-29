package ex10;

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
			return obj.toString();
		}
}

class BoxFactory{
	//와일드카드 상한 제한
	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
	
}

public class 와일드카드01 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = new Box();
		ibox.setObj(10);
		BoxFactory.peekBox(ibox);
		
		Box<Double> dbox = new Box();
		dbox.setObj(10.0);
		BoxFactory.peekBox(dbox);
		
//		Box<String> sbox = new Box();
//		sbox.setObj("글자는안됨");
//		BoxFactory.peekBox(sbox);
		
		Box<Float> fbox = new Box();
		fbox.setObj(10.0f);
		BoxFactory.peekBox(fbox);
		
	}

}
