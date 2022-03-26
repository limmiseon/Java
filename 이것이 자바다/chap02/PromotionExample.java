package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; //'가'의 유니코드 번호
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		longValue = 10000000000L;
		float floatValue = longValue;
		/* long = 8byte
		 * float = 4byte
		 * float은 부동소수점 방식으로 숫자를 저장하기때문에
		 * 메모리는 long보다 작지만 표현할 수 있는 범위는 long보다 크다. 
		 * 따라서 자동 타입 변환이 에러 없이 가능하다.
		 */
		System.out.println(floatValue);
	}

}
