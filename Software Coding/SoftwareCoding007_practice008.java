package softwarecoding007;

import java.util.ArrayList;


public class SoftwareCoding007_practice008 {
	
	public static void main(String[] args) {
		int k34_testMAX = 10;
		ArrayList k34_arr = new ArrayList();// ArrayList ����
		
		for (int k34_i = 0; k34_i < k34_testMAX; k34_i++) {// ��̸���Ʈ�� �������� �ֱ����� �ݺ���
			k34_arr.add((int) (Math.random()*100));// 0 ~ 99 ������ ���� ����
		}
		
		System.out.println(" ���� ��");
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {// ��̸���Ʈ ���� ����ϴ� �ݺ���
			System.out.printf(" ArrayList %d = %d\n", k34_i, k34_arr.get(k34_i));
		}
		
		System.out.printf("***********************************\n");
		k34_arr.sort(null);// ��̸���Ʈ�� �����Ѵ�.
		
		System.out.println(" ���� ��");
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {// ���� �� ��̸���Ʈ ���� ����ϴ� �ݺ���
			System.out.printf(" ArrayList %d = %d\n", k34_i, k34_arr.get(k34_i));
		}
	}
}

