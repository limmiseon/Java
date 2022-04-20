package softwarecoding006;

import java.text.DecimalFormat;// 금액에 콤마를 찍기 위한 라이브러리 클래스
import java.text.SimpleDateFormat;// 실행 시간 출력 양식을 지정하기 위한 라이브러리 클래스
import java.util.Calendar;// 날짜와 시간을 얻기 위한 라이브러리 클래스
import java.util.Date;// 현재 날짜와 시간을 얻기 위한 라이브러리 클래스

public class SoftwareCoding006_practice003 {

	public static void main(String[] args) {
		String[] k34_itemName = { "바나나 우유", "몽쉘", "건포도", "오렌지주스", "초코에몽", "피코크 들깨미역국500g", "남양 맛있는우유 GT 저지방", "녹차원 흑당시럽 10입",
				"진라면소컵(매)65*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루 우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G", "피코크 들깨미역국 500g", "흑원당 말차 밀크티",
				"1+ 등급란 10개입 특", "동원양반볶음김치기획", "해피홈 SAFE365 핸드크림", "(G)LH원형유리화병 10개입", "상투과자E", "더블링 나일론 깡 롤 브러쉬",
				"농심 신라면120*5", "(대)국내산삼겹살찌개", "오뚜기 진비빔면 156g", "GAP 죽장사과 4-6입/봉", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살", "(달콤)순살닭강정(g)",
				"DZ주니어양말3족C_BK", "프리미엄생연어초밥", "로얄허니브레드", "아일랜드드레싱535g"};// String배열 k34_itemName을 선언하고 초기화한다. (품목명)
		int[] k34_price = { 15000000, 3000, 3300, 1500, 1300, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 7500, 6900, 5980, 3300, 5500, 3380, 6610,
				2750, 10800, 4980, 2480, 7920, 4980, 7130, 4500, 1950 };// k34_price배열 k34_price을 선언하고 초기화한다. (단가)
		int [] k34_amount = { 2, 4, 1, 1, 10, 5, 3, 2, 1, 1, 4, 7, 3, 8, 2, 9, 5, 1, 2, 2, 1, 7, 3, 5, 4, 3, 1, 7, 2, 4, 1, 2 };// int배열 k34_num을 선언하고 초기화한다. (수량)
		boolean[] k34_taxfree = { false, false, true, false, false, false, true, false, false, false, true, false, false, false, false, true, false, false, false, 
				false, false, false, false, false, true, true, false, false, false, false, false, false};// boolean변수 k34_taxfree을 선언하고 초기화한다. (면세 유무)
		double k34_taxRate = 0.1;// double변수 k34_taxRate를 선언하고 초기화한다. (세율 = 10%)
		
		int k34_arrCount = k34_itemCount(k34_itemName);
		int k34_totalSum = k34_totalSum(k34_arrCount, k34_taxfree, k34_price, k34_amount);// 과세 상품의 합을 구하기 위한 k34_totalSum 메소드를 호출한다.
		int k34_taxFreeSum = k34_taxFreeSum(k34_arrCount, k34_taxfree, k34_price, k34_amount);// 면세 상품의 합을 구하기 위한 k34_taxFreeSum 메소드를 호출한다.
		int k34_netPrice = k34_netPrice(k34_totalSum, k34_taxRate);// 세전 금액 계산을 위한 int변수 k34_netPrice를 선언하고 과세 대상 금액을 (1 + 세율)로 나눈 값으로 초기화한다.
		double k34_taxPrice = k34_taxPrice(k34_netPrice, k34_taxRate);// 부가세를 계산하기 위한 int변수 k34_taxPrice를 선언하고 세전 금액을 세율로 곱한 값으로 저장한다.
		int k34_totalTaxPrice = k34_totalTaxPrice(k34_taxPrice);// 부가세 올림처리를 위한 int변수 k34_totalTaxPrice를 선언하고 0으로 초기화한다.
		int k34_totalPrice = k34_totalSum + k34_taxFreeSum;// 총 지불 금액 계산을 위한 int변수 k34_totalPrice를 선언하고 면세 금액의 합과 과세 금액의 합을 더한 값으로 초기화한다.
		
		k34_titlePrint();
		k34_timeStemp();
		k34_headerPrint();
		for (int k34_i = 0; k34_i < k34_arrCount; k34_i++) {
			if ((k34_i != 0) && (k34_i % 5 == 0)) {// 품목 5개마다 점선을 표시하기 위한 조건문
												   // k34_i가 0이 아니고 k34_i를 5로 나눈 나머지가 0이라면(= 5의 배수라면)
				System.out.printf("-----------------------------------------\n");// 점선을 출력한다.
			}
			k34_itemPrint(k34_itemName[k34_i], k34_taxfree[k34_i], k34_price[k34_i], k34_amount[k34_i]);
		}
		k34_totalPrint(k34_arrCount, k34_taxFreeSum, k34_netPrice, k34_totalTaxPrice, k34_totalPrice);
	}
	
	public static int k34_itemCount(String[] itemArray) {// 품목의 갯수를 구하는 메소드
		return itemArray.length;
	}
	
