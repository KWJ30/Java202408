package Ex04;

import java.util.Scanner;

public class TEST2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.다시 2.종료");
		
		int i= sc.nextInt();
		
		while(i==1) {
			
			System.out.println("1.다시 2.종료");
			
			i= sc.nextInt();
			
		}
	}
}


