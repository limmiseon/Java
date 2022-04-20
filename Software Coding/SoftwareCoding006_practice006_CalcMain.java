package softwarecoding006;

public class SoftwareCoding006_practice006_CalcMain {
	
	public static void main(String[] args) {
		// Calc 클래스의 메소드를 사용하기 위해 객체를 생성한다.
		SoftwareCoding006_practice006_CalcClass k34_calc = new SoftwareCoding006_practice006_CalcClass();
		
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", k34_calc.k34_sum(1, 2));// 원래 메소드 호출
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", k34_calc.k34_sum(1, 2, 3));// 오버로딩 된 메소드 호출
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", k34_calc.k34_sum(1, 2, 3, 4));// 오버로딩 된 메소드 호출
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", k34_calc.k34_sum(1.3, 2.4));// 오버로딩 된 메소드 호출
	}
}
