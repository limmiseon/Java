package softwarecoding004;

public class SoftwareCoding004_practice002 {

	public static void main(String[] args) {
		// while������ �� ���
		int kopo34_A, kopo34_B; // int�� ���� kopo34_A�� kopo34_B�� �����Ѵ�.

		kopo34_A = 0;// kopo34_A�� 0���� �ʱ�ȭ�Ѵ�. ������ while���� ���� ������ 1�� �����Ѵ�.
		while (true) {// while���� �����Ѵ�.
			kopo34_B = 0;// kopo34_B�� 0���� �ʱ�ȭ�Ѵ�. ������ while���� ���� ������ 0���� �ʱ�ȭ�ȴ�.
			while (true) {// while�� �ȿ� while���� �߰��Ѵ�.
				System.out.printf("*");// ���� ��´�.
				if (kopo34_A == kopo34_B) {// ���� kopo34_A�� kopo34_B�� ���� ���ٸ�
					break;// ������ while������ �������´�.(������ while���� kopo34_A�� kopo34_B�� ���� ������ ������ �ݺ��ȴ�.)
				}
				kopo34_B++;// if���� �����̶�� kopo34_B�� 1�� ������Ų��.(kopo34_A + 1��ŭ ���� ������.)
			}
			
			System.out.printf("\n");// ���� �ٲ۴�.
			kopo34_A++;// kopo34_A�� ���� ������Ų��.
			if (kopo34_A == 30) {// ���� kopo34_A�� ���� 30�� ���ٸ�(30�ٸ�ŭ ���� ���� ���̱� ������ 30���� ����)
				break;// �ٱ����� while������ �������´�.
			}
		}
	}
}
