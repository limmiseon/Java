package softwarecoding005;

import java.text.DecimalFormat;// �ݾ׿� �޸��� ��� ���� ���̺귯�� Ŭ����
import java.text.SimpleDateFormat;// ���� �ð� ��� ����� �����ϱ� ���� ���̺귯�� Ŭ����
import java.util.Calendar;// ��¥�� �ð��� ��� ���� ���̺귯�� Ŭ����
import java.util.Date;// ���� ��¥�� �ð��� ��� ���� ���̺귯�� Ŭ����

public class SoftwareCoding005_practice005 {

	public static void main(String[] args) {
		// ������ ���(2)
		String[] k34_itemName = { "ǻ��� �����ܿ븶��ũ(�ְ����)", "�����̵�ĸ���(������)(100ȣ)", "�������� ���׸�����ũ(�˷�̴�Ÿ��)" };
		String[] k34_itemCode = { "1031615", "1008152", "1020800" };
		int[] k34_price = { 3000, 1000, 1000 };
		int[] k34_amount = { 1, 1, 1 };
		
		double k34_taxRate = 0.1;//double���� k34_taxRate�� �����ϰ� 0.1�� �ʱ�ȭ�Ѵ�. (���� = 10%)
		
		int k34_totalPrice = 0; // �� �ݾ��� ������ ���� k34_totalPrice�� �����Ѵ�.
		for (int k34_i = 0; k34_i < k34_itemName.length; k34_i++) {// �� �ݾ��� ���ϱ� ���� �ݺ���
			k34_totalPrice += k34_price[k34_i] * k34_amount[k34_i];
		}
		
		int k34_netPrice = (int) (k34_totalPrice / (1 + k34_taxRate));// ���� �ݾ� ����� ���� int�� ���� k34_netPrice�� �����ϰ� �� �ݾ��� 1 + ������ ���� ���� �����Ѵ�.
		int k34_tax = k34_totalPrice - k34_netPrice;// ���� ����� ���� int�� ���� k34_tax�� �����ϰ� �� �ݾ׿��� ���� �ݾ��� �� ���� �����Ѵ�.
		
		// ��� �� �ݾ׿� ���ڸ����� �޸��� ��� ���� DecimalFormat Ŭ������ �����´�.
		DecimalFormat k34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat Ŭ������ ����ϱ� ���� ��ü�� �����ϰ� ����� �������ش�.
				
		// ���� �ð��� ����ϱ� ���� Calendar Ŭ������ �����´�.
		Calendar k34_cal = Calendar.getInstance();// Calendar Ŭ������ ����ϱ� ���� ��ü�� �����Ѵ�.
		k34_cal.setTime(new Date());// ���� ��¥�� ���Ѵ�.
		SimpleDateFormat k34_sd1 = new SimpleDateFormat("MM��dd��");// ��ȯ/ȯ�� ��¥�� ��Ĵ�� ����ϱ� ���� SimpleDateFormatŬ������ ��ü�� �����ϰ� ����� �����Ѵ�.
		SimpleDateFormat k34_sd2 = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// ���� �ð��� ��Ĵ�� ����ϱ� ���� SimpleDateFormatŬ������ ��ü�� �����ϰ� ����� �����Ѵ�.	
	
		System.out.printf("              \"���ΰ���, ���̼�\"\n");
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");
		System.out.printf("��ǥ:������, ��ȣ�� 213-81-52063\n");
		System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (����\n��)\n");
		System.out.printf("================================================\n");
		System.out.printf("         �Һ����߽ɰ濵 (CCM) �������\n");
		System.out.printf("        ISO 9001 ǰ���濵�ý��� �������\n");
		System.out.printf("================================================\n");
		k34_cal.add(Calendar.DATE, + 14);// ��ȯ/ȯ���� 14�� �̳��� �����ϹǷ� + 14�� ���ش�.
		System.out.printf("         ��ȯ/ȯ�� 14��(%s)�̳�,\n", k34_sd1.format(k34_cal.getTime()));
		System.out.printf("(����)������, ����ī�� ���� �� ���Ը��忡�� ����\n");
		System.out.printf("       ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("         üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.printf("================================================\n");
		k34_cal.setTime(new Date());// ���� ��¥�� �ٽ� �����Ѵ�.
		System.out.printf("[POS 1058231]                %s\n", k34_sd2.format(k34_cal.getTime()));
		System.out.printf("================================================\n");
		
		
		for (int k34_i = 0; k34_i < k34_itemName.length; k34_i++) {// ǰ���� ���� ���� ����ϱ� ���� �ݺ���
			k34_printItemName(k34_itemName[k34_i]);
			System.out.printf("%9s%4s%9s\n", k34_df.format(k34_price[k34_i]), k34_amount[k34_i], k34_df.format(k34_price[k34_i] * k34_amount[k34_i]));
			System.out.printf("[%s]\n", k34_itemCode[k34_i]);
		}
		

		System.out.printf("%18s%26s\n", "�����հ�", k34_df.format(k34_netPrice));
		System.out.printf("%19s%26s\n", "�ΰ���", k34_df.format(k34_tax));
		System.out.printf("------------------------------------------------\n");
		System.out.printf("�Ǹ��հ�%40s\n", k34_df.format(k34_totalPrice));
		System.out.printf("================================================\n");
		System.out.printf("�ſ�ī��%40s\n", k34_df.format(k34_totalPrice));
		System.out.printf("------------------------------------------------\n");
		System.out.printf("�츮ī��                       538720**********\n");
		System.out.printf("���ι�ȣ 77982840(%26s\n", "���αݾ� " + k34_df.format(k34_totalPrice));
		System.out.printf("================================================\n");
		System.out.printf("%28s �д缭����\n", k34_sd2.format(k34_cal.getTime()));// ���� �ð��� ����Ѵ�.
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("             2112820610158231\n");
		System.out.printf("------------------------------------------------\n");
		System.out.printf(" �� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�\n  ȸ������ �� �پ��� ������ ����������! ��\n");
		}


	public static void k34_printItemName(String k34_s) {// ������ �̸��� ���̸� ���� ���� �Լ�
		int k34_byte1 = 0;
		char[] k34_str1 = k34_s.toCharArray();// ������ �̸��� �ѱ��ھ� �߶� char�迭 k34_str�� �ִ´�.
		
		for (int k34_i = 0; k34_i < k34_str1.length; k34_i++) {// ������ �̸��� ����Ʈ�� ���� ���� �ݺ���
			if (k34_str1[k34_i] >= 'A' && k34_str1[k34_i] <= 'z') {// k34_str�迭 k34_i��° �ε����� ���� �����̸�
				k34_byte1++;// ����� 1ĭ�� �����ϹǷ� 1�� ���Ѵ�.
			} else if (k34_str1[k34_i] >= '\uAC00' && k34_str1[k34_i] <= '\uD7A3') {// k34_str�迭 k34_i��° �ε����� ���� �ѱ��̸� (�����ڵ�� ����)
				k34_byte1 += 2;// �ѱ��� 2ĭ�� �����ϹǷ� 2�� ���Ѵ�.
			} else {
				k34_byte1++;// �� �� ���⳪ Ư�����ڶ�� 1�� ���Ѵ�.
			}
			if (k34_byte1 > 26) {// ���� ����Ʈ ���� 26���� ũ��
				if (k34_str1[k34_i] >= '\uAC00' && k34_str1[k34_i] <= '\uD7A3')// �μ� ������ ���ڰ� �ѱ��̶��
					System.out.printf(" ");// �ѱ� ��� ������ ����ϰ�
				break;// for������ ����������.
			}
			System.out.printf("%s", k34_str1[k34_i]);
			if (k34_byte1 == 26) {// ���� ����Ʈ ���� 26�̶��
				break;// for������ ����������.
			}
		}
		for (int k34_j = k34_byte1; k34_j < 26; k34_j++) {// ���ڼ��� ���� �������� ������ ����ϱ� ���� �ݺ���
														   // k34_j�� k34_byte(����Ʈ ��)���� �����ϰ�, k34_j�� 26���� ���� �� �ݺ��Ǹ�, ���๮�� ������ k34_j�� 1�� ���Ѵ�.
			System.out.printf(" ");
		}
	}
}
