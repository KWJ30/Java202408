package ex04;

class Student{ 
	
private String name;
private int age;	
private String phone;  




public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}



Student(){ 
	System.out.println("디폴트 생성자 호출");
}

Student(String name, int age, String phone)
{
	this.name = name;
	this.age = age;
	this.phone = phone; 
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
