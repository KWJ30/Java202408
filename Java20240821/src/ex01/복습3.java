package ex01;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		int a=0;
		
		int[] Array= new int[100];
		
		int max=0;
		
		int sum=0;
		
		double avg=0;
		
		while(flag) {
			System.out.println("-----------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			
			//int num = Integer.parseInt(sc.nextLine());
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("학생수> ");
				a = sc.nextInt();
				Array = new int[a];
				break;
			case 2:
				System.out.print("점수입력> ");
				for(int i=0; i<a; i++) {System.out.print("scores["+i+"]: "); Array[i]= sc.nextInt();}
				max=Array[0];
				for(int i=0; i<a; i++) {sum+=Array[i];}
				avg=(double)sum/a;
				break;
			case 3:
				for(int i=0; i<a; i++) {System.out.println("scores["+i+"]:"+ Array[i]);}
				break;
			case 4:
				for(int i=0; i<a; i++) {if(Array[i]>=max) {max=Array[i];} }
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("1~5사이 숫자만 입력하세요");
			}
			}
			System.out.println("프로그램 종료");
			}
		
	}
	
	
	
