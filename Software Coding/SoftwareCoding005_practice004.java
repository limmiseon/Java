package softwarecoding005;

import java.text.DecimalFormat;// �ݾ׿� �޸��� ��� ���� ���̺귯�� Ŭ����
import java.text.SimpleDateFormat;// ���� �ð� ��� ����� �����ϱ� ���� ���̺귯�� Ŭ����
import java.util.Calendar;// ��¥�� �ð��� ��� ���� ���̺귯�� Ŭ����
import java.util.Date;// ���� ��¥�� �ð��� ��� ���� ���̺귯�� Ŭ����

public class SoftwareCoding005_practice004 {

	public static void main(String[] args) {
		// ������ ���(1)
		int k34_totalPrice = 33000;// int���� k34_totalPrice�� �����Ѵ�. (���� ���� �ݾ�)
		double k34_taxRate = 0.1;// double���� k34_taxRate�� �����Ѵ�. (���� = 10%)
		double k34_netPrice = k34_totalPrice / (1 + k34_taxRate);// double���� k34_price�� �����ϰ� ���� �ݾ����� �ʱ�ȭ�Ѵ�.
		
		int k34_totlaNetPrice;// int���� k34_totlaNetPrice�� �����Ѵ�. (�ݾ׿� �Ҽ����� ���� �� �ø�ó���� ����)
		if (k34_netPrice != (double) ((int)k34_netPrice)) {// ���� ���� �ݾ׿� �Ҽ����� ������
			k34_totlaNetPrice = (int) k34_netPrice + 1;// �Ҽ����� ������ 1���� ���� �ø�ó�� �� ���� k34_totlaNetPrice�� �����Ѵ�.
		} else { // ���� �ݾ׿� �Ҽ����� ������
			k34_totlaNetPrice = (int) k34_netPrice;// ���� �ݾ��� �״�� k34_totlaNetPrice�� �����Ѵ�.
		}
		
		int k34_tax = k34_totalPrice - k34_totlaNetPrice;// int���� t34_tax�� �����Ѵ�. (����)
														 // ���� ���� �ݾ� - �����ݾ� ������ �ʱ�ȭ�Ѵ�.
		
		// ��� �� �ݾ׿� ���ڸ����� �޸��� ��� ���� DecimalFormat Ŭ������ �����´�.
		DecimalFormat k34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat Ŭ������ ����ϱ� ���� ��ü�� �����ϰ� ����� �������ش�.
		
		// ���� �ð��� ����ϱ� ���� Calendar Ŭ������ �����´�.
		Calendar k34_cal = Calendar.getInstance();// Calendar Ŭ������ ����ϱ� ���� ��ü�� �����Ѵ�.
		SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// SimpleDateFormat Ŭ������ ����ϱ� ���� ��ü�� �����ϰ� ����� �������ش�.		
		
		System.out.printf("�ſ����\n");
		System.out.printf("�ܸ��� : 2N68665898           ��ǥ��ȣ : 041218\n");
		System.out.printf("������ : �Ѿ��ġ�\n");
		System.out.printf("��  �� : ��� ������ �д籸 Ȳ�����351���� 10 ,\n1��\n");
		System.out.printf("��ǥ�� : ��â��\n");
		System.out.printf("����� : 752-53-00558             TEL : 7055695\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - \n");
		System.out.printf("��  ��%39s��\n", k34_df.format(k34_totlaNetPrice));
		System.out.printf("�ΰ���%39s��\n", k34_df.format(k34_tax));
		System.out.printf("��  ��%39s��\n", k34_df.format(k34_totalPrice));
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - \n");
		System.out.printf("�츮ī��\n");
		System.out.printf("ī���ȣ : 5387-20**-****-4613(S)        �Ͻú�\n");
		System.out.printf("�ŷ��Ͻ� : %s\n", k34_sd.format(k34_cal.getTime()));// 
		System.out.printf("���ι�ȣ : 70404427\n");
		System.out.printf("�ŷ���ȣ : 357734873739\n");
		System.out.printf("���� : ��ī���       ���� : 720068568\n");
		System.out.printf("�˸� : EDC����ǥ\n");
		System.out.printf("���� : TEL)1544-4700\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("                 * �����մϴ� *\n");
		System.out.printf("                            ǥ��V2. 08_20200212\n");
	}
}
