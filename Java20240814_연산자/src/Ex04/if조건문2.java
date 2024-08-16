package Ex04;

import java.util.Scanner;

public class if조건문2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력>>");
		int num = sc.nextInt();
		
		String result = "";
		
		if(num>=60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println(result);
}
}
