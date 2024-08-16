package Ex04;

import java.util.Scanner;

public class if조건문3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력>>");
		int num = sc.nextInt();
		
		String result = "";
		
		if(num>=90) {result = "A";}
		else if(num>=80){result = "B"; }
	    else if(num>=70){result = "C"; }
	    else {result = "F";}
		System.out.println(result);
}
}
