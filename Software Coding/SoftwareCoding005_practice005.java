package softwarecoding005;

import java.text.DecimalFormat;// 금액에 콤마를 찍기 위한 라이브러리 클래스
import java.text.SimpleDateFormat;// 실행 시간 출력 양식을 지정하기 위한 라이브러리 클래스
import java.util.Calendar;// 날짜와 시간을 얻기 위한 라이브러리 클래스
import java.util.Date;// 현재 날짜와 시간을 얻기 위한 라이브러리 클래스

public class SoftwareCoding005_practice005 {

	public static void main(String[] args) {
		// 영수증 출력(2)
		String k34_itemName1 = "새콤 달콤";// String변수 k34_itemName1을 선언하고 아이템1의 이름으로 초기화한다.
		String k34_itemCode1 = "1031615";// String변수 k34_itemCode1을 선언하고 아이템1의 코드로 초기화한다.
		int k34_price1 = 500;// int변수 k34_price1을 선언하고 아이템1의 가격으로 초기화한다.
		int k34_amount1 = 3;// int변수 k34_amount1을 선언하고 아이템1의 갯수로 초기화한다.
		
		String k34_itemName2 = "시원하게 마시는 콜드브루티";// String변수 k34_itemName2을 선언하고 아이템2의 이름으로 초기화한다.
		String k34_itemCode2 = "1008152";// String변수 k34_itemCode2을 선언하고 아이템2의 코드로 초기화한다.
		int k34_price2 = 7000;// int변수 k34_price2을 선언하고 아이템2의 가격으로 초기화한다.
		int k34_amount2 = 1;// int변수 k34_amount2을 선언하고 아이템2의 갯수로 초기화한다.
		
		String k34_itemName3 = "HBAF 인절미맛 아몬드(INJEOLMI)";// String변수 k34_itemName3을 선언하고 아이템3의 이름으로 초기화한다.
		String k34_itemCode3 = "1020800";// String변수 k34_itemCode3을 선언하고 아이템3의 코드로 초기화한다.
		int k34_price3 = 2500;// int변수 k34_price3을 선언하고 아이템3의 가격으로 초기화한다.
		int k34_amount3 = 2;// int변수 k34_amount3을 선언하고 아이템3의 갯수로 초기화한다.
		
		
		int k34_totalPrice = (k34_price1 * k34_amount1) + (k34_price2 * k34_amount2) + (k34_price3 * k34_amount3);
						     // int변수 k34_totalPrice을 선언하고 아이템1 + 아이템2 + 아이템3의 가격과 갯수를 곲한 값을 모두 더해 초기화한다. (총 금액)
		double k34_taxRate = 0.1;//double변수 k34_taxRate을 선언하고 0.1로 초기화한다. (세율 = 10%)
		int k34_netPrice = (int) (k34_totalPrice / (1 + k34_taxRate));// 세전 금액 계산을 위한 int형 변수 k34_netPrice를 선언하고 총 금액을 1 + 세율로 나눈 값을 대입한다.
		int k34_tax = k34_totalPrice - k34_netPrice;// 세금 계산을 위한 int형 변수 k34_tax를 선언하고 총 금액에서 세전 금액을 뺀 값을 대입한다.
		
		// 출력 전 금액에 세자리마다 콤마를 찍기 위해 DecimalFormat 클래스를 가져온다.
		DecimalFormat k34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat 클래스를 사용하기 위해 객체를 생성하고 양식을 지정해준다.
				
		// 현재 시간을 출력하기 위해 Calendar 클래스를 가져온다.
		Calendar k34_cal = Calendar.getInstance();// Calendar 클래스를 사용하기 위해 객체를 생성한다.
		k34_cal.setTime(new Date());// 현재 날짜를 구한다.
		SimpleDateFormat k34_sd1 = new SimpleDateFormat("MM월dd일");// 교환/환불 날짜를 양식대로 출력하기 위해 SimpleDateFormat클래스의 객체를 생성하고 양식을 지정한다.
		SimpleDateFormat k34_sd2 = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// 현재 시간을 양식대로 출력하기 위해 SimpleDateFormat클래스의 객체를 생성하고 양식을 지정한다.	
	
		System.out.printf("              \"국민가게, 다이소\"\n");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부, 신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현\n동)\n");
		System.out.printf("===============================================\n");
		System.out.printf("         소비자중심경영 (CCM) 인증기업\n");
		System.out.printf("        ISO 9001 품질경영시스템 인증기업\n");
		System.out.printf("===============================================\n");
		k34_cal.add(Calendar.DATE, + 14);// 교환/환불은 14일 이내로 가능하므로 + 14를 해준다.
		System.out.printf("         교환/환불 14일(%s)이내,\n", k34_sd1.format(k34_cal.getTime()));
		System.out.printf("(전자)영수증, 결제카드 지참 후 구입매장에서 가능\n");
		System.out.printf("       포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("         체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("===============================================\n");
		k34_cal.setTime(new Date());// 현재 날짜를 다시 세팅한다.
		System.out.printf("[POS 1058231]               %s\n", k34_sd2.format(k34_cal.getTime()));
		System.out.printf("===============================================\n");
		
		// 첫번째 품목 출력
		int k34_itemNamebyte = 0;// 문자열의 byte 수를 저장하기 위한 int변수 k34_itemNamebyte를 선언한다.
		
		if (k34_itemName1.length() < 15) {// 만약 아이템1 이름의 길이가 15자 미만이라면
			k34_itemNamebyte = k34_getTextByte(k34_itemName1);// k34_getTextByte함수를 호출해 k34_itemName1을 인자로 넣어준다.
		} else {// 아이템1 이름의 길이가 15자 이상이라면
			k34_itemNamebyte = k34_getTextByte(k34_itemName1.substring(0, 14));// substring을 이용해 14글자까지 자르고 k34_getTextByte함수에 넣는다.
		}
		System.out.printf("%-1.14s", k34_itemName1);// k34_itemName1을 출력한다.
		for (int k34_i = k34_itemNamebyte; k34_i < 28; k34_i++) {// 문자열의 길이를 맞추기 위한 반복문
				System.out.printf(" ");
		}
		System.out.printf(" %5s   %2s   %4s\n", k34_df.format(k34_price1), k34_amount1, k34_df.format(k34_price1 * k34_amount1));
		System.out.printf("[%s]\n", k34_itemCode1);
		
		// 두번째 품목 출력
		if (k34_itemName2.length() < 15) {// 만약 아이템2 이름의 길이가 15자 미만이라면
			k34_itemNamebyte= k34_getTextByte(k34_itemName2);// k34_getTextByte함수를 호출해 k34_itemName2을 인자로 넣어준다.
		} else {
			k34_itemNamebyte = k34_getTextByte(k34_itemName2.substring(0, 14));// substring을 이용해 14글자까지 자르고 k34_getTextByte함수에 넣는다.
		}
		System.out.printf("%-1.14s", k34_itemName2);// k34_itemName2을 출력한다.
		for (int k34_i = k34_itemNamebyte; k34_i < 28; k34_i++) {// 문자열의 길이를 맞추기 위한 반복문
				System.out.printf(" ");
		}
		System.out.printf(" %5s   %2s   %4s\n", k34_df.format(k34_price2), k34_amount2, k34_df.format(k34_price2 * k34_amount2));
		System.out.printf("[%s]\n", k34_itemCode2);	
		
		// 세번째 품목 출력
		if (k34_itemName3.length() < 15) {// 만약 아이템3 이름의 길이가 15자 미만이라면
			k34_itemNamebyte= k34_getTextByte(k34_itemName3);// k34_getTextByte함수를 호출해 k34_itemName3을 인자로 넣어준다.
		} else {
			k34_itemNamebyte = k34_getTextByte(k34_itemName3.substring(0, 14));// substring을 이용해 14글자까지 자르고 k34_getTextByte함수에 넣는다.
		}
		System.out.printf("%-1.14s", k34_itemName3);// k34_itemName3을 출력한다.
		for (int k34_i = k34_itemNamebyte; k34_i < 28; k34_i++) {// 문자열의 길이를 맞추기 위한 반복문
			System.out.printf(" ");
		}		
		System.out.printf(" %5s   %2s   %4s\n", k34_df.format(k34_price3), k34_amount3, k34_df.format(k34_price3 * k34_amount3));
		System.out.printf("[%s]\n", k34_itemCode3);
		
		System.out.printf("            과세합계                   %8s\n", k34_df.format(k34_netPrice));
		System.out.printf("              부가세                   %8s\n", k34_df.format(k34_tax));
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("판매합계                               %8s\n", k34_df.format(k34_totalPrice));
		System.out.printf("===============================================\n");
		System.out.printf("신용카드                               %8s\n", k34_df.format(k34_totalPrice));
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("우리카드                       538720**********\n");
		System.out.printf("승인번호 77982840(0)            승인금액 %5s\n", k34_df.format(k34_totalPrice));
		System.out.printf("===============================================\n");
		System.out.printf("        %s 분당서현점\n", k34_sd2.format(k34_cal.getTime()));
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("             2112820610158231\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf(" ◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서\n  회원가입 후 다양한 혜택을 누려보세요! ◈\n");
		}
	
	public static int k34_getTextByte(String k34_s) {// 아이템 이름의 byte수를 세기 위한 함수
		int k34_en = 0, k34_kr = 0, k34_etc = 0;// int형 변수 k34_en(영어), k34_kr(한글), k34_etc(기타)를 선언하고 0으로 초기화한다.
		char[] k34_str = k34_s.toCharArray();// 아이템 이름을 한글자씩 잘라 char배열 k34_str에 넣는다.
		for (int k34_i = 0; k34_i < k34_str.length; k34_i++) {// 아이템 이름의 byte수를 세기 위한 반복문
			if (k34_str[k34_i] >= 'A' && k34_str[k34_i] <= 'z') {// k34_str배열 인덱스의 값이 영어이면
				k34_en++;// 영어는 1바이트이므로 1을 더한다.
			} else if (k34_str[k34_i] >= '\uAC00' && k34_str[k34_i] <= '\uD7A3') {// k34_str배열 인덱스의 값이 한글이면 (아스키코드로 정의)
				k34_kr += 2;// 한글은 2바이트이므로 2를 더한다.
			} else {
				k34_etc++;// 띄어쓰기나 특수문자라면 1을 더한다.
			}
		}
		return k34_en + k34_kr + k34_etc;// 위 세 변수의 값을 합쳐 총 byte수를 반환한다.
	}
}

