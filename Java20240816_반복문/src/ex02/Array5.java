package ex02;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
        for(int i=0; i<5; i++) {
        	System.out.printf("%d번째 학생 점수 입력: ", i+1);
        	score[i] = sc.nextInt();}
		
        for(int i=0; i<5; i++){
        	if (i==4) {System.out.println(score[i]);}
        	else System.out.print(score[i]+",");}
        
        int max=0;
        
        for(int i=0; i<5; i++) {
        	if (score[i]>=max) max=score[i];
        
        }
        
        int sum=0;
        
        for(int i=0; i<5; i++) {
        	sum+=score[i];
        }
        double avg=sum/5.0;
        
        System.out.print("합:"+sum );
        System.out.printf("평균:%.2f",avg);
        System.out.println("최대값:"+max);
	}
        }