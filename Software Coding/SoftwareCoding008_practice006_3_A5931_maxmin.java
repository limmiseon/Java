package softwarecoding008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SoftwareCoding008_practice006_3_A5931_maxmin {

	public static void main(String[] args) throws IOException {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\A005930.csv");// �ش� ��ġ�� �ִ� A005930.csv������ �д´�.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// BufferedReader ����� �д´�.
			
			// ���� �ð��� ����ϱ� ���� Calendar Ŭ������ �����´�.
			Calendar k34_cal01 = Calendar.getInstance();// Calendar Ŭ������ ����ϱ� ���� ��ü�� �����Ѵ�.
			k34_cal01.setTime(new Date());// ���� �ð��� ���Ѵ�.
			SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");// ���� �ð��� ��Ĵ�� ����ϱ� ���� SimpleDateFormatŬ������ ��ü�� �����ϰ� ����� �����Ѵ�.
			
			long k34_start = System.currentTimeMillis();// ���� �ð� ����� ���� �޼ҵ� ȣ��	

			int k34_max = Integer.MIN_VALUE;// �ִ밪�� integer ������ ���� ���� ������ �ʱ�ȭ
			int k34_min = Integer.MAX_VALUE;// �ּҰ��� integer ������ ���� ū ������ �ʱ�ȭ
			String k34_maxDay = "";
			String k34_minDay = "";
			String k34_readTxt;// �о ���ڿ��� �����ϱ� ���� ����
			
			while ((k34_readTxt = k34_br.readLine()) != null) {// ���� ���ڿ��� ������(null�� �ƴϸ�) �ݺ��Ѵ�.
				String[] k34_field = k34_readTxt.split(",");// �ʵ尪�� �޸��� ������ �߶󳽴�.
				if(k34_field.length > 2 &&k34_field[1].contains("2015")) {// �ι�° �ʵ尡 ��¥�̹Ƿ� 2015���� ���ԵǾ� ������
					if(k34_max < Integer.parseInt(k34_field[3])) {// int������ ����ȯ �� ���� ���� �ִ밪���� ũ�� ���� ������ �ִ����� �����Ѵ�.
						k34_max = Integer.parseInt(k34_field[3]);
						k34_maxDay = k34_field[1];
						
					}
				
					if(k34_min > Integer.parseInt(k34_field[3])) {// int������ ����ȯ �� ���� ���� �ּҰ����� ������ ���� ������ �ּҰ����� �����Ѵ�.
						k34_min = Integer.parseInt(k34_field[3]);
						k34_minDay = k34_field[1];
					}
				}
			}
			
			k34_br.close();// ������ �ݴ´�.
			
			Calendar k34_cal02 = Calendar.getInstance();//
			k34_cal02.setTime(new Date());// ���� �ð��� ���Ѵ�.
			System.out.println("���۽ð� : " + String.format(k34_sd.format(k34_cal01.getTime())));
			System.out.println("����ð� : " + String.format(k34_sd.format(k34_cal02.getTime())));
			long k34_end = System.currentTimeMillis();// ���� �ð� ����� ���� �޼ҵ� ȣ��
			System.out.println("���� �ð� : " + (k34_end - k34_start) / 1000.0 + "��");
			System.out.printf("�ּҰ� ��¥ : %s = > %d\n�ִ밪 ��¥ : %s = > %d\n", k34_minDay, k34_min, k34_maxDay, k34_max);
	}
}
