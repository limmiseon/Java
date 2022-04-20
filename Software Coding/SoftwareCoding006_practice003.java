package softwarecoding006;

import java.text.DecimalFormat;// �ݾ׿� �޸��� ��� ���� ���̺귯�� Ŭ����
import java.text.SimpleDateFormat;// ���� �ð� ��� ����� �����ϱ� ���� ���̺귯�� Ŭ����
import java.util.Calendar;// ��¥�� �ð��� ��� ���� ���̺귯�� Ŭ����
import java.util.Date;// ���� ��¥�� �ð��� ��� ���� ���̺귯�� Ŭ����

public class SoftwareCoding006_practice003 {

	public static void main(String[] args) {
		String[] k34_itemName = { "�ٳ��� ����", "����", "������", "�������ֽ�", "���ڿ���", "����ũ ����̿���500g", "���� ���ִ¿��� GT ������", "������ ���÷� 10��",
				"��������(��)65*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼����� ����", "���Ϸν���������500g", "CJ ����Ĩ 20G", "����ũ ����̿��� 500g", "����� ���� ��ũƼ",
				"1+ ��޶� 10���� Ư", "������ݺ�����ġ��ȹ", "����Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ�� 10����", "��������E", "���� ���Ϸ� �� �� �귯��",
				"��� �Ŷ��120*5", "(��)����������", "���ѱ� ������� 156g", "GAP ������ 4-6��/��", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����", "(����)����߰���(g)",
				"DZ�ִϾ�縻3��C_BK", "�����̾��������ʹ�", "�ξ���Ϻ극��", "���Ϸ���巹��535g"};// String�迭 k34_itemName�� �����ϰ� �ʱ�ȭ�Ѵ�. (ǰ���)
		int[] k34_price = { 15000000, 3000, 3300, 1500, 1300, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 7500, 6900, 5980, 3300, 5500, 3380, 6610,
				2750, 10800, 4980, 2480, 7920, 4980, 7130, 4500, 1950 };// k34_price�迭 k34_price�� �����ϰ� �ʱ�ȭ�Ѵ�. (�ܰ�)
		int [] k34_amount = { 2, 4, 1, 1, 10, 5, 3, 2, 1, 1, 4, 7, 3, 8, 2, 9, 5, 1, 2, 2, 1, 7, 3, 5, 4, 3, 1, 7, 2, 4, 1, 2 };// int�迭 k34_num�� �����ϰ� �ʱ�ȭ�Ѵ�. (����)
		boolean[] k34_taxfree = { false, false, true, false, false, false, true, false, false, false, true, false, false, false, false, true, false, false, false, 
				false, false, false, false, false, true, true, false, false, false, false, false, false};// boolean���� k34_taxfree�� �����ϰ� �ʱ�ȭ�Ѵ�. (�鼼 ����)
		double k34_taxRate = 0.1;// double���� k34_taxRate�� �����ϰ� �ʱ�ȭ�Ѵ�. (���� = 10%)
		
		int k34_arrCount = k34_itemCount(k34_itemName);
		int k34_totalSum = k34_totalSum(k34_arrCount, k34_taxfree, k34_price, k34_amount);// ���� ��ǰ�� ���� ���ϱ� ���� k34_totalSum �޼ҵ带 ȣ���Ѵ�.
		int k34_taxFreeSum = k34_taxFreeSum(k34_arrCount, k34_taxfree, k34_price, k34_amount);// �鼼 ��ǰ�� ���� ���ϱ� ���� k34_taxFreeSum �޼ҵ带 ȣ���Ѵ�.
		int k34_netPrice = k34_netPrice(k34_totalSum, k34_taxRate);// ���� �ݾ� ����� ���� int���� k34_netPrice�� �����ϰ� ���� ��� �ݾ��� (1 + ����)�� ���� ������ �ʱ�ȭ�Ѵ�.
		double k34_taxPrice = k34_taxPrice(k34_netPrice, k34_taxRate);// �ΰ����� ����ϱ� ���� int���� k34_taxPrice�� �����ϰ� ���� �ݾ��� ������ ���� ������ �����Ѵ�.
		int k34_totalTaxPrice = k34_totalTaxPrice(k34_taxPrice);// �ΰ��� �ø�ó���� ���� int���� k34_totalTaxPrice�� �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
		int k34_totalPrice = k34_totalSum + k34_taxFreeSum;// �� ���� �ݾ� ����� ���� int���� k34_totalPrice�� �����ϰ� �鼼 �ݾ��� �հ� ���� �ݾ��� ���� ���� ������ �ʱ�ȭ�Ѵ�.
		
		k34_titlePrint();
		k34_timeStemp();
		k34_headerPrint();
		for (int k34_i = 0; k34_i < k34_arrCount; k34_i++) {
			if ((k34_i != 0) && (k34_i % 5 == 0)) {// ǰ�� 5������ ������ ǥ���ϱ� ���� ���ǹ�
												   // k34_i�� 0�� �ƴϰ� k34_i�� 5�� ���� �������� 0�̶��(= 5�� ������)
				System.out.printf("-----------------------------------------\n");// ������ ����Ѵ�.
			}
			k34_itemPrint(k34_itemName[k34_i], k34_taxfree[k34_i], k34_price[k34_i], k34_amount[k34_i]);
		}
		k34_totalPrint(k34_arrCount, k34_taxFreeSum, k34_netPrice, k34_totalTaxPrice, k34_totalPrice);
	}
	
