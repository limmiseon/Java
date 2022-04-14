package softwarecoding003;

import java.text.DecimalFormat;// 금액에 콤마를 찍기 위한 라이브러리 클래스
import java.text.SimpleDateFormat;// 실행 시간 출력 양식을 지정하기 위한 라이브러리 클래스
import java.util.Calendar;// 현재 날짜와 시간을 얻기 위한 라이브러리 클래스

public class SoftwareCoding003_myTest003 {

	public static void main(String[] args) {
		int kopo34_myWon = 1000000;// kopo34_myWon이라는 int형 변수를 선언하고, 환전 할 금액인 100만원으로 초기화한다.
		double kopo34_moneyEx = 1238.21;// kopo34_moneyEx이라는 double형 변수를 선언하고, 달러 환율인 1238.21로 초기화한다.
		double kopo34_commission = 0.003;// kopo34_commission이라는 double형 변수를 선언하고, 환전 수수료인 0.3%로 초기화한다.
		
		int kopo34_usd = (int) (kopo34_myWon / kopo34_moneyEx);// 미화 계산을 위한 int형 변수 kopo34_usd를 선언하고, 전체 금액을 환율로 나눈다.
															// 최종 금액을 정수형으로 만들면 소숫점은 자동 버림처리가 된다.
		int kopo34_remain = (int) (kopo34_myWon - kopo34_usd * kopo34_moneyEx);// 잔돈 계산을 위한 int형 변수 kopo34_remain를 선언하고,
																			  // 전체 금액에서 달러 * 환율의 값을 빼 준다.
		
		double kopo34_comPerOne = kopo34_moneyEx * kopo34_commission; // 수수료 계산을 위한 double형 변수 kopo34_comPerOne를 선언하고,
																	 // 1달러 당 수수료를 계산한 값을 대입한다.
		double kopo34_totalCom = kopo34_usd * kopo34_comPerOne; // 수수료 계산을 위한 double 형 변수 kopo34_totalCom을 선언하고,
															   // 전체 달러 금액에 달러 당 수수료를 곱한 값을 대입한다.
		
		//그러나 이렇게 계산하면 수수료의 1원 이하 금액(소숫점)만큼 은행이 손해를 본다. 따라서 1원 이하 금액은 올림처리 해야 한다.
		int kopo34_i_totalCom;// 수수료를 올림처리한 최종 수수료 금액을 저장하기 위한 int형 변수 kopo34_i_totalCom를 선언한다.
		if (kopo34_totalCom != (double) ((int)kopo34_totalCom)) {// 만약 전체 수수료에 소숫점이 있으면
			kopo34_i_totalCom = (int) kopo34_totalCom + 1;// 소숫점을 버리고 1원을 더해 올림처리 한 값을 kopo34_i_totalCom에 대입한다.
		} else { // 전체 수수료에 소숫점이 없으면
			kopo34_i_totalCom = (int) kopo34_totalCom;// 전체 수수료 값을 그대로 kopo34_i_totalCom에 대입한다.
		}
		
		// 잔돈 계산을 다시 해준다.
		kopo34_remain = (int) (kopo34_myWon - kopo34_usd * kopo34_moneyEx - kopo34_i_totalCom);// 총 금액에서 달러 * 환율 값을 빼고, 전체 수수료를 빼 준다.
		
		// 그러나 이렇게 계산하면 잔돈이 음수로 나와 고객이 돈을 더 내야하는 상황이 발생한다.
		// 따라서 실수형으로 먼저 1달러 + 1달러 당 환전 수수료의 금액을 계산하고 이를 전체금액으로 나누어 주어야 한다.
		
		// 미화 계산을 다시 해준다.
		kopo34_usd = (int) (kopo34_myWon / (kopo34_moneyEx + kopo34_comPerOne));// 전체 금액 나누기 (환율 + 달러 당 수수료 값)의 값을 kopo34_usd에 대입한다.
		
		// 수수료 계산을 다시 해준다.
		kopo34_totalCom = kopo34_usd * kopo34_comPerOne;// 총 수수료 = 달러 금액 * 달러 당 수수료
		
		// 수수료 올림처리를 위한 조건문을 작성한다.
		if (kopo34_totalCom != (double) ((int)kopo34_totalCom)) {// 만약 전체 수수료에 소숫점이 있으면
			kopo34_i_totalCom = (int) kopo34_totalCom + 1;// 소숫점을 버리고 1원을 더해 올림처리 한 값을 kopo34_i_totalCom에 대입한다.
		} else { // 전체 수수료에 소숫점이 없으면
			kopo34_i_totalCom = (int) kopo34_totalCom;// 전체 수수료 값을 그대로 kopo34_i_totalCom에 대입한다.
		}	
		
		// 미화와 전체 수수료 금액이 바뀌었으므로 잔돈 계산을 다시 해준다.
		kopo34_remain = (int) (kopo34_myWon - kopo34_usd * kopo34_moneyEx - kopo34_i_totalCom);
				
		// 출력 전 금액에 세자리마다 콤마를 찍기 위해 DecimalFormat 클래스를 가져온다.
		DecimalFormat kopo34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat 클래스를 사용하기 위해 객체를 생성하고 양식을 지정해준다.
		
		// 현재 시간을 출력하기 위해 Calendar 클래스를 가져온다.
		Calendar kopo34_cal = Calendar.getInstance();// Calendar 클래스를 사용하기 위해 객체를 생성한다.
		SimpleDateFormat kopo34_sd = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// SimpleDateFormat 클래스를 사용하기 위해 객체를 생성하고 양식을 지정해준다.
		
		System.out.printf("**************************************************************************************\n");
		System.out.printf("*                                수수료 적용 환전                                    *\n");
		
		// DecimalFormat을 사용해 printf로 출력할 때는 서식지정자를 %s로 바꿔야 한다.
		System.out.printf("총 수수료 : %s원 => 미화 : %s달러, 달러 당 수수료 : %f원\n", 
				 	 	  kopo34_df.format(kopo34_i_totalCom),
					 	  kopo34_df.format(kopo34_usd),
						  kopo34_comPerOne);
		
		
		System.out.printf("총 한화 환전 금액 : %s원 => 미화 : %s달러, 수수료 징구 : %s원, 잔돈 : %s원\n",
				kopo34_df.format(kopo34_myWon),
				kopo34_df.format(kopo34_usd),
				kopo34_df.format(kopo34_i_totalCom),
				kopo34_df.format(kopo34_remain));
		
		// SimpleDateFormat을 사용해 printf로 출력할 때는 서식지정자를 %s로 바꿔야 한다.
		System.out.printf("실행 시간 : %s\n", kopo34_sd.format(kopo34_cal.getTime()));
		System.out.printf("**************************************************************************************\n");
	}

}
