package softwarecoding007;

import java.util.ArrayList;


public class SoftwareCoding007_practice007 {
	
	public static void main(String[] args) {
		ArrayList k34_arr = new ArrayList();// ArrayList ����
		
		k34_arr.add("abc");// add�� �̿��� ArrayList�� ��Ҹ� �߰��Ѵ�.
		k34_arr.add("abcd");
		k34_arr.add("efga");
		k34_arr.add("������0");
		k34_arr.add("1234");
		k34_arr.add("12rk34");
		// k34_arr.add(356)�� x => ��Ʈ������ ���� ����
		
		System.out.printf("***********************************\n");
		System.out.printf(" ���� ArraySize %d\n", k34_arr.size());
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {
			System.out.printf(" ArraySize %d = %s\n", k34_i, k34_arr.get(k34_i));
		}
		
		k34_arr.set(3, "������");// set�� �̿��� �ε��� 3�� ��̸���Ʈ ������ �����Ѵ�.
		System.out.printf("***********************************\n");
		System.out.printf(" ���뺯�� ArraySize %d\n", k34_arr.size());
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {
			System.out.printf(" ArraySize %d = %s\n", k34_i, k34_arr.get(k34_i));
		}
		
		k34_arr.remove(4); // remove�� �̿��� �ε��� 4�� ��̸���Ʈ�� �����Ѵ�.
		System.out.printf("***********************************\n");
		System.out.printf(" ���뺯�� ArraySize %d\n", k34_arr.size());
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {
			System.out.printf(" ArraySize %d = %s\n", k34_i, k34_arr.get(k34_i));
		}
		
		k34_arr.sort(null); // sort�� �̿��� ��̸���Ʈ�� �����Ѵ�.
		System.out.printf("***********************************\n");
			System.out.printf(" ����Ʈ Sort ArraySize %d\n", k34_arr.size());
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {
			System.out.printf(" ArraySList %d = %s\n", k34_i, k34_arr.get(k34_i));
		}
		
		k34_arr.clear(); // clear�� �̿��� ��̸���Ʈ�� �����Ѵ�.
		System.out.printf("***********************************\n");
		System.out.printf(" ���� ���� ArraySize %d\n", k34_arr.size());
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {
			System.out.printf(" ArraySList %d = %s\n", k34_i, k34_arr.get(k34_i));
		}
	}
}

