package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue; //'��'�� �����ڵ� ��ȣ
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
		 * float�� �ε��Ҽ��� ������� ���ڸ� �����ϱ⶧����
		 * �޸𸮴� long���� ������ ǥ���� �� �ִ� ������ long���� ũ��. 
		 * ���� �ڵ� Ÿ�� ��ȯ�� ���� ���� �����ϴ�.
		 */
		System.out.println(floatValue);
	}

}
