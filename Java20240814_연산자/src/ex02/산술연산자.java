package ex02;

public class 산술연산자 {
	public static void main(String[] args) {
		
		int a = 8;
		int b = 3;
		
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		double div = a/(double)b;
		int rem = a%b;
		
		System.out.println(div);
		System.out.println(rem);
		System.out.printf("%f\n",div);
		System.out.printf("%.3f\n",div);
		
		System.out.printf("%d,%d,%d,%3.3f,%d\n",add,sub,mul,div,rem);
		
		//%d 10진수 %x 16진수 %o 8진수 %f 실수
		
		int c = 12;
		int d = 123;
		int e = 1234;
		int f = 12345;
		System.out.println(c+","+c);
		System.out.println(d+","+d);
		System.out.println(e+","+e);
		System.out.println(f+","+f);
		
		System.out.println(c+","+c);
		System.out.println(d+","+d);
		System.out.println(e+","+e);
		System.out.println(f+","+f);
		
		System.out.printf("%d , %d\n",c,c);
		System.out.printf("%d , %d\n",d,d);
		System.out.printf("%d , %d\n",e,e);
		System.out.printf("%d , %d\n",f,f);
		
		System.out.printf("%5d , %5d\n",c,c);
		System.out.printf("%5d , %5d\n",d,d);
		System.out.printf("%5d , %5d\n",e,e);
		System.out.printf("%5d , %5d\n",f,f); //5자리 정수, 왼쪽 빈자리 공백

		System.out.printf("%-5d , %-5d\n",c,c);
		System.out.printf("%-5d , %-5d\n",d,d);
		System.out.printf("%-5d , %-5d\n",e,e);
		System.out.printf("%-5d , %-5d\n",f,f); //5자리 정수, 오른쪽 빈자리 공백
	}
	
}