package softwarecoding007;

public class SoftwareCoding007_practice005 {

	public static void main(String[] args) {
		// int�迭 ����
		int[] k34_arr = { 20, 7, 11, 248, 321, 26, 72, 3, 78, 2200, 3714, 982, 34, 21, 63, 55 };

		// �ִ밪 �ּҰ� ã��
		int k34_max = k34_arr[0];// �ִ밪�� k34_arr �迭�� 0��° �ε����� �����Ѵ�.
		int k34_min = k34_arr[0];// �ּҰ��� k34_arr �迭�� 0��° �ε����� �����Ѵ�.
		int k34_maxPt = 0;// �ִ밪�� �ε�����ȣ
		int k34_minPt = 0;// �ּҰ��� �ε�����ȣ
		
		for (int k34_i = 0; k34_i < k34_arr.length; k34_i++) {// �ִ밪 �ּҰ��� ã�� �ݺ���
			if (k34_max < k34_arr[k34_i]) {// ���� k34_arr�迭�� k34_i��° �ε����� ���� k34_max ���� ũ�ٸ�
				k34_max = k34_arr[k34_i];// k34_max�� ���� �����ϰ�
				k34_maxPt = k34_i;// �ε��� ��ȣ�� k34_i���� �����Ѵ�.
			}

			if (k34_min > k34_arr[k34_i]) {// ���� k34_arr�迭�� k34_i��° �ε����� ���� k34_min ���� �۴ٸ�
				k34_min = k34_arr[k34_i];// k34_min�� ���� �����ϰ�
				k34_minPt = k34_i;// �ε��� ��ȣ�� k34_i���� �����Ѵ�.
			}
		}

		System.out.printf("MAX : k34_arr[%d] = %d\n", k34_maxPt, k34_max);
		System.out.printf("MIN : k34_arr[%d] = %d\n", k34_minPt, k34_min);
	}
}
