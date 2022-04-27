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

public class SoftwareCoding008_practice005_2_makeFile {

	public static void main(String[] args) throws IOException {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\�ǽ�������\\day_data\\THTSKS010H00.dat");// �ش� ��ġ�� �ִ� THTSKS010H00.dat������ �д´�.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// BufferedReader ����� �д´�.
			
			File k34_f1 = new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\StockDailyPrice.csv");// �ش� ��ġ�� StockDailyPrice.csv ������ �����Ѵ�.
			BufferedWriter k34_bw = new BufferedWriter(new FileWriter(k34_f1));// BufferedWriter ����� ����.
			
			// ���� �ð��� ����ϱ� ���� Calendar Ŭ������ �����´�.
			Calendar k34_cal01 = Calendar.getInstance();// Calendar Ŭ������ ����ϱ� ���� ��ü�� �����Ѵ�.
			k34_cal01.setTime(new Date());// ���� �ð��� ���Ѵ�.
			SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");// ���� �ð��� ��Ĵ�� ����ϱ� ���� SimpleDateFormatŬ������ ��ü�� �����ϰ� ����� �����Ѵ�.
			
			long k34_start = System.currentTimeMillis();// ���� �ð� ����� ���� �޼ҵ� ȣ��
			
			String k34_readTxt;// �о ���ڿ��� �����ϱ� ���� ����
			
			int k34_cnt = 0;// ��ü ī��Ʈ
			int k34_wcnt = 0;// �ֽĸ� ī��Ʈ
			while ((k34_readTxt = k34_br.readLine()) != null) {// ���� ���ڿ��� ������(null�� �ƴϸ�) �ݺ��Ѵ�.
				StringBuffer k34_s = new StringBuffer();// ��Ʈ�� ���� ��ü�� �����Ѵ�.
				String[] k34_field = k34_readTxt.split("%_%");// �ʵ尪�� %_%�� ������ �߶󳽴�.
				
				if(k34_field.length > 2 && k34_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {// �ֽİ� ä���� �����ϱ� ���� ���ǹ�
																											  // �ֽ��� ����° �ʵ尡 A�� �����Ѵ�.
					k34_s.append(k34_field[0].replace("^", "").trim());// k34_s�� ���踦 ���ְ� 0��° �ʵ带 �����Ѵ�.
					for (int k34_j = 1; k34_j < k34_field.length; k34_j++) {// �ֽĸ� �����ϴ� �ݺ���
						k34_s.append("," + k34_field[k34_j].replace("^", "").trim());
					}
					k34_bw.write(k34_s.toString());
					k34_bw.newLine();// ����
					k34_wcnt++;// �ֽ� ī��Ʈ
				}
				
				k34_cnt++;// ��ü ī��Ʈ
			}
			k34_br.close();// �б� ���۸� �ݾ��ش�.
			k34_bw.close();// ���� ���۸� �ݾ��ش�.
			
			Calendar k34_cal02 = Calendar.getInstance();
			k34_cal02.setTime(new Date());// ���� �ð��� ���Ѵ�.
			System.out.println("���۽ð� : " + String.format(k34_sd.format(k34_cal01.getTime())));
			System.out.println("����ð� : " + String.format(k34_sd.format(k34_cal02.getTime())));
			long k34_end = System.currentTimeMillis();// ���� �ð� ����� ���� �޼ҵ� ȣ��
			System.out.println("���� �ð� : " + (k34_end - k34_start) / 1000.0 + "��");
			System.out.printf("��ü ī��Ʈ : [%d]\n�ֽ� ī��Ʈ : [%d]records\n", k34_cnt, k34_wcnt);
	}
}
