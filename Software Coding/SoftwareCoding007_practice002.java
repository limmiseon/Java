package softwarecoding007;

import java.text.DecimalFormat;

public class SoftwareCoding007_practice002 {

	public static void main(String[] args) {
		// 합계 검증 프로그램
		String[] k34_OneRec = {
				"  바나나 우유         1,500  2      2,000",
				"  몽쉘                3,000  4     12,000",
				"* 건포도              3,300  1      3,300",
				"  오렌지주스          1,500  1      1,500",
				"  초코에몽            1,300 10     13,000",
				"  피코크 들깨미역     4,480  5     22,400",
				"* 남양 맛있는우유     4,980  3     14,940",
				"  녹차원 흑당시럽     3,210  2      6,420",
				"  진라면소컵(매)6     6,950  1      6,950",
				"  케라시스 앰플       2,980  1      2,980",
				"* 푸르밀 미숫가루     1,990  4      7,960",
				"  자일로스갈색설      1,980  7     13,860",
				"  CJ 비비고칩 20G     3,980  3     11,940",
				"  피코크 들깨미역     4,480  8     35,840",
				"  흑원당 말차 밀      3,480  2      6,960",
				"* 1+ 등급란 10개      7,980  9     71,820",
				"  동원양반볶음김      7,500  5     37,500",
				"  해피홈 SAFE365      6,900  1      6,900",
				"  (G)LH원형유리화     5,980  2     11,960",
				"  상투과자E           3,300  2      6,600",
				"  더블링 나일론       5,500  1      5,500",
				"  농심 신라면120*     3,380  7     23,660",
				"  (대)국내산삼겹      6,610  3     19,830",
				"  오뚜기 진비빔면     2,750  5     13,750",
				"* GAP 죽장사과 4-    10,800  4     33,200",
				"* 순 유기농 바나      4,980  3     14,940",
				"  피코크 탄두리       2,480  1      2,480",
				"  (달콤)순살닭강      7,920  7     55,440",
				"  DZ주니어양말3족     4,980  2      9,960",
				"  프리미엄생연어      7,130  4     28,520",
				"  로얄허니브레드      4,500  1      4,500",
				"  아일랜드드레싱5     1,950  2      3,900" };
		
		DecimalFormat k34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat 클래스를 사용하기 위해 객체를 생성하고 양식을 지정해준다.
		
		String k34_priceStr = "";// 가격을 자른 문자열을 저장하는 String변수
		String k34_amountStr = "";;// 갯수를 자른 문자열을 저장하는 String변수
		String k34_totalPriceStr = "";// 총 금액을 자른 저장하는 위한 String변수
		
		int k34_price = 0;// 가격 문자열을 정수형으로 변환한 후 저장하는 int변수
		int k34_amount = 0;// 갯수 문자열을 정수형으로 변환한 후 저장하는 int변수
		int k34_totalPrice = 0;// 총 금액을 정수형으로 변환한 후 저장하는 int변수
		
		String k34_modifyStr;// 수정된 문자열을 저장하는 변수
		
		for (int k34_i = 0; k34_i < k34_OneRec.length; k34_i++) {// 문자열을 자르고, 정수형으로 변환하고, 합계를 검증하기 위한 반복문
			byte[] k34_gb = k34_OneRec[k34_i].getBytes();// k34_OneRec 배열 k34_i번째 인덱스의 문자열을 바이트로 변환한다.
			
			k34_priceStr = new String(k34_gb, 17, 10);// 17번째 바이트부터 10개를 잘라 가격 배열에 넣는다.
			k34_priceStr = k34_priceStr.replaceAll(",", "");// 콤마를 제거한다.
			k34_priceStr = k34_priceStr.replaceAll(" ", "");// 공백을 제거한다.
			k34_price = Integer.parseInt(k34_priceStr);// 정수형으로 변환 후 int배열에 넣는다.
			
			k34_amountStr = new String(k34_gb, 27, 3);// 27번째 바이트부터 3개를 잘라 갯수 배열에 넣는다.
			k34_amountStr = k34_amountStr.replaceAll(",", "");// 콤마를 제거한다.
			k34_amountStr = k34_amountStr.replaceAll(" ", "");// 공백을 제거한다.
			k34_amount = Integer.parseInt(k34_amountStr);// 정수형으로 변환 후 int배열에 넣는다.
			
			k34_totalPriceStr = new String(k34_gb, 30, 11);// 30번째 바이트부터 11개를 잘라 품목당 금액 배열에 넣는다.
			k34_totalPriceStr = k34_totalPriceStr.replaceAll(",", "");// 콤마를 제거한다.
			k34_totalPriceStr = k34_totalPriceStr.replaceAll(" ", "");// 공백을 제거한다.
			k34_totalPrice = Integer.parseInt(k34_totalPriceStr);// 정수형으로 변환 후 int배열에 넣는다.
			
			if ((k34_price* k34_amount) != k34_totalPrice) {// 만약 가격 * 갯수가 총 금액과 같지 않다면
				System.out.printf("*************************\n");
				System.out.printf("오류 :%s\n", k34_OneRec[k34_i]);
				// 수정된 문자열 = 총 금액 전까지의 문자열 + 수정된 총 금액 문자열
				k34_modifyStr = new String(k34_gb, 0, 30) + String.format("%11.11s", k34_df.format(k34_price * k34_amount));
				System.out.printf("수정 :%s\n", k34_modifyStr);
				System.out.printf("*************************\n");
			}
		}
	}
}
