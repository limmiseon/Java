package softwarecoding008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SoftwareCoding008_practice005_1 {

	public static void main(String[] args) throws IOException {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\�ǽ�������\\day_data\\THTSKS010H00.dat");// �ش� ��ġ�� �ִ� THTSKS010H00.dat������ �����´�.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// BufferedReader ����� �д´�.
			
			int k34_n = 0; // ���� ����
			StringBuffer k34_s = new StringBuffer();// ��Ʈ�� ���۸� �����Ѵ�.
			while (true) {
				char[] k34_ch = new char[1000];// char �迭�� 1000���� �о�´�.
				
				k34_n = k34_br.read(k34_ch);// �迭�� ����
				
				if (k34_n == -1) {// ���� �����Ͱ� ������
					break;// �ݺ������� �������´�.
				}
				
				for (int k34_i = 0; k34_i < k34_n; k34_i++) {// char�迭 ��ŭ �ݺ��Ѵ�.
					if (k34_ch[k34_i] == '\n') {// ���๮�ڰ� �ƴ϶��
						System.out.printf(" [%s]***\n", k34_s.toString());// ����Ѵ�.
						k34_s.delete(0, k34_s.length());// ��Ʈ�� ���۸� �����ش�.
					} else {// ������ �ƴ϶��
						k34_s.append(k34_ch[k34_i]);// append�� ���Ѵ�.
					}
				}
			}
			k34_br.close();// ���۸� �ݴ´�.
			System.out.printf(" [%s]***\n", k34_s.toString());// ������ �� ���
	}
}
