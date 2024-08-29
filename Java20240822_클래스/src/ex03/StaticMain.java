package ex03;

class StaticEx{
	int count=0; // 멤버변수, 인스턴스변수  스택영역->실행하고나면 제거(개별자원)
	static int cnt=0; // 정적변수, 클래스변수  메소드영역->유지됨(공유자원)

     void func() {}  //인스턴스,클래스 변수(+메소드) 사용가능
     static void sfunc() {} //클래스 변수(+메소드)만 사용가능
}

public class StaticMain {

	public static void main(String[] args) {
		
		StaticEx ex1 = new StaticEx();
		ex1.count++;
		StaticEx.cnt++;  // 멤버변수임을 알기쉽게 하기위함
		System.out.println(ex1.count + " , " + StaticEx.cnt);
		
		StaticEx ex2 = new StaticEx();
		ex2.count++;
		StaticEx.cnt++;
		System.out.println(ex2.count + " , " + StaticEx.cnt);
		
		StaticEx ex3 = new StaticEx();
		ex3.count++;
		StaticEx.cnt++;
		System.out.println(ex3.count + " , " + StaticEx.cnt);
		
	}

}