	public static int k34_itemCount(String[] itemArray) {// ǰ���� ������ ���ϴ� �޼ҵ�
		return itemArray.length;
	}
	
	public static void k34_titlePrint() {// Ÿ��Ʋ�� ����ϴ� �޼ҵ�
		System.out.printf("              �̸�Ʈ ������ (031)888-1234\n");
		System.out.printf("     emart    206-86-50913 ����\n");
		System.out.printf("              ���� ������ ������� 552\n");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
		System.out.printf("\n");
	}
	
	public static void k34_timeStemp() {// �ð��� ����ϴ� �޼ҵ�
		// ���� �ð��� ����ϱ� ���� Calendar Ŭ������ �����´�.
		Calendar k34_cal = Calendar.getInstance();// Calendar Ŭ������ ����ϱ� ���� ��ü�� �����Ѵ�.
		k34_cal.setTime(new Date());// ���� ��¥�� ���Ѵ�.
		SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY-MM-dd HH:mm");// ���� �ð��� ��Ĵ�� ����ϱ� ���� SimpleDateFormatŬ������ ��ü�� �����ϰ� ����� �����Ѵ�.
		System.out.printf("[�� ��]%s     POS:0011-9861\n", k34_sd.format(k34_cal.getTime()));
	}
	
	public static void k34_headerPrint() {// ����� ����ϴ� �޼ҵ�
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  �� ǰ ��         �� ��  ����     �� ��\n");
		System.out.printf("-----------------------------------------\n");	
	}
	
	public static void k34_itemPrint(String k34_itemName, boolean k34_taxFree, int k34_price, int k34_amount) {// ǰ���� ����ϴ� �޼ҵ�
		// �ݾ׿� ���ڸ����� �޸��� ��� ���� DecimalFormat Ŭ������ �����´�.
		DecimalFormat k34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat Ŭ������ ����ϱ� ���� ��ü�� �����ϰ� ����� �������ش�.	
		
			if (k34_taxFree) {// �鼼 ��� ǰ�� ���� �߰��ϱ� ���� ���ǹ�
				 					 // k34_taxfree �迭�� k34_i��° �ε����� ���� ���̶��(�鼼 ��ǰ�̶��)
			System.out.printf("* ");// ���� ����Ѵ�.
			} else {// k34_taxfree �迭�� k34_i��° �ε����� ���� �����̶��(���� ��ǰ�̶��)
			System.out.printf("  ");
			}
			k34_printItemName(k34_itemName);
			System.out.printf("%10.10s %2s %10s\n", k34_df.format(k34_price), k34_amount, k34_df.format(k34_price * (k34_amount)));	
	}
	
