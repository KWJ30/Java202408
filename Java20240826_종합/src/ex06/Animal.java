package ex06;

abstract class Animal{  //추상메소드를 1개이상 가지고 있으면 추상클래스로 해야됨. 객체생성불가

	private String name; 
	
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}
	
	abstract void speak(); //추상메소드 
	
	void info() {
		System.out.println(name+"입니다.");
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
}
