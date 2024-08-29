package ex02;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
        for(int i=0; i<5; i++) {
        	System.out.printf("%d번째 학생 점수 입력: ", i+1);
        	score[i] = sc.nextInt();}
		
        for(int i=0; i<5; i++){
        	if (i==4) {System.out.print(score[i]);}
        	else System.out.print(score[i]+",");}
        }
	}