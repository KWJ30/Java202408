package ex02;

public class Array02 {

	public static void main(String[] args) {

		int[] nArr = new int[5];
		
		nArr[0]=30;
		nArr[1]=40;
		nArr[2]=50;
		nArr[3]=60;
		
		for(int i=0; i<5; i++)
			{System.out.println(nArr[i]);}
		
		System.out.println(nArr[3]);
		System.out.println(nArr[4]); // 0나옴
		
}
}