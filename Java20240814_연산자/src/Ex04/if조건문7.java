package Ex04;

import java.util.Scanner;

public class if조건문7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주차시간을 입력하세요(시간):");
		double t = sc.nextDouble();
		
		int Fee;
		
		if (t<=1 && t>=0) {Fee=1000;}
		else if(t<=2) {Fee=2000;}
		else if(t<=3) {Fee=3000;}
		else {Fee=5000;}
		System.out.println("주차요금은 "+Fee+"원입니다.");
	}
}