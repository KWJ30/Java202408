package Ex04;

import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int str=0;
		int dex=0;
		int Int=0;
		int luk=0;
		int sum=0;
		
		do {
			str= (int)(Math.random()*9)+4; //4~13랜덤정수생성반복
			dex= (int)(Math.random()*9)+4;
			Int= (int)(Math.random()*9)+4;
			luk= (int)(Math.random()*9)+4;
			sum= str+dex+Int+luk;
		}
		while(sum!=25);	//합이 25가되면 do~while 문을 빠져나옴
		
				System.out.println(str);
				System.out.println(dex);
				System.out.println(Int);
				System.out.println(luk);
				System.out.println("-----");
				System.out.println("1.다시 2.종료");
				
				int i = sc.nextInt(); // 숫자입력받음
				
                while(i==1) { //i=1이 아닐때까지 반복
					
					do {	
							str= (int)(Math.random()*9)+4;
							dex= (int)(Math.random()*9)+4;
							Int= (int)(Math.random()*9)+4;
							luk= (int)(Math.random()*9)+4;
							sum= str+dex+Int+luk;
					}
					while(sum!=25); //합이 25일 때까지 do~while 부분 반복
					
								System.out.println(str);
								System.out.println(dex);
								System.out.println(Int);
								System.out.println(luk);
								System.out.println("-----");
								System.out.println("1.다시 2.종료");
								i= sc.nextInt(); //숫자를 입력받고 다시 i=1 인지 체크하러 올라감
						
					}
				
					while(i!=2) {  //i가 1이 아닌상태에서 오게됨
					System.out.println("올바른값을 입력해주세요.");
					System.out.println("1.다시 2.종료");
					i= sc.nextInt(); //입력받아도 아직 체크하러 올라가는 단계가 아님. }가 없기때문에 실행문지속
					
					
					while(i==1) {  //1을 누르면 다시 구해지도록 코드복붙
						
						do {	
								str= (int)(Math.random()*9)+4;
								dex= (int)(Math.random()*9)+4;
								Int= (int)(Math.random()*9)+4;
								luk= (int)(Math.random()*9)+4;
								sum= str+dex+Int+luk;
						}
						while(sum!=25); //합25일때까지 반복
						
									System.out.println(str);
									System.out.println(dex);
									System.out.println(Int);
									System.out.println(luk);
									System.out.println("-----");
									System.out.println("1.다시 2.종료");
									i= sc.nextInt(); //i=1을 입력받고 난뒤엔 다시 i를 입력받고
							
						} //i가 1인지 체크하러 올라감. 여기까지의 while구문은 1을 입력받지않으면 완전히 무시됨
				} //i가 1도 2도 아닌지 체크하러 올라감
				
				 	System.out.println("종료되었습니다.");
}
}



