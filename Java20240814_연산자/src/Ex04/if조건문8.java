package Ex04;

import java.util.Scanner;

public class if조건문8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(cm)를 입력하세요:");
		double h = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력하세요:");
		double w = sc.nextDouble();
		//int H=(int)(10*h); 정수변환 후 다시 실수 변환해보았지만
		//int W=(int)(10*w); 똑같은 결과값(둘 다 오차 거의없음)
		double BMI= Math.round((double)100000*w/(h*h))/10.0; //소수점 첫째자리까지 반올림
		System.out.printf("BMI수치:%.1f\n",BMI); //.1을 안붙이면 뒤에 0이 5개 더 출력됨
		
		if (BMI<18.5) {System.out.println("저체중입니다.");}
		else if(BMI<=24.9) {System.out.println("정상체중입니다.");}
		else if(BMI<=29.9) {System.out.println("과체중입니다.");}
		else {System.out.println("비만입니다.");}
	}
}