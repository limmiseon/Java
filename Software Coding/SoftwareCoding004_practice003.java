package softwarecoding004;

public class SoftwareCoding004_practice003 {

	public static void main(String[] args) {
		// �������� �������� ��
		// ���ڴ� ������, �Ǽ��� �񱳿� ����
		int kopo34_I;// int�� ���� kopo34_I�� �����Ѵ�.
		double kopo34_D;// double�� ���� kopo34_D�� �����Ѵ�.
		
		kopo34_I = 10 / 3;// kopo34_I�� 10�� 3���� ���� ���� �����Ѵ�.(������ �����̱� ������ �Ҽ����� ������)
		kopo34_D = 10 / 3.0;// kopo34_D�� 10�� 3.0(�Ǽ���)���� ���� ���� �����Ѵ�.(�Ǽ��� �����̱⶧���� �Ҽ������� �����)
		
		// int�� double�� ������ ����� �Ǽ��� �����̴�.
		if (kopo34_I == kopo34_D) {// ���� kopo34_I�� kopo34_D�� ���� ���ٸ�
			System.out.printf("equal\n");// "equal"�� ����Ѵ�.
		} else {// kopo34_I�� kopo34_D�� ���� �ٸ��ٸ�
			System.out.printf("Not equal [%f][%f]\n", (double) kopo34_I, kopo34_D);// kopo34_I�� double������ ����ȯ �� kopo34_I�� kopo34_D�� ����Ѵ�.
		}
		
		// double���� ��ȿ���ڱ��� ǥ�õ� �� ��, �ڿ� �� ���� �Ҽ����� �����Ѵ�.
		if (kopo34_D == 3.333333) {// ���� kopo34_D�� ���� 3.333333�̶��
			System.out.printf("equal\n");// "equal"�� ����Ѵ�.
		} else {// kopo34_D�� ���� 3.333333�� �ƴ϶�� ������ ������ ����Ѵ�.
			System.out.printf("Not equal [3.33333][%f]\n", kopo34_D);
		}
		
		kopo34_D = (int) kopo34_D;// kopo34_D�� int������ ����ȯ�Ѵ�.
		if (kopo34_I == kopo34_D) {// ���� kopo34_I�� kopo34_D�� ���� ���ٸ�
			System.out.printf("equal\n");// "equal"�� ����Ѵ�.
		} else {// kopo34_I�� kopo34_D�� ���� �ٸ��ٸ�
			System.out.printf("Not equal [%f][%f]\n", (double) kopo34_I, kopo34_D);// kopo34_I�� double������ ����ȯ �� kopo34_I�� kopo34_D�� ����Ѵ�.
		}
		
		System.out.printf("int�� �μ� [%d][%f]\n", kopo34_I, kopo34_D);
		System.out.printf("double�� �μ� [%f][%f]\n", (double) kopo34_I, kopo34_D);
		
		System.out.printf("34 i %d\n", (int) kopo34_I);
		char kopo34_a = 'c';
		if (kopo34_a == 'b') {
			System.out.printf("a�� b�̴�.\n");
		}
		if (kopo34_a == 'c') {
			System.out.printf("a�� c�̴�.\n");
		}
		if (kopo34_a == 'd') {
			System.out.printf("a�� d�̴�.\n");
		}
			
		String kopo34_aa = "abcd";
		if (kopo34_aa.equals("abcd")) {
			System.out.printf("aa�� abcd�̴�.\n");
		} else {
			System.out.printf("aa�� abcd�� �ƴϴ�.\n");
		}
		
		boolean kopo34_bb = true;
		if (!!kopo34_bb) {
			System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�.\n");
		} else {
			System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�.\n");
		}
	}
}
