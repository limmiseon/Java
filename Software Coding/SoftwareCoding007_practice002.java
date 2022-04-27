package softwarecoding007;

import java.text.DecimalFormat;

public class SoftwareCoding007_practice002 {

	public static void main(String[] args) {
		// �հ� ���� ���α׷�
		String[] k34_OneRec = {
				"  �ٳ��� ����         1,500  2      2,000",
				"  ����                3,000  4     12,000",
				"* ������              3,300  1      3,300",
				"  �������ֽ�          1,500  1      1,500",
				"  ���ڿ���            1,300 10     13,000",
				"  ����ũ ����̿�     4,480  5     22,400",
				"* ���� ���ִ¿���     4,980  3     14,940",
				"  ������ ���÷�     3,210  2      6,420",
				"  ��������(��)6     6,950  1      6,950",
				"  �ɶ�ý� ����       2,980  1      2,980",
				"* Ǫ���� �̼�����     1,990  4      7,960",
				"  ���Ϸν�������      1,980  7     13,860",
				"  CJ ����Ĩ 20G     3,980  3     11,940",
				"  ����ũ ����̿�     4,480  8     35,840",
				"  ����� ���� ��      3,480  2      6,960",
				"* 1+ ��޶� 10��      7,980  9     71,820",
				"  ������ݺ�����      7,500  5     37,500",
				"  ����Ȩ SAFE365      6,900  1      6,900",
				"  (G)LH��������ȭ     5,980  2     11,960",
				"  ��������E           3,300  2      6,600",
				"  ���� ���Ϸ�       5,500  1      5,500",
				"  ��� �Ŷ��120*     3,380  7     23,660",
				"  (��)��������      6,610  3     19,830",
				"  ���ѱ� �������     2,750  5     13,750",
				"* GAP ������ 4-    10,800  4     33,200",
				"* �� ����� �ٳ�      4,980  3     14,940",
				"  ����ũ ź�θ�       2,480  1      2,480",
				"  (����)����߰�      7,920  7     55,440",
				"  DZ�ִϾ�縻3��     4,980  2      9,960",
				"  �����̾�������      7,130  4     28,520",
				"  �ξ���Ϻ극��      4,500  1      4,500",
				"  ���Ϸ���巹��5     1,950  2      3,900" };
		
		DecimalFormat k34_df = new DecimalFormat("###,###,###,###,###");// DecimalFormat Ŭ������ ����ϱ� ���� ��ü�� �����ϰ� ����� �������ش�.
		
		String k34_priceStr = "";// ������ �ڸ� ���ڿ��� �����ϴ� String����
		String k34_amountStr = "";;// ������ �ڸ� ���ڿ��� �����ϴ� String����
		String k34_totalPriceStr = "";// �� �ݾ��� �ڸ� �����ϴ� ���� String����
		
		int k34_price = 0;// ���� ���ڿ��� ���������� ��ȯ�� �� �����ϴ� int����
		int k34_amount = 0;// ���� ���ڿ��� ���������� ��ȯ�� �� �����ϴ� int����
		int k34_totalPrice = 0;// �� �ݾ��� ���������� ��ȯ�� �� �����ϴ� int����
		
		String k34_modifyStr;// ������ ���ڿ��� �����ϴ� ����
		
		for (int k34_i = 0; k34_i < k34_OneRec.length; k34_i++) {// ���ڿ��� �ڸ���, ���������� ��ȯ�ϰ�, �հ踦 �����ϱ� ���� �ݺ���
			byte[] k34_gb = k34_OneRec[k34_i].getBytes();// k34_OneRec �迭 k34_i��° �ε����� ���ڿ��� ����Ʈ�� ��ȯ�Ѵ�.
			
			k34_priceStr = new String(k34_gb, 17, 10);// 17��° ����Ʈ���� 10���� �߶� ���� �迭�� �ִ´�.
			k34_priceStr = k34_priceStr.replaceAll(",", "");// �޸��� �����Ѵ�.
			k34_priceStr = k34_priceStr.replaceAll(" ", "");// ������ �����Ѵ�.
			k34_price = Integer.parseInt(k34_priceStr);// ���������� ��ȯ �� int�迭�� �ִ´�.
			
			k34_amountStr = new String(k34_gb, 27, 3);// 27��° ����Ʈ���� 3���� �߶� ���� �迭�� �ִ´�.
			k34_amountStr = k34_amountStr.replaceAll(",", "");// �޸��� �����Ѵ�.
			k34_amountStr = k34_amountStr.replaceAll(" ", "");// ������ �����Ѵ�.
			k34_amount = Integer.parseInt(k34_amountStr);// ���������� ��ȯ �� int�迭�� �ִ´�.
			
			k34_totalPriceStr = new String(k34_gb, 30, 11);// 30��° ����Ʈ���� 11���� �߶� ǰ��� �ݾ� �迭�� �ִ´�.
			k34_totalPriceStr = k34_totalPriceStr.replaceAll(",", "");// �޸��� �����Ѵ�.
			k34_totalPriceStr = k34_totalPriceStr.replaceAll(" ", "");// ������ �����Ѵ�.
			k34_totalPrice = Integer.parseInt(k34_totalPriceStr);// ���������� ��ȯ �� int�迭�� �ִ´�.
			
			if ((k34_price* k34_amount) != k34_totalPrice) {// ���� ���� * ������ �� �ݾװ� ���� �ʴٸ�
				System.out.printf("*************************\n");
				System.out.printf("���� :%s\n", k34_OneRec[k34_i]);
				// ������ ���ڿ� = �� �ݾ� �������� ���ڿ� + ������ �� �ݾ� ���ڿ�
				k34_modifyStr = new String(k34_gb, 0, 30) + String.format("%11.11s", k34_df.format(k34_price * k34_amount));
				System.out.printf("���� :%s\n", k34_modifyStr);
				System.out.printf("*************************\n");
			}
		}
	}
}
