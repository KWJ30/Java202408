package ex03;

public class 조건연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor = 100;
        String result = (kor>=80)? "A":(kor>=60)? "B":(kor>=40)? "C": (kor>=20)? "D":"F";
	
        System.out.println(result);
	
	}
	

}
