package softwarecoding004;

public class SoftwareCoding004_practice010 {

	public static void main(String[] args) {
		//���� �б�
		String[] kopo34_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };// String�迭 kopo34_units�� �����ϰ� �ʱ�ȭ�Ѵ�.
		for (int kopo34_i = 0; kopo34_i < 101; kopo34_i++) {// for�� : kopo34_i�� 0���� �����ϰ�, kopo34_i�� 101���� ������ �ݺ��ϰ�, ���๮�� ������ kopo34_i�� 1�� ������Ų��.
			if (kopo34_i >= 0 && kopo34_i < 10) {// ���� kopo34_i�� ���� 0 ~ 9 ���̶��
				System.out.printf("���� �ڸ� : %s\n", kopo34_units[kopo34_i]);// kopo34_units�迭�� ���� ���� -> �ѱ۷� �ٲ� ���� ������ ���� �ڸ��̹Ƿ� �� ���ڸ� ����Ѵ�.
			} else if (kopo34_i >= 10 && kopo34_i < 100) {// ���� kopo34_i�� ���� 10 ~ 99 ���̶��
				int kopo34_i10, kopo34_i0;// int���� kopo34_i10(���� �ڸ�)�� kopo34_i0(���� �ڸ�)�� �����Ѵ�.
				kopo34_i10 = kopo34_i / 10;// kopo34_i�� 10���� ���� kopo34_i10�� �����Ѵ�.(���� �ڸ��� ��������)
				kopo34_i0 = kopo34_i % 10;// kopo34_i�� 10���� ���� �������� kopo34_i0�� �����Ѵ�.(���� �ڸ��� ��������)
				if (kopo34_i0 == 0) {// ���� kopo34_i0�� ���� 0�̶��(= ���� �ڸ��� 0�̶��)
					System.out.printf("���� �ڸ� : %s��\n", kopo34_units[kopo34_i10]);// kopo34_units�迭�� ���� ���� -> �ѱ۷� �ٲ� ���� ������ ����ϰ� ���� �ڸ��� 0�̹Ƿ� �����Ѵ�. 
				} else {// kopo34_i0�� ���� 0�� �ƴ϶��(= ���� �ڸ��� 0�� �ƴ϶��)
					System.out.printf("���� �ڸ� : %s��%s\n", kopo34_units[kopo34_i10], kopo34_units[kopo34_i0]);//  kopo34_units�迭�� ���� ���� -> �ѱ۷� �ٲ� ���� ������ ���� �ڸ��� ���� �ڸ��� ����Ѵ�.
				}
			}
			else {// kopo34_i�� ���� 100�̶��
				System.out.printf("==> %d\n", kopo34_i);// �ѱ� ��ȯ�� ��ġ�� �ʰ� �״�� ����Ѵ�.
			}
		}
	}
}
