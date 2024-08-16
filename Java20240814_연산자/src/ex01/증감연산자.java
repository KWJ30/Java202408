package ex01;

public class 증감연산자 {

	public static void main(String[] args) {
		
		// 선위,후위 연산자
		
		{int num = 0;
		
		int a = ++num; //선위
		
		System.out.println(a);

		int b= num++; //후위
		
		System.out.println(b);
		
		System.out.println(num);}
		System.out.println("-----");
		{int num = 0;
		
	     num= ++num;
				
	     System.out.println(num);
				
		 int a = num++;
			
	   	 System.out.println(a);
	   	 System.out.println(num);
	   	 System.out.println("-----");
	   	 
	   	 num = num++;
	   	 //2를 넣는 작업이 맨 마지막?
	   	 System.out.println(num);
	   	 System.out.println(num++);
	   	 System.out.println(num);
	   //num=num 이후 num=num+1
		}
		
	}

}
