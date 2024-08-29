package ex02;

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

class Box{
	private Object obj;
	
	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class FruitAndBox {

	public static void main(String[] args) {

		Box aBox = new Box(); //사과박스
		Box oBox = new Box(); //오렌지박스
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Apple ap = (Apple)aBox.getObj(); //형변환 해줘야함
		Orange or = (Orange)oBox.getObj();
		
		System.out.println(ap);
		System.out.println(or);
		
		aBox.setObj("new Apple()"); // 따옴표 잘못 침
		
		//Apple ap2 = (Apple)aBox.getObj(); //에러. String 이므로
				
		//System.out.println(ap2);
		
		System.out.println(aBox.getObj()); //이건 에러없이 출력됨 - 추후 문제 생길 수 있음
		
	}

}
