package ex03;

public class StudentMain2 {

	public static void main(String[] args) {
		
		Student2 s1 = new Student2();
		s1.info();
		
		Student2 s2 = new Student2("차은우" , 30 , "012-3456-7890");
		
		s2.info();
		s2.nameInfo();
		s2.nameChange("차우은");
		s2.nameInfo();
		
		System.out.println(s2.getName());
		s2.setName("차은우");
		s2.nameInfo();
	}
	

}