	public static int k34_taxFreeSum(int k34_arrCount, boolean[] k34_taxfree, int[] k34_price, int[] k34_amount) {// �鼼 ��ǰ�� �հ� �ݾ��� ���ϴ� �޼ҵ�
		int k34_taxFreeSum = 0;
		for (int k34_i = 0; k34_i < k34_arrCount; k34_i++) {// k34_i�� 0���� �����ϰ�, k34_itemName �迭�� ���̸�ŭ �ݺ��ϸ�, ���๮�� ������ k34_i�� 1�� ������Ų��.
																   // �鼼 ��ǰ�� �հ� �ݾ��� ���ϴ� �ݺ���
			if (k34_taxfree[k34_i]) {// ���� k34_taxfree �迭�� k34_i�ε����� ���� ���̶��
				k34_taxFreeSum += k34_price[k34_i] * k34_amount[k34_i];// k34_taxFreeSum�� ���� * ������ ���� ���� ���� �ջ��Ѵ�.
			}		
		}
		return k34_taxFreeSum;// �հ� �ݾ��� ��ȯ�Ѵ�.
	}
	
	public static int k34_totalSum(int k34_arrCount, boolean[] k34_taxfree, int[] k34_price, int[] k34_amount) {// ���� ��ǰ�� �հ� �ݾ��� ���ϴ� �޼ҵ�
		int k34_totalSum = 0;
		for (int k34_i = 0; k34_i < k34_arrCount; k34_i++) {// k34_i�� 0���� �����ϰ�, k34_itemName �迭�� ���̸�ŭ �ݺ��ϸ�, ���๮�� ������ k34_i�� 1�� ������Ų��.
			   													   // ���� ��ǰ�� �հ� �ݾ��� ���ϴ� �ݺ���
			if (!k34_taxfree[k34_i]) {// k34_taxfree �迭�� k34_i�ε����� not ���� ���̶��
			k34_totalSum += k34_price[k34_i] * k34_amount[k34_i];// k34_totalSum�� ���� * ������ ���� ���� ���� �ջ��Ѵ�.
			}
		}
		return k34_totalSum;// �հ� �ݾ��� ��ȯ�Ѵ�.
	}
	
	public static int k34_netPrice(int k34_totalSum, double k34_taxRate) {// ���� �ݾ��� ����ϴ� �޼ҵ�
		return (int) (k34_totalSum / (1 + k34_taxRate));
	}
	
	public static double k34_taxPrice(int k34_netPrice, double k34_taxRate) {// ������ ����ϴ� �޼ҵ�
		return (k34_netPrice * k34_taxRate);
	}
	
