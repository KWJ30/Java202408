package ex03;

class Student2{ 
private String name;
private int age;	
private String phone;  

Student2(){ 
	System.out.println("디폴트 생성자 호출");
}

Student2(String name, int age, String phone)
{
	this.name = name;
	this.age = age;
	this.phone = phone; 
}
//read -->get+변수명
void nameInfo() {
	System.out.println("이름:"+ name);
}

String getName() {
	return name;
}

//write -->set+변수명

void setName(String name) {
	this.name = name;
}

void nameChange(String name) {
	this.name = name;
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
