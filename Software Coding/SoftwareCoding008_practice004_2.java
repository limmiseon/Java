package softwarecoding008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SoftwareCoding008_practice004_2 {

	public static void main(String[] args) throws IOException {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\���������������_��⵵.txt");// �ش� �ּ��� ������ �д´�.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// ���۸� �̿��� ������ �д´�.
			
			String k34_readTxt;// �о ���ڿ��� �����ϱ� ���� ����
			
			if((k34_readTxt = k34_br.readLine()) == null) {// ���� �� �̻� �о�� �����Ͱ� ���ٸ�
				System.out.printf("�� �����Դϴ�\n");
			}
			
			String[] k34_fieldName = k34_readTxt.split("\t");// �����͸� ������ ������ �߶� k34_fieldName �迭�� �ִ´�.
			
			// ����� �����浵 �������� �˾ƺ���
			double lat = 37.3858;// ����
			double lng = 127.1215;// �浵
			
			double k34_dist = 0;// �Ÿ��� ������ ����
			double k34_max = Integer.MIN_VALUE;// ���� ����� ������ �Ÿ��� ������ ����
			double k34_min = Integer.MAX_VALUE;// ���� �� ������ �Ÿ��� ������ ����
			
			String k34_close = "";// ���� ����� ������ �ּҸ� ������ ����
			String k34_far = "";// ���� �� ������ �ּҸ� ������ ����
			
			int k34_lineCnt = 0;// �׸� ��ȣ�� ������ ����
			while ((k34_readTxt = k34_br.readLine()) != null) {// �о�� �����Ͱ� �ִٸ� ��� �ݺ��Ѵ�.
				String[] k34_field = k34_readTxt.split("\t");// k34_readTxt�� ������ ������ k34_field �迭�� �ִ´�.
				
				System.out.printf("**[%d��° �׸�]*********************\n", k34_lineCnt);
				System.out.printf(" %s : %s\n", k34_fieldName[9], k34_field[9]); // 10�� : ���θ� �ּ�
				System.out.printf(" %s : %s\n", k34_fieldName[13], k34_field[13]); // 13�� : ���� �ּ�
				System.out.printf(" %s : %s\n", k34_fieldName[14], k34_field[14]); // 14�� : �浵 �ּ�
				k34_dist = Math.sqrt( Math.pow(Double.parseDouble(k34_field[13]) - lat, 2)
						+ Math.pow(Double.parseDouble(k34_field[14]) - lng, 2));// ��Ÿ��� ���� �̿��� �Ÿ� ���ϰ� k34_dist�� �����Ѵ�.
				System.out.printf(" ���������� �Ÿ� : %f\n", k34_dist);
				System.out.printf("***********************************\n");
				
				// ��������� ���� ����� ���� �� ��
				if(k34_max < k34_dist) {// ���� k34_max������ ���� �Ÿ��� �� �ִٸ�
					k34_max = k34_dist;// k34_max���� ���� �Ÿ����� �����Ѵ�.
					k34_far = k34_field[9];// �� �� �ּҿ� k34_field�� 5��° �ε��� ��(���θ� �ּ�)�� �����Ѵ�.
				}
				
				if(k34_min > k34_dist) {// ���� k34_min������ ���� �Ÿ��� �� �۴ٸ�
					k34_min = k34_dist;// k34_min���� ���� �Ÿ����� �����Ѵ�.
					k34_close = k34_field[9];// ����� �� �ּҿ� k34_field�� 5��° �ε��� ��(���θ� �ּ�)�� �����Ѵ�.
				}
				
				k34_lineCnt++;// �׸� ��ȣ�� 1�� ���Ѵ�.
			}
			k34_br.close();// ���۸� �ݴ´�.
			
			System.out.printf("***********************************\n");
			System.out.printf("��������� ���� �� �� : %s\n", k34_far);
			System.out.printf("��������� �Ÿ� : %s\n", k34_max);
			System.out.printf("***********************************\n");
			
			System.out.printf("***********************************\n");
			System.out.printf("��������� ���� ����� �� : %s\n", k34_close);
			System.out.printf("��������� �Ÿ� : %s\n", k34_min);
			System.out.printf("***********************************\n");
	}
}
