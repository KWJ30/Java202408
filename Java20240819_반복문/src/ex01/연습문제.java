package ex01;

public class 연습문제 {

	public static void main(String[] args) {
		
		//int 형 배열 참조변수 nArr설정
		
		int a = 15;
		int[] nArr = new int[a];
		
		for (int i=0; i<a; i++) {nArr[i] = 
				(int)(Math.random()*100+1);
		System.out.printf("%d,",nArr[i]);
		}
		System.out.printf("\n");
		
		//배열 초기화 -> 값 범위는 1~100 -> 랜덤함수 이용해서
		
		int max = nArr[0]; // 배열의 첫번째값이 무난
		int min = nArr[0];
		
		for (int i=0; i<a; i++) {if (nArr[i]>=max){
			max=nArr[i];}}
		
		System.out.println("최대값:"+max);
		
		for (int i=0; i<a; i++) {if (nArr[i]<=min){
			min=nArr[i];}}
		
		System.out.println("최소값:"+min);
		
		//최대값 & 최소값 구하기
		
		int sum=0;
		for (int i=0; i<a; i++) {sum+=nArr[i];}
		double avg=sum/(double)a;
		System.out.println("합:"+sum);
		System.out.printf("평균:%.2f\n",avg);
		
		//총점 & 평균
		
		int tmp;
		for (int i=0; i<a; i++) {
			for (int j=0; j<a-1-i; j++){
				if (nArr[j]>=nArr[j+1]) {
					tmp=nArr[j];
					nArr[j]=nArr[j+1];
					nArr[j+1]=tmp;
					}
			}
		}
		
		for (int i=0; i<a; i++) {
			System.out.printf("%d,",nArr[i]);
		}
		
		//오름차순 정렬. (버블정렬)
		
		}
		
	}


