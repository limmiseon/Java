package softwarecoding003;

import java.util.Arrays;

public class SoftwareCoding003_myTest002 {
	
	public static void main(String[] args) {
		String[] kopo34_item = { "빼빼로", "뿌셔뿌셔", "뽀또", "오레오", "쿠크다스" };// kopo34_item이라는 string 배열 변수를 선언하고 초기화한다.(과자 이름)
		int[] kopo34_price = { 1000, 950, 2500, 1500, 2000 };// kopo34_price라는 int 배열 변수를 선언하고 초기화한다. (과자 가격)
		int[] kopo34_amount = { 10, 3, 4, 5, 1 };// kopo34_amount라는 int 배열 변수를 선언하고 초기화한다.(과자 개수)
		double kopo34_taxRate = 0.1;// kopo34_taxRate라는 double 변수를 선언하고 초기화한다.(세율 = 10%)
		int kopo34_total_sum = 0;// total_sum이라는 int형 변수를 선언하고 초기화한다.(최종 지불 금액)
		
		System.out.printf("*******************************************************\n");
		System.out.printf("                      과자 목록                       \n");
		System.out.printf(" 항 목           단 가         수 량            합 계      \n");
		
		// 과자 목록을 출력하기 위해 for문을 사용한다.
		for (int kopo34_i = 0; kopo34_i < kopo34_item.length; kopo34_i++) {// i는 0부터 시작하고, kopo34_item 배열의 길이만큼 반복하며, 실행문이 끝나면 i를 1씩 증가시킨다.
			int kopo34_sum = kopo34_price[kopo34_i] * kopo34_amount[kopo34_i];// kopo34_sum이라는 int형 배열을 선언하고, 과자 가격과 개수를 곱한 값을 대입한다.
			kopo34_total_sum += kopo34_sum;// 최종 지불 금액(kopo34_total_sum)에 kopo34_sum의 값을 누적 합산한다.
			itemPrint(kopo34_item[kopo34_i]);// itemPrint 함수를 사용하여 과자 이름을 출력한다.
			System.out.printf("%5d         %5d           %6d\n", kopo34_price[kopo34_i], kopo34_amount[kopo34_i], kopo34_sum);// 과자 가격과 개수, 그 둘을 곱한 합계 가격을 출력한다.
		}
		
		System.out.printf("*******************************************************\n");
		System.out.printf(" 지불 금액 :                     %20d\n", kopo34_total_sum);// 소비자가 지불해야 할 총 금액을 출력한다.(세전금액 + 세금)
		
		int kopo34_totalNetPrice = (int) (kopo34_total_sum / (1 + kopo34_taxRate));// 세전 금액 계산을 위한 int형 변수 kopo34_totalNetPrice를 선언하고 총 금액을 1 + 세율로 나눈 값을 대입한다.
		System.out.printf(" 과세 금액 :                     %20d\n", kopo34_totalNetPrice);// 세전 금액을 출력한다.
		int kopo34_tax = kopo34_total_sum - kopo34_totalNetPrice;// 세금 계산을 위한 int형 변수 kopo34_tax를 선언하고 총 금액에서 세전 금액을 뺀 값을 대입한다.
		System.out.printf(" 세     금 :                     %20d\n", kopo34_tax);// 세금 금액을 출력한다.
	}
	
	public static void itemPrint(String kopo34_item) {// 과자 이름 출력을 위한 itemPrint 함수를 만든다. 인자는 String 변수이다.
		char[] kopo34_itemChar = kopo34_item.toCharArray();//String 변수를 한자씩 떼어 char 배열에 대입한다.
		System.out.printf(" %s",  kopo34_item);// 과자 이름을 출력한다.
		// 줄을 맞추기 위해 공백을 넣어 줄 for문을 작성한다.
		for (int kopo34_j = kopo34_itemChar.length; kopo34_j < 8; kopo34_j++) {// j는 kopo34_itemChar 배열의 길이 값부터 시작하고, 8보다 작을 때까지 반복하며, 실행문이 끝나면 j를 1씩 증가시킨다.
			System.out.print("  ");// 공백을 출력한다.(ex. "뽀또"는 2자이므로 공백을 6번 출력해 줄을 맞춘다)
		}
	}
	
}
