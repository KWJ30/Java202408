package ex01;

public class SamsungTV {

	//전원 -> on,off -> boolean
	//소리 -> up,down -> int
	   int sound = 0;
	   boolean isActive = false;
	   
	   public SamsungTV() {}
	   
	   public SamsungTV(int _sound , boolean _isActive)
	   {
	      sound = _sound;
	      isActive = _isActive;
	   }
	   
	   public void IsActive(boolean _active)
	   {
	      isActive = _active;
	   }
	   
	   public void ChangeSound(int _sound)
	   {
	      if(isActive)
	      {
	         sound += _sound;
	      }
	      else 
	      {
	         System.out.println("전원이 꺼져있습니다.");
	      }
	      
	   }
	
//	private boolean power;
//	private int sound;
//	
//	boolean poweron() {
//		System.out.println("전원을 켭니다");
//		return power=true;
//	}
//	
//	boolean poweroff() {
//		System.out.println("전원을 끕니다");
//		return power=false;
//	}
//	
//	int soundup() {
//		System.out.println("소리를 높입니다");
//		return sound++;
//	}
//	
//	int sounddown() {
//		System.out.println("소리를 낮춥니다");
//		return sound--;
//	}

}

