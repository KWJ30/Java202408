package ex05;

public class StudentMain {

	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		s1.setName("차은우");
//		System.out.println(s1.getName());
		
		System.out.println(Student.job);
		
		Student.change("남배우");
		
		System.out.println(Student.job);
	}
	

}
