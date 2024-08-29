package ex06;

public class MyClass {
      // 클래스 변수 (정적 변수)
	static String classVariable = "This is a class variable";
	
	// 인스턴스 변수
	String instanceVariable;
	
	// 생성자
	MyClass(String instanceVariable) {
		this.instanceVariable = instanceVariable;
	}
	
	// 인스턴스 메소드
	void instanceMethod() {
		System.out.println("This is an instance method");
		System.out.println("instance Variable: " + instanceVariable);
		System.out.println("Class variable " + classVariable);
		
		// 정적 메소드 호출
		MyClass.classMethod();
	}
	
	// 클래스 메소드 (정적 메소드)
	static void classMethod() {
		System.out.println("This is a class method");
		System.out.println("Class variable " + classVariable);
		
		// 인스턴스 생성 후 인스턴스 메소드 호출
		MyClass myInstance = new MyClass("Instance variable from class method");
		myInstance.instanceMethod();
	}
}
