package softwarecoding003;

import java.text.DecimalFormat;// �ݾ׿� �޸��� ��� ���� ���̺귯�� Ŭ����
import java.text.SimpleDateFormat;// ���� �ð� ��� ����� �����ϱ� ���� ���̺귯�� Ŭ����
import java.util.Calendar;// ���� ��¥�� �ð��� ��� ���� ���̺귯�� Ŭ����

public class SoftwareCoding003_myTest003 {

	public static void main(String[] args) {
		int kopo34_myWon = 1000000;// kopo34_myWon�̶�� int�� ������ �����ϰ�, ȯ�� �� �ݾ��� 100�������� �ʱ�ȭ�Ѵ�.
		double kopo34_moneyEx = 1238.21;// kopo34_moneyEx�̶�� double�� ������ �����ϰ�, �޷� ȯ���� 1238.21�� �ʱ�ȭ�Ѵ�.
		double kopo34_commission = 0.003;// kopo34_commission�̶�� double�� ������ �����ϰ�, ȯ�� �������� 0.3%�� �ʱ�ȭ�Ѵ�.
		
		int kopo34_usd = (int) (kopo34_myWon / kopo34_moneyEx);// ��ȭ ����� ���� int�� ���� kopo34_usd�� �����ϰ�, ��ü �ݾ��� ȯ���� ������.
															// ���� �ݾ��� ���������� ����� �Ҽ����� �ڵ� ����ó���� �ȴ�.
		int kopo34_remain = (int) (kopo34_myWon - kopo34_usd * kopo34_moneyEx);// �ܵ� ����� ���� int�� ���� kopo34_remain�� �����ϰ�,
																			  // ��ü �ݾ׿��� �޷� * ȯ���� ���� �� �ش�.
		
		double kopo34_comPerOne = kopo34_moneyEx * kopo34_commission; // ������ ����� ���� double�� ���� kopo34_comPerOne�� �����ϰ�,
																	 // 1�޷� �� �����Ḧ ����� ���� �����Ѵ�.
		double kopo34_totalCom = kopo34_usd * kopo34_comPerOne; // ������ ����� ���� double �� ���� kopo34_totalCom�� �����ϰ�,
															   // ��ü �޷� �ݾ׿� �޷� �� �����Ḧ ���� ���� �����Ѵ�.
		
		//�׷��� �̷��� ����ϸ� �������� 1�� ���� �ݾ�(�Ҽ���)��ŭ ������ ���ظ� ����. ���� 1�� ���� �ݾ��� �ø�ó�� �ؾ� �Ѵ�.
		int kopo34_i_totalCom;// �����Ḧ �ø�ó���� ���� ������ �ݾ��� �����ϱ� ���� int�� ���� kopo34_i_totalCom�� �����Ѵ�.
		if (kopo34_totalCom != (double) ((int)kopo34_totalCom)) {// ���� ��ü �����ῡ �Ҽ����� ������
			kopo34_i_totalCom = (int) kopo34_totalCom + 1;// �Ҽ����� ������ 1���� ���� �ø�ó�� �� ���� kopo34_i_totalCom�� �����Ѵ�.
		} else { // ��ü �����ῡ �Ҽ����� ������
			kopo34_i_totalCom = (int) kopo34_totalCom;// ��ü ������ ���� �״�� kopo34_i_totalCom�� �����Ѵ�.
		}
		
		// �ܵ� ����� �ٽ� ���ش�.
		kopo34_remain = (int) (kopo34_myWon - kopo34_usd * kopo34_moneyEx - kopo34_i_totalCom);// �� �ݾ׿��� �޷� * ȯ�� ���� ����, ��ü �����Ḧ �� �ش�.
		
		// �׷��� �̷��� ����ϸ� �ܵ��� ������ ���� ���� ���� �� �����ϴ� ��Ȳ�� �߻��Ѵ�.
		// ���� �Ǽ������� ���� 1�޷� + 1�޷� �� ȯ�� �������� �ݾ��� ����ϰ� �̸� ��ü�ݾ����� ������ �־�� �Ѵ�.
		
		// ��ȭ ����� �ٽ� ���ش�.
		kopo34_usd = (int) (kopo34_myWon / (kopo34_moneyEx + kopo34_comPerOne));// ��ü �ݾ� ������ (ȯ�� + �޷� �� ������ ��)�� ���� kopo34_usd�� �����Ѵ�.
		
		// ������ ����� �ٽ� ���ش�.
		kopo34_totalCom = kopo34_usd * kopo34_comPerOne;// �� ������ = �޷� �ݾ� * �޷� �� ������
		
		// ������ �ø�ó���� ���� ���ǹ��� �ۼ��Ѵ�.
		if (kopo34_totalCom != (double) ((int)kopo34_totalCom)) {// ���� ��ü �����ῡ �Ҽ����� ������
			kopo34_i_totalCom = (int) kopo34_totalCom + 1;// �Ҽ����� ������ 1���� ���� �ø�ó�� �� ���� kopo34_i_totalCom�� �����Ѵ�.
		} else { // ��ü �����ῡ �Ҽ����� ������
			kopo34_i_totalCom = (int) kopo34_totalCom;// ��ü ������ ���� �״�� kopo34_i_totalCom�� �����Ѵ�.
		}	
		
		// ��ȭ�� ��ü ������ �ݾ��� �ٲ�����Ƿ� �ܵ� ����� �ٽ� ���ش�.
		kopo34_remain = (int) (kopo34_myWon - kopo34_usd * kopo34_moneyEx - kopo34_i_totalCom);
				
		// ��� �� �ݾ׿� ���ڸ����� �޸��� ��� ���� DecimalFormat Ŭ������ �����´�.
		DecimalFormat kopo34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat Ŭ������ ����ϱ� ���� ��ü�� �����ϰ� ����� �������ش�.
		
		// ���� �ð��� ����ϱ� ���� Calendar Ŭ������ �����´�.
		Calendar kopo34_cal = Calendar.getInstance();// Calendar Ŭ������ ����ϱ� ���� ��ü�� �����Ѵ�.
		SimpleDateFormat kopo34_sd = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// SimpleDateFormat Ŭ������ ����ϱ� ���� ��ü�� �����ϰ� ����� �������ش�.
		
		System.out.printf("**************************************************************************************\n");
		System.out.printf("*                                ������ ���� ȯ��                                    *\n");
		
		// DecimalFormat�� ����� printf�� ����� ���� ���������ڸ� %s�� �ٲ�� �Ѵ�.
		System.out.printf("�� ������ : %s�� => ��ȭ : %s�޷�, �޷� �� ������ : %f��\n", 
				 	 	  kopo34_df.format(kopo34_i_totalCom),
					 	  kopo34_df.format(kopo34_usd),
						  kopo34_comPerOne);
		
		
		System.out.printf("�� ��ȭ ȯ�� �ݾ� : %s�� => ��ȭ : %s�޷�, ������ ¡�� : %s��, �ܵ� : %s��\n",
				kopo34_df.format(kopo34_myWon),
				kopo34_df.format(kopo34_usd),
				kopo34_df.format(kopo34_i_totalCom),
				kopo34_df.format(kopo34_remain));
		
		// SimpleDateFormat�� ����� printf�� ����� ���� ���������ڸ� %s�� �ٲ�� �Ѵ�.
		System.out.printf("���� �ð� : %s\n", kopo34_sd.format(kopo34_cal.getTime()));
		System.out.printf("**************************************************************************************\n");
	}

}
