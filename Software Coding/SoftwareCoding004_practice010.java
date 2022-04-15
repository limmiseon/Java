package softwarecoding004;

public class SoftwareCoding004_practice010 {

	public static void main(String[] args) {
		//숫자 읽기
		String[] kopo34_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };// String배열 kopo34_units을 선언하고 초기화한다.
		for (int kopo34_i = 0; kopo34_i < 101; kopo34_i++) {// for문 : kopo34_i는 0부터 시작하고, kopo34_i가 101보다 작으면 반복하고, 실행문이 끝나면 kopo34_i를 1씩 증가시킨다.
			if (kopo34_i >= 0 && kopo34_i < 10) {// 만약 kopo34_i의 값이 0 ~ 9 사이라면
				System.out.printf("일의 자리 : %s\n", kopo34_units[kopo34_i]);// kopo34_units배열을 통해 숫자 -> 한글로 바꾼 값을 가져와 일의 자리이므로 한 글자만 출력한다.
			} else if (kopo34_i >= 10 && kopo34_i < 100) {// 만약 kopo34_i의 값이 10 ~ 99 사이라면
				int kopo34_i10, kopo34_i0;// int변수 kopo34_i10(십의 자리)과 kopo34_i0(일의 자리)을 선언한다.
				kopo34_i10 = kopo34_i / 10;// kopo34_i를 10으로 나눠 kopo34_i10에 대입한다.(십의 자리를 가져오기)
				kopo34_i0 = kopo34_i % 10;// kopo34_i를 10으로 나눈 나머지를 kopo34_i0에 대입한다.(일의 자리를 가져오기)
				if (kopo34_i0 == 0) {// 만약 kopo34_i0의 값이 0이라면(= 일의 자리가 0이라면)
					System.out.printf("십의 자리 : %s십\n", kopo34_units[kopo34_i10]);// kopo34_units배열을 통해 숫자 -> 한글로 바꾼 값을 가져와 출력하고 일의 자리는 0이므로 생략한다. 
				} else {// kopo34_i0의 값이 0이 아니라면(= 일의 자리가 0이 아니라면)
					System.out.printf("십의 자리 : %s십%s\n", kopo34_units[kopo34_i10], kopo34_units[kopo34_i0]);//  kopo34_units배열을 통해 숫자 -> 한글로 바꾼 값을 가져와 십의 자리와 일의 자리를 출력한다.
				}
			}
			else {// kopo34_i의 값이 100이라면
				System.out.printf("==> %d\n", kopo34_i);// 한글 변환을 거치지 않고 그대로 출력한다.
			}
		}
	}
}
