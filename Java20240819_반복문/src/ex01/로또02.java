//<로또 5게임 번호 출력>
package ex01;

import java.util.Random;

public class 로또02 {

   public static void main(String[] args) {
      // 1~45숫자 중 6개 숫자 -> 5개 구입
      
      int[] nums = new int[6];
      Random random = new Random();
      
      for(int k=0; k<5; k++) {
         for(int i=0; i<nums.length; i++) {
//            nums[i] = (int)((Math.random()*45)+1);      
            nums[i] = random.nextInt(45)+1;   
         
            // 중복 제거(다시 뽑기)            
            for(int j=0; j<i; j++) {
               if(nums[i] == nums[j]) { //i이전의 것들과 모두비교
                  i--; //같으면 i를 다시 뽑기위해 마이너스
               }
            } //continue; 이 뒤 중괄호에 대응되는 중괄호 앞 반복문의 조건식으로
         }
         
         // 출력
         for(int i=0; i<nums.length; i++) {
            System.out.printf("%02d ", nums[i]);
         }
         System.out.println();
      }
      
   }

}