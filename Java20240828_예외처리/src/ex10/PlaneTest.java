package ex10;

public class PlaneTest {

	public static void main(String args[]) {
		 Plane[] planes = new Plane[2];
		Airplane airplane = new Airplane("L747",1000);
		Cargoplane cargoplane = new Cargoplane("C40",1000);
		 planes[0] = airplane;
	        planes[1] = cargoplane; //2개의 원소를 갖는 타입의 배열 객체를 생성
			                        //Airplane과 객체를 생성하여 각 원소로 저장
                       
			printInfo(planes); //생성된 객체의 정보 출력

			airplane.flight(100);
			cargoplane.flight(100);
			printInfo(planes); //Airplane과 객체에 100씩 운항 후 객체 정보 출력

			airplane.refuel(200);
			cargoplane.refuel(200);
			printInfo(planes);  //Airplane과 객체에 주유 후 객체 정보 출력
			
		}
		public static void printInfo(Plane[] plane) {
			System.out.println("Plane      fuelSize");
			System.out.println("-------------------"); //타이틀 출력
			for(Plane planes : plane) {
				System.out.printf("%s\t %8d\t\n",
						planes.getPlaneName(), planes.getFuelSize());	//객체들의 데이터 출력 결과			
			}
			System.out.println();
			


			
		}

	}
