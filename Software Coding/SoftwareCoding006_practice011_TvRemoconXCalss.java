package softwarecoding006;

public class SoftwareCoding006_practice011_TvRemoconXCalss extends SoftwareCoding006_practice005_TvRemoconCalss{
		int k34_energe = 10;// 건전지 체크를 위한 변수
		
		void k34_energeCheck() {// 건전지 체크를 위한 변수
			if (k34_energe > 0) {// k34_energe가 0보다 크다면
				System.out.printf("현재 건전지 잔량 : %d\n", k34_energe);
			} else {// 0이라면
				System.out.printf("건전지를 교체해 주세요.\n");
				k34_energeChange();// 건전지 교체를 위한 메소드를 출력한다.
				
			}
		}
		
		void k34_energeChange() {// 건전지를 교체하는 메소드
			System.out.printf("건전지를 교체하는 중입니다 …\n");
			k34_energe += 10;// k34_energe에 10을 더한다.
			System.out.printf("교체 완료\n");
		}
		
		@Override// 부모 클래스의 k34_VolUp 메소드를 오버라이딩한다.
		void k34_VolUp() {
			super.k34_VolUp();// 부모 클래스의 k34_VolUp 메소드 호출
			k34_energe --;
		}
		
		@Override// 부모 클래스의 k34_VolDn 메소드를 오버라이딩한다.
		void k34_VolDn() {
			super.k34_VolDn();// 부모 클래스의 k34_VolDn 메소드 호출
			k34_energe --;
		}
		
		@Override// 부모 클래스의 k34_ChannelUp 메소드를 오버라이딩한다.
		void k34_ChannelUp() {
			super.k34_ChannelUp();// 부모 클래스의 k34_ChannelUp 메소드 호출
			k34_energe --;
		}
		
		@Override// 부모 클래스의 k34_ChannelDn 메소드를 오버라이딩한다.
		void k34_ChannelDn() {
			super.k34_ChannelDn();// 부모 클래스의 k34_ChannelDn 메소드 호출
			k34_energe --;
		}
}
