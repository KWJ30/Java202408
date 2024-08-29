package ex03;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(3);
		//디폴트메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		//정적메소드 호출. 구현객체가 필요하지않음
		RemoteControl.changeBattery();
	}

}
