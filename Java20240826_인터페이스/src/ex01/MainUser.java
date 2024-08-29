package ex01;

public class MainUser {

	public static void main(String[] args) {

		SamsungTV tv = new SamsungTV();
		
		tv.IsActive(true);
		tv.ChangeSound(1);
		tv.ChangeSound(1);
		tv.ChangeSound(1);
		System.out.println(tv.sound);
		
		tv.ChangeSound(-1);
		tv.ChangeSound(-1);
		System.out.println(tv.sound);

		tv.IsActive(false);
	}

}