	public static int k34_totalTaxPrice(double k34_taxPrice) {// ���� ������ ����ϴ� �޼ҵ�
		int k34_totalTaxPrice = 0;
		if (k34_taxPrice != (double) (int) k34_taxPrice) {// ���� �ΰ����� �Ҽ����� ������
			k34_totalTaxPrice = (int) (k34_taxPrice + 1);// �Ҽ����� ������ 1���� ���� �ø�ó�� �� ���� k34_totalTaxPrice�� �����Ѵ�.
		} else {// �ΰ����� �Ҽ����� ������
			k34_totalTaxPrice = (int) k34_taxPrice;// �ΰ��� ���� �״�� k34_totalTaxPrice�� �����Ѵ�.
		}
		return k34_totalTaxPrice;
	}
	
	
	public static void k34_totalPrint(int k34_arrCount, int k34_taxFreeSum, int k34_netPrice, int k34_totalTaxPrice, int k34_totalPrice) {// ������ �ϴ��� ����ϴ� �޼ҵ�
		// �ݾ׿� ���ڸ����� �޸��� ��� ���� DecimalFormat Ŭ������ �����´�.
		DecimalFormat k34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat Ŭ������ ����ϱ� ���� ��ü�� �����ϰ� ����� �������ش�.
		// ���� �ð��� ����ϱ� ���� Calendar Ŭ������ �����´�.
		Calendar k34_cal = Calendar.getInstance();// Calendar Ŭ������ ����ϱ� ���� ��ü�� �����Ѵ�.
		k34_cal.setTime(new Date());// ���� ��¥�� ���Ѵ�.
		SimpleDateFormat k34_sd2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		SimpleDateFormat k34_sd3 = new SimpleDateFormat("YYYYMMdd");
		System.out.printf("\n");
		System.out.printf("%22s%14.14s\n", "�� ǰ�� ����", k34_df.format(k34_arrCount));
		System.out.printf("%23s%14.14s\n", "(*)�� ��  �� ǰ", k34_df.format(k34_taxFreeSum));
		System.out.printf("%23s%14.14s\n", "�� ��  �� ǰ", k34_df.format(k34_netPrice));
		System.out.printf("%24s%14.14s\n", "��   ��   ��", k34_df.format(k34_totalTaxPrice));
		System.out.printf("%25s%14.14s\n", "��        ��", k34_df.format(k34_totalPrice));
		System.out.printf("%-20s%15.15s\n", "�� �� �� �� �� ��", k34_df.format(k34_totalPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0012 KEB �ϳ�       541707**0484/35860658\n");
		System.out.printf("ī�����(IC)%26s\n", "�Ͻú� / " + k34_df.format(k34_totalPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("           [�ż�������Ʈ ����]\n");
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		int k34_addpoint = k34_totalPrice / 1000;// ����Ʈ ������ ���� int���� k34_addpoint�� �����ϰ� �� ���� �ݾ��� 1000���� ���� ������ �ʱ�ȭ�Ѵ�. (= 0.1% ����)
		int k34_point = 5473;// ���� ����Ʈ 5473���� �����ϱ� ���� int���� k34_point�� �����ϰ� 5473���� �ʱ�ȭ�Ѵ�.
		System.out.printf("��ȸ�߻�����Ʈ         9350**9995%8d\n", k34_addpoint);
		System.out.printf("����(����)����Ʈ     %10.10s(%8s)\n",
						  k34_df.format(k34_point + k34_addpoint), k34_df.format(k34_point));// ���� ����Ʈ�� ���� ����Ʈ + ��ȸ �߻� ����Ʈ�� ���� ������ ����Ѵ�.
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   ���űݾױ��� ���������ð� �ڵ��ο�   \n");
		System.out.printf("������ȣ :                       34��****\n");
		System.out.printf("�����ð� :            %s\n", k34_sd2.format(k34_cal.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ĳ��:084599 ��OO                     1150\n");
		System.out.printf("      %s/00119861/00164980/31\n", k34_sd3.format(k34_cal.getTime()));
	}

	public static void k34_printItemName(String k34_s) {// ������ �̸��� ���̸� ���� ���� �޼ҵ�
		int k34_byte = 0;
		char[] k34_str = k34_s.toCharArray();// ������ �̸��� �ѱ��ھ� �߶� char�迭 k34_str�� �ִ´�.
		
		for (int k34_i = 0; k34_i < k34_str.length; k34_i++) {// ������ �̸��� ���̸� ���� ���� �ݺ���
			if (k34_str[k34_i] >= 'A' && k34_str[k34_i] <= 'z') {// k34_str�迭 k34_i��° �ε����� ���� �����̸�
				k34_byte++;// ����� 1ĭ�� �����ϹǷ� 1�� ���Ѵ�.
			} else if (k34_str[k34_i] >= '\uAC00' && k34_str[k34_i] <= '\uD7A3') {// k34_str�迭 k34_i��° �ε����� ���� �ѱ��̸� (�����ڵ�� ����)
				k34_byte += 2;// �ѱ��� 2ĭ�� �����ϹǷ� 2�� ���Ѵ�.
			} else {
				k34_byte++;// �� �� ���⳪ Ư�����ڶ�� 1�� ���Ѵ�.
			}
			if (k34_byte > 15) {// ���� ����Ʈ ���� 15���� ũ��
				if (k34_str[k34_i] >= '\uAC00' && k34_str[k34_i] <= '\uD7A3')// �μ� ������ ���ڰ� �ѱ��̶��
					System.out.printf(" ");// �ѱ� ��� ������ ����ϰ�
				break;// for������ ����������.
			}
			System.out.printf("%s", k34_str[k34_i]);
			if (k34_byte == 15) {// ���� ����Ʈ ���� 15�̶��
				break;// for������ ����������.
			}
			}
		for (int k34_j = k34_byte; k34_j < 15; k34_j++) {// ���ڼ��� ���� �������� ������ ����ϱ� ���� �ݺ���
														 // k34_j�� k34_byte(����Ʈ ��)���� �����ϰ�, k34_j�� 16���� ���� �� �ݺ��Ǹ�, ���๮�� ������ k34_j�� 1�� ���Ѵ�.
			System.out.printf(" ");
		}
	}
}
