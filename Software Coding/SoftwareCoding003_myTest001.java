package softwarecoding003;

public class SoftwareCoding003_myTest001 {

	public static void main(String[] args) {
		int kopo34_price = 271;// kopo34_val��� int�� ������ �����ϰ� 271�� �ʱ�ȭ�Ѵ�.(���� ���� ��)
		int kopo34_rate = 3;// kopo34_rate��� int�� ������ �����ϰ� 3���� �ʱ�ȭ�Ѵ�.(���� = 3%)
		
		int kopo34_tax = kopo34_taxcal(kopo34_price, kopo34_rate);// kopo34_taxcal �Լ��� ȣ���Ѵ�. ���ڴ� val�� rate�̰�, result�� kopo34_tax�� �����Ѵ�.
		
		System.out.printf("**************************************\n");
		System.out.printf("*           �ܼ� ���� ���           *\n");
		System.out.printf("���� ���ݰ��: %f\n", kopo34_price * kopo34_rate / 100.0);// ���� ���� ���� ������ ���� �� 100���� ������ ���� ���� ���´�.
		System.out.printf("���� ����: %d\n����: %d �����԰���: %d\n", kopo34_price, kopo34_tax, kopo34_price + kopo34_tax);// ���� ���ݰ� ����, ���� ���ݰ� ���� ������ ���� �� �ݾ��� ����Ѵ�.
		

	}
	// static���� �Լ��� ����� ���� �Լ����� ��ü���� ���� ȣ���� �� �ִ�.
	public static int kopo34_taxcal(int kopo34_price, int kopo34_rate) {// ���� ��� �Լ��� �����. ���ڴ� int�� 2���̴�.
		int kopo34_ret;// kopo34_ret��� int�� ������ �����Ѵ�.
		
		// �Ҽ������� ����ϱ� ���� int�� ���ڸ� double�� ����ȯ �� ���� ���ϰ� 100�� �����ش�.
		if( ((double)kopo34_price * (double) kopo34_rate / 100.0) == kopo34_price * kopo34_rate / 100) {// ���� ������ �Ҽ��� ���� ��������
			kopo34_ret = kopo34_price * kopo34_rate / 100;// ���ݿ� ������ ���� �� 100���� ���� ���� ��ȯ�Ѵ�.		
		} else {// ���� ���ݿ� �Ҽ����� �ִٸ�
			kopo34_ret = kopo34_price * kopo34_rate / 100 + 1;// �Ҽ����� ������ 1�� ���� ���� ��ȯ�Ѵ�.(�ø�ó��)	
		}
		
		return kopo34_ret;// kopo34_ret�� ���� ��ȯ�Ѵ�.
	}
}
