package softwarecoding003;

public class SoftwareCoding003_practice005 {

	public static void main(String[] args) {
		// #5. �Ҽ��� ���� ó��
		
		int kopo34_myVal = 14/5;// kopo34_myVal�̶�� int�� ������ �����ϰ� 14/5�� ������ �ʱ�ȭ�Ѵ�.
		
		System.out.printf("#5-1 : %d\n", kopo34_myVal);// kopo34_myVal�� ���� ����Ѵ�.
		
		double kopo34_myValL;// kopo34_myValL�̶�� double�� ������ �����Ѵ�.
		
		kopo34_myValL = 14/5;// kopo34_myValL�� 14/5�� ���� �����Ѵ�.
		System.out.printf("#5-2 : %f\n", kopo34_myValL);// kopo34_myValL�� double���̶� 2.8�� ���� �� ������ 14�� 5�� int������ ���� �� ���ԵǱ� ������ 2�� ���´�.

		kopo34_myValL = 14.0/5;// �μ� �� �Ѱ��� �Ǽ����·� ǥ���ؾ� ����� �Ǽ��� ���´�.
		System.out.printf("#5-3 : %f\n", kopo34_myValL);// kopo34_myValL�� ���� ����Ѵ�. �̶� ����� 2.8�� ���´�.
		
		kopo34_myValL = (14.0)/5+0.5;// kopo34_myValL�� double�� �����̹Ƿ� �Ҽ����� �������� �ʰ� �׳� 0.5�� ���� ���� ���´�.
		System.out.printf("#5-4 : %f\n", kopo34_myValL);// kopo34_myValL�� ���� ����Ѵ�. �̶� ����� 3.3�� ���´�.	
		
		kopo34_myValL = (int) ((14.0)/5+0.5);// ���� ����� 0.5�� ���� �Ҽ����� �ݿø��ϰ� int������ ����ȯ�Ѵ�.
		System.out.printf("#5-5 : %d\n", kopo34_myValL);// kopo34_myValL�� ���� ����Ѵ�. int���̹Ƿ� �Ҽ����� �ݿø��� �Ǿ� ����� 3�� ���´�.	
	}

}
