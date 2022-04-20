package softwarecoding006;

public class SoftwareCoding006_practice011_TvRemoconXMain {
	
	public static void main(String[] args) {
		// SoftwareCoding006_practice011_TvRemoconXCalss 클래스의 객체를 생성한다.
		SoftwareCoding006_practice011_TvRemoconXCalss k34_remo = new SoftwareCoding006_practice011_TvRemoconXCalss();
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelUp 메소드를 10번 호출하는 반복문
			k34_remo.k34_energeCheck();// 건전지 체크 메소드를 호출한다.
			k34_remo.k34_ChannelUp();// 채널을 올리는 메소드를 호출한다.
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelDn 메소드를 10번 호출하는 반복문
			k34_remo.k34_energeCheck();// 건전지 체크 메소드를 호출한다.
			k34_remo.k34_ChannelDn();// 채널을 내리는 메소드를 호출한다.
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolUp 메소드를 5번 호출하는 반복문
			k34_remo.k34_energeCheck();// 건전지 체크 메소드를 호출한다.
			k34_remo.k34_VolUp();// 볼륨을 올리는 메소드를 호출한다.
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolDn 메소드를 5번 호출하는 반복문
			k34_remo.k34_energeCheck();// 건전지 체크 메소드를 호출한다.
			k34_remo.k34_VolDn();// 볼륨을 내리는 메소드를 호출한다.
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
	}
}
