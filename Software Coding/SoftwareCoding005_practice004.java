package softwarecoding005;

import java.text.DecimalFormat;// 금액에 콤마를 찍기 위한 라이브러리 클래스
import java.text.SimpleDateFormat;// 실행 시간 출력 양식을 지정하기 위한 라이브러리 클래스
import java.util.Calendar;// 현재 날짜와 시간을 얻기 위한 라이브러리 클래스

public class SoftwareCoding005_practice004 {

	public static void main(String[] args) {
		// 영수증 출력(1)
		int k34_totalPrice = 33000;// int변수 k34_totalPrice를 선언한다. (최종 지불 금액)
		double k34_taxRate = 0.1;// double변수 k34_taxRate를 선언한다. (세율 = 10%)
		double k34_netPrice = k34_totalPrice / (1 + k34_taxRate);// double변수 k34_price를 선언하고 세전 금액으로 초기화한다.
		
		int k34_totlaNetPrice;// int변수 k34_totlaNetPrice를 선언한다. (금액에 소숫점이 있을 시 올림처리를 위함)
		if (k34_netPrice != (double) ((int)k34_netPrice)) {// 만약 세전 금액에 소숫점이 있으면
			k34_totlaNetPrice = (int) k34_netPrice + 1;// 소숫점을 버리고 1원을 더해 올림처리 한 값을 k34_totlaNetPrice에 대입한다.
		} else { // 세전 금액에 소숫점이 없으면
			k34_totlaNetPrice = (int) k34_netPrice;// 세전 금액을 그대로 k34_totlaNetPrice에 대입한다.
		}
		
		int k34_tax = k34_totalPrice - k34_totlaNetPrice;// int변수 t34_tax를 선언한다. (세금)
														 // 최종 지불 금액 - 세전금액 값으로 초기화한다.
		
		// 출력 전 금액에 세자리마다 콤마를 찍기 위해 DecimalFormat 클래스를 가져온다.
		DecimalFormat k34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat 클래스를 사용하기 위해 객체를 생성하고 양식을 지정해준다.
		
		// 현재 시간을 출력하기 위해 Calendar 클래스를 가져온다.
		Calendar k34_cal = Calendar.getInstance();// Calendar 클래스를 사용하기 위해 객체를 생성한다.
		SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// SimpleDateFormat 클래스를 사용하기 위해 객체를 생성하고 양식을 지정해준다.		
		
		System.out.printf("신용승인\n");
		System.out.printf("단말기 : 2N68665898            전표번호 : 041218\n");
		System.out.printf("가맹점 : 한양김치찌개\n");
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로351번길 10 ,\n1층\n");
		System.out.printf("대표자 : 유창신\n");
		System.out.printf("사업자 : 752-53-00558             TEL : 7055695\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("금  액                               %8s원\n", k34_df.format(k34_totlaNetPrice));
		System.out.printf("부가세                               %8s원\n", k34_df.format(k34_tax));
		System.out.printf("합  계                               %8s원\n", k34_df.format(k34_totalPrice));
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("우리카드\n");
		System.out.printf("카드번호 : 5387-20**-****-4613(S)        일시불\n");
		System.out.printf("거래일시 : %s\n", k34_sd.format(k34_cal.getTime()));
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873739\n");
		System.out.printf("매입 : 비씨카드사       가맹 : 720068568\n");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("                * 감사합니다 *\n");
		System.out.printf("                            표준V2. 08_20200212\n");
	}
}