	public static void k34_titlePrint() {// 타이틀을 출력하는 메소드
		System.out.printf("              이마트 죽전점 (031)888-1234\n");
		System.out.printf("     emart    206-86-50913 강희석\n");
		System.out.printf("              용인 수지구 포은대로 552\n");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		System.out.printf("\n");
	}
	
	public static void k34_timeStemp() {// 시간을 출력하는 메소드
		// 현재 시간을 출력하기 위해 Calendar 클래스를 가져온다.
		Calendar k34_cal = Calendar.getInstance();// Calendar 클래스를 사용하기 위해 객체를 생성한다.
		k34_cal.setTime(new Date());// 현재 날짜를 구한다.
		SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY-MM-dd HH:mm");// 현재 시간을 양식대로 출력하기 위해 SimpleDateFormat클래스의 객체를 생성하고 양식을 지정한다.
		System.out.printf("[구 매]%s     POS:0011-9861\n", k34_sd.format(k34_cal.getTime()));
	}
	
	public static void k34_headerPrint() {// 헤더를 출력하는 메소드
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  상 품 명         단 가  수량     금 액\n");
		System.out.printf("-----------------------------------------\n");	
	}
	
	public static void k34_itemPrint(String k34_itemName, boolean k34_taxFree, int k34_price, int k34_amount) {// 품목을 출력하는 메소드
		// 금액에 세자리마다 콤마를 찍기 위해 DecimalFormat 클래스를 가져온다.
		DecimalFormat k34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat 클래스를 사용하기 위해 객체를 생성하고 양식을 지정해준다.	
		
			if (k34_taxFree) {// 면세 대상 품목에 별을 추가하기 위한 조건문
				 					 // k34_taxfree 배열의 k34_i번째 인덱스의 값이 참이라면(면세 상품이라면)
			System.out.printf("* ");// 별을 출력한다.
			} else {// k34_taxfree 배열의 k34_i번째 인덱스의 값이 거짓이라면(과세 상품이라면)
			System.out.printf("  ");
			}
			k34_printItemName(k34_itemName);
			System.out.printf("%10.10s %2s %10s\n", k34_df.format(k34_price), k34_amount, k34_df.format(k34_price * (k34_amount)));	
	}
	
	public static int k34_taxFreeSum(int k34_arrCount, boolean[] k34_taxfree, int[] k34_price, int[] k34_amount) {// 면세 상품의 합계 금액을 구하는 메소드
		int k34_taxFreeSum = 0;
		for (int k34_i = 0; k34_i < k34_arrCount; k34_i++) {// k34_i는 0부터 시작하고, k34_itemName 배열의 길이만큼 반복하며, 실행문이 끝나면 k34_i를 1씩 증가시킨다.
																   // 면세 상품의 합계 금액을 구하는 반복문
			if (k34_taxfree[k34_i]) {// 만약 k34_taxfree 배열에 k34_i인덱스의 값이 참이라면
				k34_taxFreeSum += k34_price[k34_i] * k34_amount[k34_i];// k34_taxFreeSum에 가격 * 수량을 곱한 값을 누적 합산한다.
			}		
		}
		return k34_taxFreeSum;// 합계 금액을 반환한다.
	}
	
	public static int k34_totalSum(int k34_arrCount, boolean[] k34_taxfree, int[] k34_price, int[] k34_amount) {// 과세 상품의 합계 금액을 구하는 메소드
		int k34_totalSum = 0;
		for (int k34_i = 0; k34_i < k34_arrCount; k34_i++) {// k34_i는 0부터 시작하고, k34_itemName 배열의 길이만큼 반복하며, 실행문이 끝나면 k34_i를 1씩 증가시킨다.
			   													   // 과세 상품의 합계 금액을 구하는 반복문
			if (!k34_taxfree[k34_i]) {// k34_taxfree 배열에 k34_i인덱스의 not 값이 참이라면
			k34_totalSum += k34_price[k34_i] * k34_amount[k34_i];// k34_totalSum에 가격 * 수량을 곱한 값을 누적 합산한다.
			}
		}
		return k34_totalSum;// 합계 금액을 반환한다.
	}
	
	public static int k34_netPrice(int k34_totalSum, double k34_taxRate) {// 세전 금액을 계산하는 메소드
		return (int) (k34_totalSum / (1 + k34_taxRate));
	}
	
	public static double k34_taxPrice(int k34_netPrice, double k34_taxRate) {// 세금을 계산하는 메소드
		return (k34_netPrice * k34_taxRate);
	}
	
