package ex01;

import java.util.Random;

public class 로또04 {

	public static void main(String[] args) {
		
	int[] lotto = new int[45];
	
	Random random = new Random();
	
	for(int i=0; i<45; i++) 
		lotto[i] = i+1;
	
	
	for(int j=0; j<5; j++) {
	
		for(int i=0; i<45; i++) {  //배열 섞기
			int index = random.nextInt(45);
			int tmp = lotto[i];
			lotto[i] = lotto[index];
			lotto[index] = tmp;
	}
	
	for(int k=0; k<6; k++) { //앞자리 6개 출력
		System.out.printf("%02d ",lotto[k]);}
		System.out.println();
	}
		
	}
	}

