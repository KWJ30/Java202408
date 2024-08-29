package ex10.copy;

public class PlaneTest {

	public static void main(String args[]) {
		 Plane[] planes = new Plane[2];
		Airplane airplane = new Airplane("L747",1000);
		Cargoplane cargoplane = new Cargoplane("C40",1000);
		 planes[0] = airplane;
	        planes[1] = cargoplane; //2개의 원소를 갖는 타입의 배열 객체를 생성
			                        //Airplane과 객체를 생성하여 각 원소로 저장
                       
	        printInfo(planes);
	        
	        // 100 운항 후 상태 출력
	        for (Plane plane : planes) {
	            plane.flight(100);
	        }
	        System.out.println("  "+"[100운항]");
	        
	        printInfo(planes);

	        // 연료 200 주유 후 상태 출력
	        for (Plane plane : planes) {
	            plane.refuel(200);
	        }
	        System.out.println("  "+"[200 주유]");
	        
	        printInfo(planes);
	    }

	    public static void printInfo(Plane[] list) {
//	    	System.out.println("   Plane        Fuel Size");
//            System.out.println("----------------------");
//            for (Plane plane : list) {     
//	            System.out.println("   " + plane.getPlaneName() +"           "+ plane.getFuelSize());
//	        }
	    	
//	    	System.out.printf("%-12s %s\n", "Plane", "Fuel Size");
//	    	System.out.println("----------------------");
//	    	for (Plane plane : list) {
//	    	    System.out.printf("%-12s %6d\n", plane.getPlaneName(), plane.getFuelSize());
//	    	}
	    	
	    	System.out.printf("%4s%-12s %s\n", "", "Plane", "fuelSize");
	    	System.out.println("  "+"------------------------");
	    	for (Plane plane : list) {
	    	    System.out.printf("%4s%-12s %5d\n", "", plane.getPlaneName(), plane.getFuelSize());
	    	}
	    	
            System.out.println();
	    }


			
		

	}
