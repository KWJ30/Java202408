package ex01;

import java.util.Scanner;

public class 멘토링문제 {

	

	    public static void main(String[] args) {
	        Scanner kb = new Scanner(System.in);
	        int n = kb.nextInt(); //학생 수 입력 (=등수 수)
	        int test = kb.nextInt(); //테스트 수 입력
	        int[][] arr = new int[test][n];
	        for (int i = 0; i < test; i++) {
	            for (int j = 0; j < n; j++) {
	                arr[i][j] = kb.nextInt(); //테스트 등수 입력 (= 해당 등수에 해당하는 학생넘버 입력)
	            }
	        }
	        solution(test,n,arr);
	    }

	    private static void solution(int test,int n, int[][] arr) {
	        int answer = 0;
	        for (int i = 1; i <= n; i++) {  //i번째 학생과
	            for (int j = 1; j <= n; j++) {  //j번째 학생을 비교
	                int pi=0,pj=0,cnt=0;
	                for (int k = 0; k < test; k++) {  // k+1번째 테스트에서
	                    for (int l = 0; l < n; l++) {   // L+1번째 등수의 학생이 i,j번째학생이면
	                        if(arr[k][l] == i) pi = l;  // i번째 학생의 등수 찾아냄
	                        if(arr[k][l] == j) pj = l;  // j번째 학생의 등수 찾아냄
	                    }
	                    if(pi<pj){cnt++;} //i번째 학생의 등수가 더 작으면 cnt를 누적해서
	                           
	                }
	                if(cnt==test){answer++;} //모든 테스트(k번)에 대해 성립하면 멘토가능한거니 +1
	  
	            }
	        }
	        System.out.println(answer);
	    }
	}
