package softwarecoding006;

public class SoftwareCoding006_practice008_Elevator2Main {
	
	static SoftwareCoding006_practice008_Elevator2Class k34_elev1;
	static SoftwareCoding006_practice008_Elevator2Class k34_elev2;
	static SoftwareCoding006_practice008_Elevator2Class k34_elev3;
	
	public static void main(String[] args) {
		k34_elev1 = new SoftwareCoding006_practice008_Elevator2Class(); // 기본 엘리베이터
		//k34_elev2 = new SoftwareCoding006_practice008_Elevator2Class(20, 1, 8); // 맞춤 엘리베이터 1
		//k34_elev3 = new SoftwareCoding006_practice008_Elevator2Class(50, -3, 5); // 맞춤 엘리베이터 2
		
		for (int k34_i = 0; k34_i < 20; k34_i++) {
			k34_elev1.k34_up();
			k34_elev1.msd("1번 엘리베이터 한 층 오르기");
			//k34_elev2.k34_up();
			//k34_elev2.msd("2번 엘리베이터 한 층 오르기");
			//k34_elev3.k34_up();
			//k34_elev3.msd("3번 엘리베이터 한 층 오르기");
			
		}
		
		for (int k34_i = 0; k34_i < 20; k34_i++) {
			k34_elev1.k34_up(2);
			k34_elev1.msd("1번 엘리베이터 2층씩 오르기");
			//k34_elev2.k34_up(2);
			//k34_elev2.msd("2번 엘리베이터 2층씩 오르기");
			//k34_elev3.k34_up(2);
			//k34_elev3.msd("3번 엘리베이터 2층씩 오르기");
		}
		
		for (int k34_i = 0; k34_i < 20; k34_i++) {
			k34_elev1.k34_down(3);
			k34_elev1.msd("1번 엘리베이터 3층씩 내리기");
			//k34_elev2.k34_down(3);
			//k34_elev2.msd("2번 엘리베이터 3층씩 내리기");
			//k34_elev3.k34_down(3);
			//k34_elev3.msd("3번 엘리베이터 3층씩 내리기");
		}
	}
}
