package sec03;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int num = 7;
		
		double result = apple - num*pieceUnit;
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����");
		System.out.println(result + "������ ���´�.");
		//�ε��Ҽ��� Ÿ��(float, double)�� 0.1�� ��Ȯ�� ǥ���� �� ���� �ٻ�ġ�� ó���Ѵ�.
	}

}
