package ex05;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1st num:");
		
		int a = sc.nextInt();
		
		System.out.println("2nd num:");
		
		int b = sc.nextInt();
		
		int sum = a+b;
		
		double avg = sum/2.0;
		
		System.out.println("합:"+sum+" 평균:"+avg);
				
	}
//주석처리: ctrl+/
	 {
			
			Scanner sc = new Scanner(System.in);
			
		    int count = 0;
			
			System.out.println("1st num:");
			
			int a = sc.nextInt();
			
			count = count+1;
			
			System.out.println("2nd num:");
			
			int b = sc.nextInt();
			
			count = count+1;
			
			int sum = a+b;
			
			double avg = (double)sum/count; // sum을 이번만 강제 형변환
			
			System.out.println("합:"+sum+" 평균:"+avg);
			
		}
	
}
