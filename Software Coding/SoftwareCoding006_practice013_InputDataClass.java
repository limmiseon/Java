package softwarecoding006;

public class SoftwareCoding006_practice013_InputDataClass{
	String[] k34_name;// String �迭 �ν��Ͻ��� �����Ѵ�. (�̸��� ������ ����)
	int[] k34_kor;// int �迭 �ν��Ͻ��� �����Ѵ�. (���� ������ ������ ����)
	int[] k34_eng;// int �迭 �ν��Ͻ��� �����Ѵ�. (���� ������ ������ ����)
	int[] k34_mat;// int �迭 �ν��Ͻ��� �����Ѵ�. (���� ������ ������ ����)
	int[] k34_sum;// int �迭 �ν��Ͻ��� �����Ѵ�. (���� + ���� + ���� ������ �հ踦 ������ ����) 
	int[] k34_avg;// double �迭 �ν��Ͻ��� �����Ѵ�. (���� + ���� + ���� ������ ����� ������ ����) 
	
	SoftwareCoding006_practice013_InputDataClass(int k34_integer) {// ������ ȣ�� �� int�� �Ű������� �ִ´�.
		// �Ű������� ���ڿ� ���� �迭�� ���̰� �����ȴ�.
		k34_name = new String[k34_integer];
		k34_kor = new int[k34_integer];
		k34_eng = new int[k34_integer];
		k34_mat = new int[k34_integer];
		k34_sum = new int[k34_integer];
		k34_avg = new int[k34_integer];
	}
	
	void k34_setData(int k34_i, String k34_inputName, int k34_inputKor, int k34_inputEng, int k34_inputMat) {// �����͸� �����ϱ� ���� �޼ҵ带 �����Ѵ�.
		// �� �迭�� k34_i��° �ε����� �̸�, ���� ����, ���� ����, ���� ����, �հ�, ����� ����ȴ�.
		k34_name[k34_i] = k34_inputName;
		k34_kor[k34_i] = k34_inputKor;
		k34_eng[k34_i] = k34_inputEng;
		k34_mat[k34_i] = k34_inputMat;
		k34_sum[k34_i] = k34_kor[k34_i] + k34_eng[k34_i] + k34_mat[k34_i];
		k34_avg[k34_i] = k34_sum[k34_i] / 3; // 3���� �ϸ� int������ �����;
	}
}
