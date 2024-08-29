package ex03;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	default void setMute(boolean mute) { //디폴트 메소드 정의
		if(mute) {
			System.out.println("무음 처리합니다.");
		
		setVolume(MIN_VOLUME);
	} else {
		System.out.println("무음 해제합니다.");
	}
}
	//정적메소드. 호출시 구현객체가 필요하지않음
		static void changeBattery() {
			System.out.println("리모콘 건전지를 교환합니다.");
  }
}
