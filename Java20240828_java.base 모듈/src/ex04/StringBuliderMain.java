package ex04;

public class StringBuliderMain {

	public static void main(String[] args) {

		StringBuilder data = new StringBuilder(); //StringBuffer()를 써도 같음
				data.append("DEF");
				System.out.println(data);
		        data.insert(0,"ABC");
		        System.out.println(data);
		        data.delete(3,4);
		        System.out.println(data);
		        data.toString();
		        System.out.println(data);
	}

}
