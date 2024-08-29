package ex05;

public class 진돗개 extends Dog{
	
	void func2() {System.out.println("메소드호출");}

	@Override
	void info() {
		super.info();
		System.out.println("진돗개 입니다.");}
		
	@Override
	void speak() {
		System.out.println("왈왈");
		}
	}