	public static int k34_totalTaxPrice(double k34_taxPrice) {// 최종 세금을 계산하는 메소드
		int k34_totalTaxPrice = 0;
		if (k34_taxPrice != (double) (int) k34_taxPrice) {// 만약 부가세에 소숫점이 있으면
			k34_totalTaxPrice = (int) (k34_taxPrice + 1);// 소숫점을 버리고 1원을 더해 올림처리 한 값을 k34_totalTaxPrice에 대입한다.
		} else {// 부가세에 소숫점이 없으면
			k34_totalTaxPrice = (int) k34_taxPrice;// 부가세 값을 그대로 k34_totalTaxPrice에 대입한다.
		}
		return k34_totalTaxPrice;
	}
	
	
	public static void k34_totalPrint(int k34_arrCount, int k34_taxFreeSum, int k34_netPrice, int k34_totalTaxPrice, int k34_totalPrice) {// 영수증 하단을 출력하는 메소드
		// 금액에 세자리마다 콤마를 찍기 위해 DecimalFormat 클래스를 가져온다.
		DecimalFormat k34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat 클래스를 사용하기 위해 객체를 생성하고 양식을 지정해준다.
		// 현재 시간을 출력하기 위해 Calendar 클래스를 가져온다.
		Calendar k34_cal = Calendar.getInstance();// Calendar 클래스를 사용하기 위해 객체를 생성한다.
		k34_cal.setTime(new Date());// 현재 날짜를 구한다.
		SimpleDateFormat k34_sd2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		SimpleDateFormat k34_sd3 = new SimpleDateFormat("YYYYMMdd");
		System.out.printf("\n");
		System.out.printf("%22s%14.14s\n", "총 품목 수량", k34_df.format(k34_arrCount));
		System.out.printf("%23s%14.14s\n", "(*)면 세  물 품", k34_df.format(k34_taxFreeSum));
		System.out.printf("%23s%14.14s\n", "과 세  물 품", k34_df.format(k34_netPrice));
		System.out.printf("%24s%14.14s\n", "부   가   세", k34_df.format(k34_totalTaxPrice));
		System.out.printf("%25s%14.14s\n", "합        계", k34_df.format(k34_totalPrice));
		System.out.printf("%-20s%15.15s\n", "결 제 대 상 금 액", k34_df.format(k34_totalPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0012 KEB 하나       541707**0484/35860658\n");
		System.out.printf("카드결제(IC)%26s\n", "일시불 / " + k34_df.format(k34_totalPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("           [신세계포인트 적립]\n");
		System.out.printf("홍*두 고객님의 포인트 현황입니다.\n");
		int k34_addpoint = k34_totalPrice / 1000;// 포인트 적립을 위한 int변수 k34_addpoint를 선언하고 총 지불 금액을 1000으로 나눈 값으로 초기화한다. (= 0.1% 적립)
		int k34_point = 5473;// 기존 포인트 5473원을 저장하기 위한 int변수 k34_point을 선언하고 5473으로 초기화한다.
		System.out.printf("금회발생포인트         9350**9995%8d\n", k34_addpoint);
		System.out.printf("누계(가용)포인트     %10.10s(%8s)\n",
						  k34_df.format(k34_point + k34_addpoint), k34_df.format(k34_point));// 누계 포인트는 기존 포인트 + 금회 발생 포인트를 더한 값으로 출력한다.
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   구매금액기준 무료주차시간 자동부여   \n");
		System.out.printf("차량번호 :                       34저****\n");
		System.out.printf("입차시간 :            %s\n", k34_sd2.format(k34_cal.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("캐셔:084599 양OO                     1150\n");
		System.out.printf("      %s/00119861/00164980/31\n", k34_sd3.format(k34_cal.getTime()));
	}

	public static void k34_printItemName(String k34_s) {// 아이템 이름의 길이를 세기 위한 메소드
		int k34_byte = 0;
		char[] k34_str = k34_s.toCharArray();// 아이템 이름을 한글자씩 잘라 char배열 k34_str에 넣는다.
		
		for (int k34_i = 0; k34_i < k34_str.length; k34_i++) {// 아이템 이름의 길이를 세기 위한 반복문
			if (k34_str[k34_i] >= 'A' && k34_str[k34_i] <= 'z') {// k34_str배열 k34_i번째 인덱스의 값이 영어이면
				k34_byte++;// 영어는 1칸을 차지하므로 1을 더한다.
			} else if (k34_str[k34_i] >= '\uAC00' && k34_str[k34_i] <= '\uD7A3') {// k34_str배열 k34_i번째 인덱스의 값이 한글이면 (유니코드로 정의)
				k34_byte += 2;// 한글은 2칸을 차지하므로 2를 더한다.
			} else {
				k34_byte++;// 그 외 띄어쓰기나 특수문자라면 1을 더한다.
			}
			if (k34_byte > 15) {// 만약 바이트 수가 15보다 크고
				if (k34_str[k34_i] >= '\uAC00' && k34_str[k34_i] <= '\uD7A3')// 인쇄 마지막 글자가 한글이라면
					System.out.printf(" ");// 한글 대신 공백을 출력하고
				break;// for문에서 빠져나간다.
			}
			System.out.printf("%s", k34_str[k34_i]);
			if (k34_byte == 15) {// 만약 바이트 수가 15이라면
				break;// for문에서 빠져나간다.
			}
			}
		for (int k34_j = k34_byte; k34_j < 15; k34_j++) {// 글자수가 작은 아이템의 공백을 출력하기 위한 반복문
														 // k34_j는 k34_byte(바이트 수)부터 시작하고, k34_j가 16보다 작을 때 반복되며, 실행문이 끝나면 k34_j를 1씩 더한다.
			System.out.printf(" ");
		}
	}
}
