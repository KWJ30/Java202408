package ex05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String data1 = "홍길동&이수홍,박연수";
		String [] arr = data1.split("&|,");
		System.out.println(data1);
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2,"/");
		while(st.hasMoreElements()) {
			String str = st.nextToken();
			System.out.println(str);
		}
		
	}

}
