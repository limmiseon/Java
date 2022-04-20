package softwarecoding006;

public class SoftwareCoding006_practice012_Elevator3Class extends SoftwareCoding006_practice008_Elevator2Class{
		void repair() {// 메소드 정의 (엘리베이터 수리중)
			k34_help = String.format("수리중 입니다.");
		}

		@Override
		void k34_up() {// 부모 클래스의 k34_up 메소드를 오버라이딩한다.
			if (k34_floor >= k34_limit_up_floor) {
				k34_help = "마지막 층 입니다.";
			} else {
				k34_floor +=  2;// 최상층이 아닐 때 2층씩 올라간다.
				k34_help = String.format("%d층입니다.", k34_floor);
			}
			
			this.k34_down();// 부모 클래스의 k34_down 메소드를 호출한다.
							// 2층 올라가고 다시 1층 내려감
		}
		
		@Override// 부모 클래스의 k34_down 메소드를 오버라이딩한다.
		void k34_down() {// 부모 클래스의 k34_up 메소드를 오버라이딩한다.
			super.k34_down();// 부모 클래스의 k34_down 메소드를 호출한다.
			System.out.printf("클래스 안에서 찍고 있는 MSD [%s]\n", this.k34_help);
		}
}
