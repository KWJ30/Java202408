package ex01;

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

class AppleBox{
	private Apple ap;

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
}

class OrangeBox{
	private Orange or;

	public Orange getOr() {
		return or;
	}

	public void setOr(Orange or) {
		this.or = or;
	}
}

public class FruitAndBox {

	public static void main(String[] args) {

		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.setAp(new Apple());
		oBox.setOr(new Orange());
		
		Apple ap = aBox.getAp();
		Orange or = oBox.getOr();
		
		System.out.println(ap);
		System.out.println(or);
		
	}

}
