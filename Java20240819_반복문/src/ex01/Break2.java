package ex01;

public class Break2 {
	
	public static void main(String[] args) {

		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i<j) {break;}
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
			System.out.println("----------");
		}
		
		}
	}

