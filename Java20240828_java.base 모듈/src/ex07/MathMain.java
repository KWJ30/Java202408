package ex07;

public class MathMain {

	public static void main(String[] args) {

		int max = max(9,6,12);
		
		System.out.println(max);
		
	}

	static int max(int a, int b, int c) {
		int result=a;
		result=Math.max(Math.max(a,b),c);
		return result;
	}
	
}
