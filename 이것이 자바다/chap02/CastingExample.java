package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		
		int intValue = 44032;//44032 = 유니코드 '가'
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(longValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;//정수부분인 3만 저장
		System.out.println(intValue);

	}

}
