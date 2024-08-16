package Ex04;

import java.util.Scanner;

public class if조건문4 { // 1
	
	public static void main(String[] args) { // 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력>>");
		int num = sc.nextInt();
		
		String result = "";
		
		//num>=3 && num<6 와 (num==3)||(num==4)||(num==5)
		
		if(num>=3 && num<6){  
			result = "봄";
		}else if((num==6)||(num==7)||(num==8)) {
			result = "여름";
		}else if((num==9)||(num==10)||(num==11)) {
			result = "가울";
		}else if((num==12)||(num==1)||(num==2)) {
			result = "겨울";}
			else {result = "잘못된 값입니다";}
		System.out.println(result);
	} // 2
} // 1
