package softwarecoding006;

public class SoftwareCoding006_practice005_TvRemoconMain {
	
	public static void main(String[] args) {
		// SoftwareCoding006_practice005_TvRemoconCalss 클래스의 객체를 생성한다.
		SoftwareCoding006_practice005_TvRemoconCalss k34_remo = new SoftwareCoding006_practice005_TvRemoconCalss();
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelUp 메소드를 10번 호출하는 반복문
			k34_remo.k34_ChannelUp();
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelDn 메소드를 10번 호출하는 반복문
			k34_remo.k34_ChannelDn();
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolUp 메소드를 5번 호출하는 반복문
			k34_remo.k34_VolUp();
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolDn 메소드를 5번 호출하는 반복문
			k34_remo.k34_VolDn();
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
	}
}
