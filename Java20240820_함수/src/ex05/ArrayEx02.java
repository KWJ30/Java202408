package ex05;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[] oldIntArray = {1,2,3};
		
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]+",");}
		
		System.out.println();
		System.out.println("---------------");
		
			int[] oldIntArray2 = {10,20,30,40,50};
			
			int[] newIntArray2 = new int[5];
		
			System.arraycopy(oldIntArray2, 0, newIntArray2, 2, 3);
			
			for(int j=0; j<oldIntArray2.length; j++) {
				System.out.print(oldIntArray2[j]+",");
			}
			
			System.out.println();
			System.out.println("----------");
			
			for(int j=0; j<newIntArray2.length; j++) {
				System.out.print(newIntArray2[j]+",");
			}
			System.out.println();
			System.out.println("----------");
		}
		
	}


