package ex03;

import java.util.Scanner;

/*
 * 문제2 5명학생 com점수를 입력받아서 출력 
 * (입출력 모두 반복문)
 * 문제3 최대값,최소값,총점,평균, 역순출력
 * 정렬
 */

public class 문제3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=7;
		
		int score[]= new int[a];
		
		System.out.println(score.length);
		
		for(int i=0;  i<a;  i++) {
			System.out.printf("%d번째 점수 입력: ",i+1);
			score[i] = sc.nextInt();
		}
		
		for(int i=0; i<a; i++) {
			System.out.printf("%d,",score[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<a; i++) {
			System.out.printf("%d,",score[a-i-1]);
		}
		
		System.out.println();
		
		int max=0;
		int min=100;
		int sum=0;
		
		
		for(int i=0; i<a; i++) {
			if(score[i]>=max) {max=score[i];}
		}
		for(int i=0; i<a; i++) {
			if(score[i]<=min) {min=score[i];}
	}
		for(int i=0; i<a; i++) {
			sum+=score[i];}
		
		double avg=sum/(double)a;
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<a-1-i; j++) {
				if(score[j]>=score[j+1]) {
					int tmp = score[j];
					score[j] = score[j+1];
					score[j+1] = tmp;
				}
			}
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("합:"+sum);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("정렬 후 출력:");
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + ",");
		}
}
}
