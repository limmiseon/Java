package softwarecoding008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SoftwareCoding008_practice006_1_A005930 {

	public static void main(String[] args) throws IOException {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\StockDailyPrice.csv");// �ش� ��ġ�� �ִ� THTSKS010H00.dat������ �д´�.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// BufferedReader ����� �д´�.
			
			File k34_f1 = new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\A005930.csv");// �ش� ��ġ�� A005930.csv ������ �����Ѵ�.
			BufferedWriter k34_bw = new BufferedWriter(new FileWriter(k34_f1));// BufferedWriter ����� ����.
			
			// ���� �ð��� ����ϱ� ���� Calendar Ŭ������ �����´�.
			Calendar k34_cal01 = Calendar.getInstance();// Calendar Ŭ������ ����ϱ� ���� ��ü�� �����Ѵ�.
			k34_cal01.setTime(new Date());// ���� �ð��� ���Ѵ�.
			SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");// ���� �ð��� ��Ĵ�� ����ϱ� ���� SimpleDateFormatŬ������ ��ü�� �����ϰ� ����� �����Ѵ�.
			
			long k34_start = System.currentTimeMillis();// ���� �ð� ����� ���� �޼ҵ� ȣ��			
			
			String k34_readTxt;// �о ���ڿ��� �����ϱ� ���� ����
			
			int k34_cnt = 0;// ��ü ī��Ʈ
			int k34_wcnt = 0;// �Ｚ�� ī��Ʈ
			while ((k34_readTxt = k34_br.readLine()) != null) {// ���� ���ڿ��� ������(null�� �ƴϸ�) �ݺ��Ѵ�.
				StringBuffer k34_s = new StringBuffer();// ��Ʈ�� ���� ��ü�� �����Ѵ�.
				String[] k34_field = k34_readTxt.split(",");// �ʵ尪�� �޸��� ������ �߶󳽴�.
				
				if(k34_field.length > 2 && k34_field[2].equals("A005930")) {// �Ｚ���ڸ� �����ϱ� ���� ���ǹ�
																		    // �Ｚ���ڴ� ����° �ʵ尡 A005930�̴�.
					k34_s.append(k34_field[0]);// ù��° �ʵ带 k34_s�� ���Ѵ�.
					for (int k34_j = 1; k34_j < k34_field.length; k34_j++) {// �ʵ带 �����ϴ� �ݺ���
						k34_s.append("," + k34_field[k34_j]);// ù��° �ʵ带 ������ ������ �ʵ带 k34_s�� ���Ѵ�.
					}
					
					k34_bw.write(k34_s.toString());// k34_s�� ���� ����.
					k34_bw.newLine();// ����
					k34_wcnt++;// �Ｚ ī��Ʈ�� 1�� ���Ѵ�.
				}
				
				k34_cnt++;// ��ü ī��Ʈ�� 1�� ���Ѵ�.
			}
			k34_br.close();// �б� ������ �ݴ´�.
			k34_bw.close();// ���� ������ �ݴ´�.
			
			Calendar k34_cal02 = Calendar.getInstance();
			k34_cal02.setTime(new Date());// ���� �ð��� ���Ѵ�.
			System.out.println("���۽ð� : " + String.format(k34_sd.format(k34_cal01.getTime())));
			System.out.println("����ð� : " + String.format(k34_sd.format(k34_cal02.getTime())));
			long k34_end = System.currentTimeMillis();// ���� �ð� ����� ���� �޼ҵ� ȣ��
			System.out.println("���� �ð� : " + (k34_end - k34_start) / 1000.0 + "��");
			System.out.printf("��ü ī��Ʈ : [%d]\n�Ｚ ī��Ʈ : [%d]records\n", k34_cnt, k34_wcnt);
	}
}
