package softwarecoding008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SoftwareCoding008_practice003 {

	public static void main(String[] args) throws IOException {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\���������������.csv");// �ش� �ּ��� ������ �о�´�.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// ���۸� ����� �д´�.
			
			String k34_readTxt;// �о ���ڿ��� �����ϱ� ���� ����
			
			if((k34_readTxt = k34_br.readLine()) == null) {// ���� �� �̻� �о�� �����Ͱ� ���ٸ�
				System.out.printf("�� �����Դϴ�\n");
			}
			String[] k34_fieldName = k34_readTxt.split(",");// �����͸� �޸��� ������ �߶� k34_fieldName �迭�� �ִ´�.
						
			int k34_lineCnt = 0;// �׸� ��ȣ�� ���� ���� ����
			while ((k34_readTxt = k34_br.readLine()) != null) {// �о�� �����Ͱ� �ִٸ� ��� �ݺ��Ѵ�.
				String[] k34_field = k34_readTxt.split(",");// k34_readTxt�� �޸��� ������ k34_field �迭�� �ִ´�.
				System.out.printf("**[%d��° �׸�]*********************\n", k34_lineCnt);// �׸�� ���
				
				for (int k34_j = 0; k34_j < k34_fieldName.length; k34_j++) {// �׸�� �����Ͱ��� ����ϴ� �ݺ���
					System.out.printf(" %s : %s\n", k34_fieldName[k34_j], k34_field[k34_j]);
				}
				
				System.out.printf("***********************************\n");
			
			if (k34_lineCnt == 100) {// �׸��� 100���� �Ǹ�
				break;// �ݺ������� �������´�.
			}
			k34_lineCnt++;// k34_lineCnt�� 1�� ���Ѵ�.
			}
			
			k34_br.close();// ������ �ݴ´�.
	}
}
