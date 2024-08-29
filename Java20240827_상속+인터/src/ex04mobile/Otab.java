package ex04mobile;

public class Otab extends Mobile{

	Otab() {}
	Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	@Override
	public void operate(int time) {
		setBatterySize(getBatterySize()-12*time);
	}

	@Override
	public void charge(int time) {
		setBatterySize(getBatterySize()+8*time);
	}

}
