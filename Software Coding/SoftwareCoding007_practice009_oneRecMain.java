package softwarecoding007;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class SoftwareCoding007_practice009_oneRecMain {
	
	static ArrayList <SoftwareCoding007_practice009_oneRecClass> k34_arrOneRec = new ArrayList <SoftwareCoding007_practice009_oneRecClass>();
	static int k34_sumKor = 0;
	static int k34_sumEng = 0;
	static int k34_sumMat = 0;
	static int k34_sumSum = 0;
	static int k34_sumAve = 0;
	static final int k34_iPerson = 20; // (= �迭�� ����)
	
	static void k34_dataSet() { // �����͸� ����� �޼ҵ�
		for (int k34_i = 0; k34_i < k34_iPerson; k34_i++) {
			String k34_name = String.format("ȫ��%02d", k34_i);
			int k34_kor = (int) (Math.random() * 100);
			int k34_eng = (int) (Math.random() * 100);
			int k34_mat = (int) (Math.random() * 100);
			// �ϳ��� OneRecŬ������ ���� �� ��̸���Ʈ�� �������
			k34_arrOneRec.add(new SoftwareCoding007_practice009_oneRecClass(k34_i, k34_name, k34_kor, k34_eng, k34_mat));
		}
	}
	static void k34_headerPrint() {// ��� �μ�
		System.out.printf("============================================================\n");
		System.out.printf("%s%5s%7s%6s%6s%6s%6s\n","��ȣ", "�̸�", "����", "����", "����", "����", "���");
		System.out.printf("============================================================\n");
	}
	static void k34_itemPrint(int k34_i) {// ���� �μ�
		SoftwareCoding007_practice009_oneRecClass k34_rec; // oneRecŬ������ ��ü ����
		k34_rec = k34_arrOneRec.get(k34_i);// ��̸���Ʈ�� ���� �������
		System.out.printf("%3s%7s%8d%8d%8d%8d   %6.2f\n",
		k34_rec.k34_studentId,  k34_rec.k34_name,  k34_rec.k34_kor, k34_rec.k34_eng, k34_rec.k34_mat, k34_rec.k34_sum(), k34_rec.k34_ave());
		
		k34_sumKor += k34_rec.k34_kor();// ���� ���� ���� �ջ�
		k34_sumEng += k34_rec.k34_eng();// ���� ���� ���� �ջ�
		k34_sumMat += k34_rec.k34_mat();// ���� ���� ���� �ջ�
		k34_sumSum += k34_rec.k34_sum();// �հ� ���� �ջ�
		k34_sumAve += k34_rec.k34_ave();// ��� ���� �ջ�
	}
	static void k34_tailPrint() { //���� �μ�
		System.out.printf("============================================================\n");
		System.out.printf("���� �հ� %8d ���� ��� : %6.2f\n", k34_sumKor, k34_sumKor / (double)k34_arrOneRec.size());
		System.out.printf("���� �հ� %8d ���� ��� : %6.2f\n", k34_sumEng, k34_sumEng / (double)k34_arrOneRec.size());
		System.out.printf("���� �հ� %8d ���� ��� : %6.2f\n", k34_sumMat, k34_sumMat / (double)k34_arrOneRec.size());
		System.out.printf("============================================================\n");
		System.out.printf("�� ��� �հ� %5d  �� ��� : %6.2f\n", k34_sumAve, k34_sumAve / (double)k34_arrOneRec.size());
	}
	public static void main(String[] args) {
		
		k34_dataSet();// ������ ����
		k34_headerPrint();
		for (int k34_i = 0; k34_i < k34_arrOneRec.size(); k34_i++) {// �л� ��� �μ�
			k34_itemPrint(k34_i);
		}
		k34_tailPrint();
	}
}

