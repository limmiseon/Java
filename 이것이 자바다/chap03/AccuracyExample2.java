package sec03;

public class AccuracyExample2 {

	public static void main(String[] args) {
		//��Ȯ�� ����� ���� ���
		int apple = 1;
		int totalPieces = apple * 10;
		int num = 7;
		int temp = totalPieces - num;
		
		double result = temp / 10.0;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����");
		System.out.println(result + " ������ ���´�.");
	}

}
