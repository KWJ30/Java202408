package ex07;

public class BookEx {

	public static void main(String[] args) {
		
    Book 책 = new Book();
		
		책.제목 = "모두의 딥러닝";
		책.저자 = "조태호";
		책.가격 = 24000;
		책.재고수량 = 10;
		
		책.판매(5);
		책.판매(15);
		책.판매(25);
		책.재고추가(10);
		책.판매(25);
		책.재고추가(10);
		책.판매(25);
		책.총판매금액();
		책.info();
	}

}

class Book {

	String 제목;
	String 저자;
	int 가격,재고수량;
	
	int 누적판매수량;
	
	void 판매(int a) {if(a>재고수량) {System.out.printf("재고수량을 초과합니다. 재고수량:%d 판매수량:%d\n",재고수량,a);}
	else {재고수량-=a; 누적판매수량+=a;}}
	void 재고추가(int a) {재고수량+=a;}
	void 총판매금액() {System.out.println("총판매금액:"+가격*누적판매수량);}
	
	void info() {System.out.printf("제목:%s, 저자:%s, 가격:%d, 재고수량:%d", 제목,저자,가격,재고수량);}
	
}
