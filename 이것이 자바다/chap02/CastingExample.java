package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		
		int intValue = 44032;//44032 = �����ڵ� '��'
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(longValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;//�����κ��� 3�� ����
		System.out.println(intValue);

	}

}
