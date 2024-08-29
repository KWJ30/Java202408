package ex02;

public interface TV {

	int MAX = 100; //public final 생략가능(자동)
	
	abstract public void powerOn();
	void powerOff(); //abstract public 생략가능(자동)
	void soundUp();
	void soundDown();
	
	//채널변경추가
	default void channelUp() {
	}
	default void channelDown() {
	}
}
