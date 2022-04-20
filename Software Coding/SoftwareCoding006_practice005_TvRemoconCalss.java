package softwarecoding006;

public class SoftwareCoding006_practice005_TvRemoconCalss {
		int k34_vol = 0;// int형 인스턴스 변수 k34_vol을 선언한다. (현재 볼륨)
		int k34_channel = 0;// int형 인스턴스 변수 k34_channel을 선언한다. (현재 채널)
		String k34_help;// 문자열 인스턴스 변수 k34_help을 선언한다.
		
		void k34_VolUp() {// 메소드 VolUp을 정의한다. (볼륨이 올라감)
			k34_vol++;// k34_vol에 1을 더한다.
			k34_help = String.format("현재 볼륨 :%d", k34_vol);// String 클래스의 format함수를 이용해 문자열을 저장한다.
		}
		
		
		void k34_VolDn() {// 메소드 VolDn을 정의한다. (볼륨이 내려감)
			k34_vol--;// k34_vol에서 1을 뺀다.
			k34_help = String.format("현재 볼륨 :%d", k34_vol);// String 클래스의 format함수를 이용해 문자열을 저장한다.
		}
		
		void k34_ChannelUp() {// 메소드 ChannelUp을 정의한다. (채널이 올라감)
			k34_channel++;
			k34_help = String.format("현재 채널 :%d", k34_channel);// String 클래스의 format함수를 이용해 문자열을 저장한다.
		}
		
		void k34_ChannelDn() {// 메소드 ChannelDn을 정의한다. (채널이 내려감)
			k34_channel--;
			k34_help = String.format("현재 채널 :%d", k34_channel);// String 클래스의 format함수를 이용해 문자열을 저장한다.
		}		
}
