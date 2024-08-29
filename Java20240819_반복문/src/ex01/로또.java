package ex01;

public class 로또 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		
	for(int i=0;i<=4;i++) {
		
		for(int j=0;j<=5;j++) {
			int tmp = (int)(Math.random()*45)+1; //tmp에 랜덤값입력
			boolean flag = false;
			
			for(int k=0; k<=j-1; k++) {  
				if(lotto[k]==tmp) { //이 값이 이전값들중 같은게 1개라도 있으면
					flag=true;  // flag를 true로 만들고
					j--;   // j를 하나 마이너스 시켜서 (다시뽑기위함)
					break; // 같음을 체크하는 현 반복문을 종료시킴
				}
			}
			
			if(flag==false) { //이 값이 이전값들과 모두 다르면
				lotto[j]=tmp;  //이 값을 현재위치 [j] 에 저장함
				System.out.print(lotto[j]+",");
			}
	}
		System.out.println();
	}
}
}
