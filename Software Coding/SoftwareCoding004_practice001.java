package softwarecoding004;

public class SoftwareCoding004_practice001 {
	
	public static void main(String[] args) {
		// for���� ���� for���� Ȱ���� ������ ���
		int kopo34_sum = 0;// int���� kopo34_sum�� �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
		for (int kopo34_i = 0; kopo34_i < 10; kopo34_i++) {// for�� : kopo34_i�� 0���� �����ϰ�, kopo34_i�� 10���� ������ �ݺ��ϰ�, ���๮�� ������ kopo34_i�� 1�� ������Ų��.
			kopo34_sum += kopo34_i;// kopo34_sum�� kopo34_i�� ���� ���� �ջ��Ѵ�.(0 ~ 9������ ��)
		}
		System.out.printf("sum %d\n", kopo34_sum);// kopo34_sum�� ����Ѵ�.
	
		for (int kopo34_i = 1; kopo34_i < 10; kopo34_i++) {// for�� : kopo34_i�� 1���� �����ϰ�, kopo34_i�� 10���� ������ �ݺ��ϰ�, ���๮�� ������ kopo34_i�� 1�� ������Ų��.
			System.out.printf("*********************\n");
			System.out.printf("    ������ %d ��\n", kopo34_i);// �������� �ܼ��� ����Ѵ�.
			System.out.printf("*********************\n");
			
			for (int kopo34_j = 1; kopo34_j < 10; kopo34_j++) {// ��ø for�� : kopo34_j�� 1���� kopo34_j�� 10���� ������ �ݺ��ϰ�, ���๮�� ������ kopo34_j�� 1�� ������Ų��.
				System.out.printf("%d * %d = %d\n", kopo34_i, kopo34_j, kopo34_i * kopo34_j);// �������� ������ ����Ѵ�.
			}
		}		
	}
}
