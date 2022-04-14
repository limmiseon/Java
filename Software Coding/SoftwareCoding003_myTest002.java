package softwarecoding003;

import java.util.Arrays;

public class SoftwareCoding003_myTest002 {
	
	public static void main(String[] args) {
		String[] kopo34_item = { "������", "�ѼŻѼ�", "�Ƕ�", "������", "��ũ�ٽ�" };// kopo34_item�̶�� string �迭 ������ �����ϰ� �ʱ�ȭ�Ѵ�.(���� �̸�)
		int[] kopo34_price = { 1000, 950, 2500, 1500, 2000 };// kopo34_price��� int �迭 ������ �����ϰ� �ʱ�ȭ�Ѵ�. (���� ����)
		int[] kopo34_amount = { 10, 3, 4, 5, 1 };// kopo34_amount��� int �迭 ������ �����ϰ� �ʱ�ȭ�Ѵ�.(���� ����)
		double kopo34_taxRate = 0.1;// kopo34_taxRate��� double ������ �����ϰ� �ʱ�ȭ�Ѵ�.(���� = 10%)
		int kopo34_total_sum = 0;// total_sum�̶�� int�� ������ �����ϰ� �ʱ�ȭ�Ѵ�.(���� ���� �ݾ�)
		
		System.out.printf("*******************************************************\n");
		System.out.printf("                      ���� ���                       \n");
		System.out.printf(" �� ��           �� ��         �� ��            �� ��      \n");
		
		// ���� ����� ����ϱ� ���� for���� ����Ѵ�.
		for (int kopo34_i = 0; kopo34_i < kopo34_item.length; kopo34_i++) {// i�� 0���� �����ϰ�, kopo34_item �迭�� ���̸�ŭ �ݺ��ϸ�, ���๮�� ������ i�� 1�� ������Ų��.
			int kopo34_sum = kopo34_price[kopo34_i] * kopo34_amount[kopo34_i];// kopo34_sum�̶�� int�� �迭�� �����ϰ�, ���� ���ݰ� ������ ���� ���� �����Ѵ�.
			kopo34_total_sum += kopo34_sum;// ���� ���� �ݾ�(kopo34_total_sum)�� kopo34_sum�� ���� ���� �ջ��Ѵ�.
			itemPrint(kopo34_item[kopo34_i]);// itemPrint �Լ��� ����Ͽ� ���� �̸��� ����Ѵ�.
			System.out.printf("%5d         %5d           %6d\n", kopo34_price[kopo34_i], kopo34_amount[kopo34_i], kopo34_sum);// ���� ���ݰ� ����, �� ���� ���� �հ� ������ ����Ѵ�.
		}
		
		System.out.printf("*******************************************************\n");
		System.out.printf(" ���� �ݾ� :                     %20d\n", kopo34_total_sum);// �Һ��ڰ� �����ؾ� �� �� �ݾ��� ����Ѵ�.(�����ݾ� + ����)
		
		int kopo34_totalNetPrice = (int) (kopo34_total_sum / (1 + kopo34_taxRate));// ���� �ݾ� ����� ���� int�� ���� kopo34_totalNetPrice�� �����ϰ� �� �ݾ��� 1 + ������ ���� ���� �����Ѵ�.
		System.out.printf(" ���� �ݾ� :                     %20d\n", kopo34_totalNetPrice);// ���� �ݾ��� ����Ѵ�.
		int kopo34_tax = kopo34_total_sum - kopo34_totalNetPrice;// ���� ����� ���� int�� ���� kopo34_tax�� �����ϰ� �� �ݾ׿��� ���� �ݾ��� �� ���� �����Ѵ�.
		System.out.printf(" ��     �� :                     %20d\n", kopo34_tax);// ���� �ݾ��� ����Ѵ�.
	}
	
	public static void itemPrint(String kopo34_item) {// ���� �̸� ����� ���� itemPrint �Լ��� �����. ���ڴ� String �����̴�.
		char[] kopo34_itemChar = kopo34_item.toCharArray();//String ������ ���ھ� ���� char �迭�� �����Ѵ�.
		System.out.printf(" %s",  kopo34_item);// ���� �̸��� ����Ѵ�.
		// ���� ���߱� ���� ������ �־� �� for���� �ۼ��Ѵ�.
		for (int kopo34_j = kopo34_itemChar.length; kopo34_j < 8; kopo34_j++) {// j�� kopo34_itemChar �迭�� ���� ������ �����ϰ�, 8���� ���� ������ �ݺ��ϸ�, ���๮�� ������ j�� 1�� ������Ų��.
			System.out.print("  ");// ������ ����Ѵ�.(ex. "�Ƕ�"�� 2���̹Ƿ� ������ 6�� ����� ���� �����)
		}
	}
	
}
