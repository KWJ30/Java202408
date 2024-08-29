package ex06;

//final class Student -> Student 클래스 상속불가

public class Student extends Person{

	
	private String school;
	private String studentID; //학번 //필드선언
	
	 public Student() {super();} //마찬가지로 기본생성자 및 상위클래스 생성자 생략가능(자동생성)
	
//    public Student(String school, String studentID) {
//		super();
//    	this.school = school;
//		this.studentID = studentID; //생성자선언
//	}
    
    public Student(String name, int age, String school, String studentID) {
    	super(name,age); //상위클래스 생성자 호출
		this.school = school;
		this.studentID = studentID; //생성자선언
	}
	
    @Override // 어노테이션, 상위클래스 메소드를 하위클래스가 재정의 //오타치면 잡아줄 수 있음
    public void introduce() {  //메소드선언
    	super.introduce();
    	//System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
        System.out.printf("학교는 %s이고, 학번은%s 입니다.\n", school, studentID);	
        
    }
    
  
    
    public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
   
}
	
	
	

