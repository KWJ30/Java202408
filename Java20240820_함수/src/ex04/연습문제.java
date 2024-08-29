/*
		 * 1.과목등록 | 2.과목목록보기 | 3.종료
		 * String 배열을 이용해서 작업하기(배열 크기는 최대10)
		 */
package ex04;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[10];
		
		System.out.println("1.과목등록 | 2.과목목록보기 | 3.종료");
		System.out.print("번호입력>>");
		
		int i = sc.nextInt();
		sc.nextLine(); //개행문자 (\n, 쉽게말해 enter)를 nextInt가 읽어주지않음
	    int count = 0;
	    
		while(i!=3) {
		if(i==1) {System.out.print("과목명입력>>"); name[count++] = sc.nextLine();}
		
		else if(i==2) {for(int j=0; j<count; j++) System.out.print(name[j]+","); System.out.println();}
		
		else {System.out.print("올바른 값을 입력해주세요\n");}
		
		System.out.println("1.과목등록 | 2.과목목록보기 | 3.종료");
		System.out.print("번호입력>>");
		i = sc.nextInt();	
		sc.nextLine();
		}
		
		System.out.println("프로그램 종료");
			
		}
		
	}


