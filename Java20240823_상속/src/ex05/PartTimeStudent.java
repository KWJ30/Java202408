package ex05;

public class PartTimeStudent extends Student{

	String job;
	int pay;

	public PartTimeStudent() {
		super();
	}             //생략가능(자동생성<-생성자 없을때). 기본생성자 및 상위클래스 기본생성자(<-얘는 하위클래스의 생성자마다 자동생성되기는 함.)
	
	public PartTimeStudent(String name, int age, String school, String studentID, String job, int pay) {
		super(name,age,school,studentID);
		this.job = job;
		this.pay = pay;
	}
	
	@Override // 어노테이션, 상위클래스 메소드를 하위클래스가 재정의 //오타치면 잡아줄 수 있음
	public void introduce() {
		super.introduce();
		//System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
		System.out.printf("제 알바는 %s이고, 급여는 %d 입니다.\n", job, pay);
	}
	
	public void work() {
		System.out.println(name + "이(가) 근무 중 입니다.");
	}
}
