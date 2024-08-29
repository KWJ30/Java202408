package ex08;

public class Item {

	private String name; //이름
	private int price; //가격
	
	Item(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
	
	void print() {
		System.out.println("이름:"+name+", 가격:"+price);
	}
}
