package ex04mobile;

public abstract class Mobile {
	
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile(){}
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	
	//void printMobile() {
	//	System.out.printf("이름: %s 배터리: %d OS: %s \n", mobileName, batterySize, osType);
	//}
	
	public abstract void operate(int time);
	public String getMobileName() {
		return mobileName;
	}
	
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public abstract void charge(int time);
}
