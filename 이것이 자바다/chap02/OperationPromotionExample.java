package sec03.exam04_operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteVal1 = 10;
		byte byteVal2 = 20;
		
		//byte byteVal3 = byteVal1 + byteVal2; -> ������ ����
		int intVal1 = byteVal1 + byteVal2;
		System.out.println(intVal1);
		
		char charVal1 = 'A';
		char charVal2 = 1; //�����ڵ� 1���� �����Ѵ�.
		
		// char charVal3 = charVal1 + charVal2; -> ������ ����
		int intVal2 = charVal1 + charVal2;
		System.out.println("�����ڵ� = " + intVal2);
		System.out.println("��¹��� = " + (char) intVal2);
		
		int intVal3 = 10;
		int intVal4 = intVal3 / 4; // -> 2.5������ ������ ������ �������� ������ ����ȴ�.
		System.out.println(intVal4);
		
		int intVal5 = 10;
		// int intVal6 = 10 / 4.0 -> �ǿ����� �� �Ǽ����ͷ��� ������ ������ double�� �ڵ� ��ȯ�ǹǷ� ������ ����
		double doubleVal = intVal5 / 4.0;
		System.out.println(doubleVal);
	}

}
