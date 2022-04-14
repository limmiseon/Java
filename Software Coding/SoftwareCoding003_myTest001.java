package softwarecoding003;

public class SoftwareCoding003_myTest001 {

	public static void main(String[] args) {
		int kopo34_price = 271;// kopo34_val라는 int형 변수를 선언하고 271로 초기화한다.(세전 물건 값)
		int kopo34_rate = 3;// kopo34_rate라는 int형 변수를 선언하고 3으로 초기화한다.(세금 = 3%)
		
		int kopo34_tax = kopo34_taxcal(kopo34_price, kopo34_rate);// kopo34_taxcal 함수를 호출한다. 인자는 val와 rate이고, result를 kopo34_tax에 대입한다.
		
		System.out.printf("**************************************\n");
		System.out.printf("*           단순 세금 계산           *\n");
		System.out.printf("실제 세금계산: %f\n", kopo34_price * kopo34_rate / 100.0);// 세전 물건 값과 세금을 곱한 뒤 100으로 나누면 세금 값이 나온다.
		System.out.printf("세전 가격: %d\n세금: %d 세포함가격: %d\n", kopo34_price, kopo34_tax, kopo34_price + kopo34_tax);// 세전 가격과 세금, 세전 가격과 세금 가격을 더한 총 금액을 계산한다.
		

	}
	// static으로 함수를 만들면 메인 함수에서 객체생성 없이 호출할 수 있다.
	public static int kopo34_taxcal(int kopo34_price, int kopo34_rate) {// 세금 계산 함수를 만든다. 인자는 int형 2개이다.
		int kopo34_ret;// kopo34_ret라는 int형 변수를 선언한다.
		
		// 소숫점까지 계산하기 위해 int형 인자를 double로 형변환 후 서로 곱하고 100을 나눠준다.
		if( ((double)kopo34_price * (double) kopo34_rate / 100.0) == kopo34_price * kopo34_rate / 100) {// 만약 세금이 소숫점 없이 떨어지면
			kopo34_ret = kopo34_price * kopo34_rate / 100;// 가격에 세율을 곱한 뒤 100으로 나눈 값을 반환한다.		
		} else {// 만약 세금에 소숫점이 있다면
			kopo34_ret = kopo34_price * kopo34_rate / 100 + 1;// 소숫점을 버리고 1을 더한 값을 반환한다.(올림처리)	
		}
		
		return kopo34_ret;// kopo34_ret의 값을 반환한다.
	}
}
