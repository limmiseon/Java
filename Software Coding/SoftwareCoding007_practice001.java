package softwarecoding007;

public class SoftwareCoding007_practice001 {

	public static void main(String[] args) {
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글한글aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword("한글aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword("한글한글aa", 15));
		System.out.printf("한글은 [%d]개\n", HanCount("한글한글aa"));
	}
	
	public static String HanBlankForeword(String k34_str, int k34_num) {// 문자열을 반환하는 HanBlankForeword 메소드를 정의한다.
		String k34_return = "";// String변수 k34_return을 선언하고 문자열 안에 아무것도 넣지 않는다.
		byte[] strByte = k34_str.getBytes();// getByte를 이용해 문자열의 바이트 수를 구한다.
		for (int k34_i = 0; k34_i < (k34_num - k34_str.getBytes().length); k34_i++) {// 앞에 공백을 추가하기 위한 반복문
			k34_return += " ";//공백을 추가한다.
		}
		return k34_return + k34_str;// 공백을 앞에 추가했으므로 나머지 부분에 매개변수로 받은 문자열을 추가해 반환한다.
	}
	
	public static String HanBlankBackword(String k34_str, int k34_num) {// 문자열을 반환하는 HanBlankBackword 메소드를 정의한다.
		String k34_return = "";// String변수 k34_return을 선언하고 문자열 안에 아무것도 넣지 않는다.
		byte[] strByte = k34_str.getBytes();// getByte를 이용해 문자열의 바이트 수를 구한다.
		for (int k34_i = 0; k34_i < (k34_num - k34_str.getBytes().length); k34_i++) {// 뒤에 공백을 추가하기 위한 반복문
			k34_return += " ";//공백을 추가한다.
		}
		return k34_str + k34_return;// 매개변수로 받은 문자열 뒤에 필요한만큼 공백을 붙였으므로 그대로 반환한다.
	}
	
	public static int HanCount(String k34_str) {// 문자열에서 한글의 갯수를 세는 메소드
		byte[] strByte = k34_str.getBytes();// getByte를 이용해 문자열의 바이트 수를 구한다.
		return k34_str.getBytes().length - k34_str.length();// 바이트 수 - 문자열의 길이 = 한글의 갯수이다.
	}
}
