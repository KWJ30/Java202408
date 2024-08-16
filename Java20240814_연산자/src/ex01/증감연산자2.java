package ex01;

public class 증감연산자2 {

	public static void main(String[] args) {
		
		// 선위,후위 연산자
		
        int num = 10;
		
		int n1 = 0;
		
		n1 = ++num;
		//num=num+1 이후 n1=num
		
		System.out.println(n1);
		System.out.println(num);
	}

}
