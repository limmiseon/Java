package softwarecoding006;

public class SoftwareCoding006_practice008_Elevator2Class {
		int k34_limit_up_floor;// 최상위 층
		int k34_limit_down_floor;// 최하위 층 
		int k34_floor;// 현재 층
		String k34_help;
		
		SoftwareCoding006_practice008_Elevator2Class(){
			k34_limit_up_floor = 10;
			k34_limit_down_floor = 0;
			k34_floor = 1;
			System.out.println("엘리베이터 기본 준공완료");
		}
		
		// 생성자 오버로딩 (최대층, 최소층, 현재층을 주어서 클래스를 생성할 수 있도록 함) => 맞춤 엘리베이터
		SoftwareCoding006_practice008_Elevator2Class(int k34_up_floor, int k34_d_floor, int k34_in_floor) {
			k34_limit_up_floor = k34_up_floor;
			k34_limit_down_floor = k34_d_floor;
			k34_floor = k34_in_floor;
			k34_help = "엘리베이터 맞춤 준공완료";
		}
		
		void k34_up() {// k34_up 메소드 정의 (엘리베이터가 올라감)
			if (k34_floor == k34_limit_up_floor) {// 만약 엘리베이터가 최상위 층이라면
				k34_help = "마지막 층 입니다.";
			} else {// 엘리베이터가 최상위 층이 아니라면
				k34_floor++;// 한 층씩 올라간다.
				k34_help = String.format("%d층입니다.", k34_floor);
			}
		}
		
		void k34_down() {// k34_down 메소드 정의 (엘리베이터가 내려감)
			if (k34_floor == k34_limit_down_floor) {// 만약 엘리베이터가 최하위 층이라면
				k34_help = "처음 층 입니다.";
			} else {// 엘리베이터가 최하위 층이 아니라면
				k34_floor--;// 한 층씩 내려간다.
				k34_help = String.format("%d층입니다.", k34_floor);
			}
		}
		
		// 메소드 오버로딩 (처음 몇층인지 지정하면 그만큼 올라가도록 함)
		 void k34_up(int k34_up) { 
			 for (int k34_i = 0; k34_i < k34_up; k34_i++) {
				 this.k34_up(); // this를 쓰면 정확해진다.
			 
			 }
		 }
		 
		 // 메소드 오버로딩 (처음 몇층인지 지정하면 그만큼 내려가도록 함) 
		 void k34_down(int k34_down) { 
			 for (int k34_i = 0; k34_i < k34_down; k34_i++)
				 k34_down();
		 }
		
		void msd(String k34_id) {
			System.out.printf("%s => [%s] 최대층 [%d] 최소층 [%d] 현재층[%d]\n",
						 	 k34_id, k34_help, k34_limit_up_floor, k34_limit_down_floor, k34_floor);
		}
}
