package softwarecoding008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SoftwareCoding008_practice002 {

	public static void FileWrite() throws IOException {// ���� ���� �޼ҵ�
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\myTest001.txt");// �ش� �ּҿ� ������ �����Ѵ�.
			BufferedWriter k34_bw = new BufferedWriter(new FileWriter(k34_f));// ���۸� �̿��� ����.
			
			k34_bw.write("�ȳ� ����");// ���� ���� �߰�
			k34_bw.newLine();// ����
			k34_bw.write("hello ���");
			k34_bw.newLine();// ����
			
			k34_bw.close();// ������ �ݴ´�.
	}
	
	public static void FileRead() throws IOException {// ���� �б� �޼ҵ�
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\myTest001.txt");// �ش� �ּ��� ������ �о�´�.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// ���۸� ����� �д´�.
			
			String k34_readTxt;// �о�� ���ڿ��� ������ ����
			
			while ((k34_readTxt = k34_br.readLine()) != null) {// �о�� �����Ͱ��� ������ ��� �ݺ��ȴ�
				System.out.printf("%s\n", k34_readTxt);// ������ ���
			}
			k34_br.close();// ������ �ݴ´�.
	}
				
	public static void main(String[] args) throws IOException {
		FileWrite();// ������ ���� �޼ҵ� ȣ��
		FileRead();// ������ �д� �޼ҵ� ȣ��
	}
}
