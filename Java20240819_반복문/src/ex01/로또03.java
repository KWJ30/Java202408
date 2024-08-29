package ex01;

import java.util.Random;

public class 로또03 {

   public static void main(String[] args) {
     
      int[] a = new int[6];
      Random random = new Random();
      
      for(int i=0; i<5; i++) {
         for(int j=0; j<a.length; j++) {

            a[j] = random.nextInt(45)+1;   
                    
            for(int k=0; k<j; k++) {
               if(a[j] == a[k]) {
                  j--;
               }
            }
         }
         
         for(int j=0; j<a.length; j++) {
            System.out.printf("%02d ", a[j]);
         }
         System.out.println();
      }
      
   }

}