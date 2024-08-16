package Ex04;

import java.util.Scanner;

public class if조건문5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력>>");
		int Age = sc.nextInt();
		
		int Base= 2000;	
		int Bus;
		
		if (Age<=5 || Age>=65) {Bus=0;}
		else if(Age<=12) {Bus=Base/2;}
		else if(Age<=18) {Bus=Base*3/4;}
		else {Bus=Base;}
		System.out.println("버스요금:"+Bus+"원");
	}
}