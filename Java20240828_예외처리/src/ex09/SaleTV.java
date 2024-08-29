package ex09;

public class SaleTV extends TV{

	private int price;
	
	SaleTV(){}
	SaleTV(String model,int size,int channel,int price){
		super(model,size,channel);
		this.price = price;
	}
	
	public void play() {System.out.printf("판매TV 채널 %d번의 프로를 플레이 합니다.\n", getChannel());}
	public void sale() {System.out.printf("%s 모델의 상품을 판매합니다. %,d원을 지불해 주세요.\n",getModel(),price);}
	
	@Override
	public String toString() {return String.format("판매상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)",getModel(),price,getSize());}

	
}
