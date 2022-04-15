package softwarecoding004;

public class SoftwareCoding004_practice003 {

	public static void main(String[] args) {
		// 숫자형과 문자형의 비교
		// 숫자는 정수형, 실수형 비교에 주의
		int kopo34_I;// int형 변수 kopo34_I를 선언한다.
		double kopo34_D;// double형 변수 kopo34_D를 선언한다.
		
		kopo34_I = 10 / 3;// kopo34_I에 10을 3으로 나눈 값을 대입한다.(정수형 변수이기 때문에 소숫점은 버려짐)
		kopo34_D = 10 / 3.0;// kopo34_D에 10을 3.0(실수형)으로 나눈 값을 대입한다.(실수형 변수이기때문에 소숫점까지 저장됨)
		
		// int와 double은 정수형 연산과 실수형 연산이다.
		if (kopo34_I == kopo34_D) {// 만약 kopo34_I와 kopo34_D의 값이 같다면
			System.out.printf("equal\n");// "equal"을 출력한다.
		} else {// kopo34_I와 kopo34_D의 값이 다르다면
			System.out.printf("Not equal [%f][%f]\n", (double) kopo34_I, kopo34_D);// kopo34_I를 double형으로 형변환 후 kopo34_I와 kopo34_D를 출력한다.
		}
		
		// double형은 유효숫자까지 표시된 것 뿐, 뒤에 더 많은 소숫점이 존재한다.
		if (kopo34_D == 3.333333) {// 만약 kopo34_D의 값이 3.333333이라면
			System.out.printf("equal\n");// "equal"을 출력한다.
		} else {// kopo34_D의 값이 3.333333이 아니라면 다음의 내용을 출력한다.
			System.out.printf("Not equal [3.33333][%f]\n", kopo34_D);
		}
		
		kopo34_D = (int) kopo34_D;// kopo34_D를 int형으로 형변환한다.
		if (kopo34_I == kopo34_D) {// 만약 kopo34_I와 kopo34_D의 값이 같다면
			System.out.printf("equal\n");// "equal"을 출력한다.
		} else {// kopo34_I와 kopo34_D의 값이 다르다면
			System.out.printf("Not equal [%f][%f]\n", (double) kopo34_I, kopo34_D);// kopo34_I를 double형으로 형변환 후 kopo34_I와 kopo34_D를 출력한다.
		}
		
		System.out.printf("int로 인쇄 [%d][%f]\n", kopo34_I, kopo34_D);
		System.out.printf("double로 인쇄 [%f][%f]\n", (double) kopo34_I, kopo34_D);
		
		System.out.printf("34 i %d\n", (int) kopo34_I);
		char kopo34_a = 'c';
		if (kopo34_a == 'b') {
			System.out.printf("a는 b이다.\n");
		}
		if (kopo34_a == 'c') {
			System.out.printf("a는 c이다.\n");
		}
		if (kopo34_a == 'd') {
			System.out.printf("a는 d이다.\n");
		}
			
		String kopo34_aa = "abcd";
		if (kopo34_aa.equals("abcd")) {
			System.out.printf("aa는 abcd이다.\n");
		} else {
			System.out.printf("aa는 abcd가 아니다.\n");
		}
		
		boolean kopo34_bb = true;
		if (!!kopo34_bb) {
			System.out.printf("bb가 아니고 아니면 참이다.\n");
		} else {
			System.out.printf("bb가 아니고 아니면 거짓이다.\n");
		}
	}
}
