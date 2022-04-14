package softwarecoding003;

public class SoftwareCoding003_practice005 {

	public static void main(String[] args) {
		// #5. 소수점 이하 처리
		
		int kopo34_myVal = 14/5;// kopo34_myVal이라는 int형 변수를 선언하고 14/5의 값으로 초기화한다.
		
		System.out.printf("#5-1 : %d\n", kopo34_myVal);// kopo34_myVal의 값을 출력한다.
		
		double kopo34_myValL;// kopo34_myValL이라는 double형 변수를 선언한다.
		
		kopo34_myValL = 14/5;// kopo34_myValL에 14/5의 값을 대입한다.
		System.out.printf("#5-2 : %f\n", kopo34_myValL);// kopo34_myValL은 double형이라 2.8이 나올 것 같지만 14와 5가 int형으로 계산된 후 대입되기 때문에 2가 나온다.

		kopo34_myValL = 14.0/5;// 인수 중 한개라도 실수형태로 표시해야 결과가 실수로 나온다.
		System.out.printf("#5-3 : %f\n", kopo34_myValL);// kopo34_myValL의 값을 출력한다. 이때 결과는 2.8이 나온다.
		
		kopo34_myValL = (14.0)/5+0.5;// kopo34_myValL가 double형 변수이므로 소숫점이 버려지지 않고 그냥 0.5를 더한 값이 나온다.
		System.out.printf("#5-4 : %f\n", kopo34_myValL);// kopo34_myValL의 값을 출력한다. 이때 결과는 3.3이 나온다.	
		
		kopo34_myValL = (int) ((14.0)/5+0.5);// 연산 결과에 0.5를 더해 소숫점을 반올림하고 int형으로 형변환한다.
		System.out.printf("#5-5 : %d\n", kopo34_myValL);// kopo34_myValL의 값을 출력한다. int형이므로 소숫점은 반올림이 되어 결과는 3이 나온다.	
	}

}
