package ex01;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		
		String str1 = "korea";
		String str2 = new String("801020-1079145");
		
		Scanner sc = new Scanner(System.in);
		
		char ch = str1.charAt(4);
		System.out.println(ch);
		
		char ch2 = str2.charAt(7);
		String s = (ch2 == '1') ? "남" : "여";
		
		System.out.println(s);
		
		String s2 = "dsfsdaf";
		
		char c1 = 65;
		char c2 = '1';
		System.out.println(c1+","+c2);
		
		int len = str1.length();
		System.out.println("len: "+ len);
		
		String oldStr = "java programming";
		String newStr = oldStr.replace("java", "Spring");
		System.out.println(newStr);
		System.out.println(oldStr);
		
		String sub1 = oldStr.substring(3);
		System.out.println(sub1);
		
		String sub2 = oldStr.substring(5,9);
		System.out.println(sub2);
		
		int len2 = oldStr.indexOf("java");
		System.out.println(len2);
		
		String board = "국어,영어,수학,컴퓨터";
		board.split(",");
	
		String[] sArr = board.split(",");
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);}
			
		String phone = "010-3380-6423";
		
		String[] phone2 = phone.split(",");
		for(int i=0; i<phone2.length;i++) {
			System.out.println(phone2[i]);
		
		String str3 = "com";
		String str4 = "com"; //위의 com을 그대로 씀
		System.out.println(str3==str4);
		
		String str5 = new String("com");
		String str6 = new String("com"); //new라 com을 무조건 새로 만듬
		System.out.println(str5==str6);
		
		boolean b1 = str3.equals(str4);
		System.out.println(b1);
		boolean b2 = str5.equals(str6);
		System.out.println(b2);  //기본자료형외에는 equals 함수로 비교. 주소값비교가 아님.
		
		
		System.out.println(oldStr.startsWith("java")); //단어시작에 대한 true/false
		
		String str7 = "     java Spring   ";
		System.out.println(str7.length());
		System.out.println((str7.trim()).length()); //공백제거
		
		System.out.println((str7.trim()).toUpperCase()); //대문자화
		System.out.println((str7.trim()).toLowerCase()); //소문자화
		
		}
		
	}

}
