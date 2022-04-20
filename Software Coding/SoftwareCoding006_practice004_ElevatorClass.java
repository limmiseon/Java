package softwarecoding006;

public class SoftwareCoding006_practice004_ElevatorClass {
		int k34_limit_up_floor = 10;// 최상위 층
		int k34_limit_down_floor = 0;// 최하위 층 
		int k34_floor = 1;// 현재 층
		String k34_help;
		
		void k34_up() {// 엘리베이터가 올라감
			if (k34_floor == k34_limit_up_floor) {// 만약 엘리베이터가 최상위 층이라면
				k34_help = "마지막 층 입니다.";
			} else {// 엘리베이터가 최상위 층이 아니라면
				k34_floor++;// 한 층씩 올라간다.
				k34_help = String.format("%d층입니다.", k34_floor);
			}
		}
		
		void k34_down() {// 엘리베이터가 내려감
			if (k34_floor == k34_limit_down_floor) {// 만약 엘리베이터가 최하위 층이라면
				k34_help = "처음 층 입니다.";
			} else {// 엘리베이터가 최하위 층이 아니라면
				k34_floor--;// 한 층씩 내려간다.
				k34_help = String.format("%d층입니다.", k34_floor);
			}
		}		
}
