package Ex04;

public class if조건문6 {
	
	public static void main(String[] args) {
		
		int Age = (int)(Math.random()*100)+1;
		
		int Base= 2000;	
		int Fee;
		
		if (Age<=5 || Age>=65) {Fee=0;}
		else if(Age<=12) {Fee=Base/2;}
		else if(Age<=18) {Fee=Base*3/4;}
		else {Fee=Base;}
		System.out.println("나이:"+ Age);
		System.out.println("버스요금:"+Fee+"원");
	}
}