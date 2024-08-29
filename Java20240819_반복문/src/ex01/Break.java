package ex01;

public class Break {
	
	public static void main(String[] args) {

		//1~10000회전 => 합이 100만 일때 끝. 연산횟수
		
		int sum,count;
		sum=count=0;
		for(int i=1; i<10000; i++) {
			if(sum>1000000) {break;}
			sum+=i;
			count++;
			}
		System.out.printf("합:%d, 횟수:%d\n",sum,count);
		}
	}

