package ex03;

class Student{ //클래스 여러개 가능하지만 보통은 1개씀(이름중복x)
    //클래스명 첫글자는 대문자, 변수 및 함수는 소문자
private String name;
private int age;	
private String phone;  //필드선언

/*void infoAge(int age) {
if(age>0 && age<120) {
나이 = age;}
else {System.out.println("0~120 숫자입력할것");
}
}*/

Student(){ //디폴트 생성자
	System.out.println("디폴트 생성자 호출");
}

Student(String n)
{
	//name = n;
	//age = 10;
	//phone = "000-0000-0000";
	this(n,10,"000-0000-0000");} //다른 생성자 호출

Student(String n, int a)
{
//	name = n;
//	age = a;
//	phone = "000-0000-0000"
	this(n,a,"000-0000-0000");;
}

Student(String name, int age, String phone)
{
	this.name = name;
	this.age = age;
	this.phone = phone; //this.phone은 필드로서의 phone
}


void info() {
System.out.printf("이름 : %s, 나이: %d, 전화번호:%s\n", name, age, phone);
}

void 입실() {
System.out.println("입실하다.");
}

void 퇴실() {
System.out.println("퇴실하다.");
}

void 조퇴() {
System.out.println("조퇴하다");
}
}
