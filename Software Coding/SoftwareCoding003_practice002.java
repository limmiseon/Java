package softwarecoding003;

public class SoftwareCoding003_practice002 {

	public static void main(String[] args) {
		// #2. �����ϱ�, �� ���ϱ�
		int kopo34_sum = 0;// kopo34_sum�̶�� int�� ������ �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
		
		//1���� 100���� ���ϱ� ���� for���� �ۼ��Ѵ�.
		for (int kopo34_i = 1; kopo34_i < 101; kopo34_i++) {// i�� 1���� �����ϰ�, 101���� ���� ������ �ݺ��ϸ�, ���๮�� ������ i�� 1�� ������Ų��.
			kopo34_sum = kopo34_sum + kopo34_i;// kopo34_sum�� ���� kopo34_sum + kopo34_i�� ���� ���� �����Ѵ�.
		}
		
		System.out.printf("#2-1 : %d\n", kopo34_sum);// 1~100���� ���� ���� kopo34_sum�� ����Ѵ�.
		System.out.printf("#2-2 : %d\n", kopo34_sum/100);// ����� ���ϱ� ���� 1~100���� ���� ���� ���� ������ŭ ������ ����Ѵ�.
		
		int[] kopo34_v = {1, 2, 3, 4, 5};// kopo34_v��� int�� �迭�� �����ϰ� �ʱ�ȭ�Ѵ�.
		int kopo34_vSum = 0;// �迭�� ���� ������ kopo34_vSum�̶�� ������ �����ϰ� �ʱ�ȭ�Ѵ�.
		
		// kopo34_v �迭�� ���� ���ϱ� ���� for���� �ۼ��Ѵ�.
		for (int kopo34_i = 0; kopo34_i < 5; kopo34_i++) {// i�� 0���� �����ϰ�, 5���� ���� ������ �ݺ��ϸ�, ���๮�� ������ i�� 1�� ������Ų��.
			kopo34_vSum = kopo34_vSum + kopo34_v[kopo34_i];// kopo34_vSum�� ���� kopo34_v�迭�� index 0~4������ ���� �ջ��Ѵ�.
		}
	
		System.out.printf("#2-3 : %d\n", kopo34_vSum);// kopo34_v �迭�� ���� ����Ѵ�.

	}

}
