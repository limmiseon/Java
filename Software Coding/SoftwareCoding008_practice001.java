package softwarecoding008;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class SoftwareCoding008_practice001 {

	public static void main(String[] args) {
		try {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\myTest.txt");// �ش� �ּҿ� ������ �����Ѵ�.
			FileWriter k34_fw = new FileWriter(k34_f);// FileWriter�� �̿��� ������ ����.
			
			k34_fw.write("�ȳ� ����\n");// ���� ���� �߰�
			k34_fw.write("hello ���\n");
			
			k34_fw.close();// ������ �ݴ´�.
			
			FileReader k34_fr = new FileReader(k34_f);// FileReader�� �̿��� ������ �д´�.
			
			int k34_n;
			char[] k34_ch;
			
			while (true) {
				k34_ch = new char[100];// char �迭�� 100���� �о�´�.
				k34_n = k34_fr.read(k34_ch);// ������ ������ �迭�� �����ϰ� �� ���̸� k34_n�� �����Ѵ�.
				
				if(k34_n == -1) {// ���� �о�� �����Ͱ� ���ٸ�
					break;// �ݺ������� �������´�.
				}
				
				for(int k34_i = 0; k34_i < k34_n; k34_i++) {// �迭�� ���̸�ŭ ������ �б� ���� �ݺ���
					System.out.printf("%c", k34_ch[k34_i]);// k34_ch �迭�� k34_i��° �ε����� ���� ����Ѵ�.
				}
			}
			k34_fr.close();// ������ �ݴ´�.
				
			System.out.printf("\n*FILE READ END*");
			
		} catch (Exception k34_e) {
			System.out.printf("�� ����[%s]\n", k34_e);
		}
	}

}
