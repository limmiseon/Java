package softwarecoding006;

public class SoftwareCoding006_practice009_TvRemocon2Calss {
		int k34_vol = 0;// int형 인스턴스 변수 k34_vol을 선언한다. (현재 볼륨)
		int k34_channel = 0;// int형 인스턴스 변수 k34_channel을 선언한다. (현재 채널)
		String k34_help;// 문자열 인스턴스 변수 k34_help을 선언한다.
		
		SoftwareCoding006_practice009_TvRemocon2Calss() {
			System.out.println("=> 채널 올라가요");
			for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelUp 메소드를 10번 호출하는 반복문
				k34_ChannelUp();
			}
			
			System.out.println("=> 채널 내려가요");
			for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelDn 메소드를 10번 호출하는 반복문
				k34_ChannelDn();
			}
			
			System.out.println("=> 볼륨 올라가요");
			for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolUp 메소드를 5번 호출하는 반복문
				k34_VolUp();
			}
			
			System.out.println("=> 볼륨 내려가요");
			for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolDn 메소드를 5번 호출하는 반복문
				k34_VolDn();
			}
		}
		
		void k34_VolUp() {// 메소드 VolUp을 정의한다. (볼륨이 올라감)
			k34_vol++;// k34_vol에 1을 더한다.
			k34_help = String.format("현재 볼륨 :%d", k34_vol);// String 클래스의 format함수를 이용해 문자열을 저장한다.
			System.out.printf("MSD[%s]\n", k34_help);
		}
		
		void k34_VolDn() {// 메소드 VolDn을 정의한다. (볼륨이 내려감)
			k34_vol--;// k34_vol에서 1을 뺀다.
			k34_help = String.format("현재 볼륨 :%d", k34_vol);// String 클래스의 format함수를 이용해 문자열을 저장한다.
			System.out.printf("MSD[%s]\n", k34_help);
		}
		
		void k34_ChannelUp() {// 메소드 ChannelUp을 정의한다. (채널이 올라감)
			k34_channel++;
			k34_help = String.format("현재 채널 :%d", k34_channel);// String 클래스의 format함수를 이용해 문자열을 저장한다.
			System.out.printf("MSD[%s]\n", k34_help);
		}
		
		void k34_ChannelDn() {// 메소드 ChannelDn을 정의한다. (채널이 내려감)
			k34_channel--;
			k34_help = String.format("현재 채널 :%d", k34_channel);// String 클래스의 format함수를 이용해 문자열을 저장한다.
			System.out.printf("MSD[%s]\n", k34_help);
		}		
}
