package softwarecoding007;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class SoftwareCoding007_practice012_InputDataSortMain {
	
	static ArrayList <SoftwareCoding007_practice009_oneRecClass> k34_arrOneRec = new ArrayList <SoftwareCoding007_practice009_oneRecClass>();
	static final int k34_iPerson = 200; // (= �迭�� ����)
	
	static void k34_dataSet() { // �����͸� ����� �޼ҵ�
		for (int k34_i = 0; k34_i < k34_iPerson; k34_i++) {
			String k34_name = String.format("ȫ��%02d", (k34_i + 1));
			int k34_kor = (int) (Math.random() * 100);
			int k34_eng = (int) (Math.random() * 100);
			int k34_mat = (int) (Math.random() * 100);
			// �ϳ��� OneRecŬ������ ���� �� ��̸���Ʈ�� �������
			k34_arrOneRec.add(new SoftwareCoding007_practice009_oneRecClass(k34_i, k34_name, k34_kor, k34_eng, k34_mat));
		}
	}
	
	static void k34_dataSort() {// ����
		Comparator<SoftwareCoding007_practice009_oneRecClass> k34_bikyo = new Comparator<SoftwareCoding007_practice009_oneRecClass>() {
			public int compare(SoftwareCoding007_practice009_oneRecClass a1, SoftwareCoding007_practice009_oneRecClass a2) {// �� �Ű����� ��ü�� ���Ѵ�.
				return (a2.k34_sum() - a1.k34_sum());
			}
		};
		Collections.sort(k34_arrOneRec, k34_bikyo);// k34_arrOneRec Ŭ���� �迭�� �����Ѵ�.
	}
	
	static void k34_itemPrint() {// ���� �μ�
		SoftwareCoding007_practice009_oneRecClass k34_rec; // oneRecŬ������ ��ü ����
		Calendar k34_cal = Calendar.getInstance();// Calendar Ŭ������ ����ϱ� ���� ��ü�� �����Ѵ�.
		k34_cal.setTime(new Date());// ���� ��¥�� ���Ѵ�.
		SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY.MM.dd HH:mm");// ���� �ð��� ��Ĵ�� ����ϱ� ���� SimpleDateFormatŬ������ ��ü�� �����ϰ� ����� �����Ѵ�.
		
		int k34_pagePerson = 30;
		int k34_page = 0; // �������� ǥ���ϱ� ���� ����
		
		// �迭 index 0 ~ 4������ ���� ������ , 5 ~ 9 ������ ���� ������
		int[] k34_sum = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] k34_avg = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		for (int k34_i = 0; k34_i < k34_arrOneRec.size(); k34_i++) {// �Է� �� ��ŭ ����� ����ϱ� ���� �ݺ���
			k34_rec = k34_arrOneRec.get(k34_i);// ��̸���Ʈ�� ���� �������
			if ((k34_i == 0) || k34_i % k34_pagePerson == 0) {// ���� k34_i�� 0�̰ų� 30�� ����̸� (��� ���)
				k34_page++;// �������� 1�� ���Ѵ�.
				System.out.printf("%25s", "��������ǥ\n");
				System.out.printf("PAGE: %2d%48s\n", k34_page, "������� : " + k34_sd.format(k34_cal.getTime()));
				System.out.printf("============================================================\n");
				System.out.printf("%s%5s%7s%6s%6s%6s%6s\n","��ȣ", "�̸�", "����", "����", "����", "����", "���");
				System.out.printf("============================================================\n");
			}
			
			System.out.printf("%03d%7s%8d%8d%8d%8d   %6.2f\n",
					(k34_i + 1),  k34_rec.k34_name,  k34_rec.k34_kor, k34_rec.k34_eng, k34_rec.k34_mat, k34_rec.k34_sum(), k34_rec.k34_ave());		
			k34_sum[0] += k34_rec.k34_kor();// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[5] += k34_rec.k34_kor();// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[1] += k34_rec.k34_eng();// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[6] += k34_rec.k34_eng();// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[2] += k34_rec.k34_mat();// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[7] += k34_rec.k34_mat();// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[3] += k34_rec.k34_sum();// ���� ������ ������ �հ踦 �˱� ���� ������ ���Ѵ�.
			k34_sum[8] += k34_rec.k34_sum();// ���� ������ ������ �հ踦 �˱� ���� ������ ���Ѵ�.
			k34_sum[4] += k34_rec.k34_ave();// ���� ������ ����� �հ踦 �˱� ���� ����� ���Ѵ�.
			k34_sum[9] += k34_rec.k34_ave();// ���� ������ ����� �հ踦 �˱� ���� ����� ���Ѵ�.
			
			
			if ((k34_i + 1) % k34_pagePerson == 0) {// ���� k34_i + 1�� k34_pagePerson�� ����̸� (�ϴܺ� ���)
				k34_avg[0] = k34_sum[0] / k34_pagePerson;// ���� ������ ���� ������ �հ踦 k34_pagePerson���� ������.
				k34_avg[1] = k34_sum[1] / k34_pagePerson;// ���� ������ ���� ������ �հ踦 k34_pagePerson���� ������.
				k34_avg[2] = k34_sum[2] / k34_pagePerson;// ���� ������ ���� ������ �հ踦 k34_pagePerson���� ������.
				k34_avg[3] = k34_sum[3] / k34_pagePerson;// ���� ������ ������ �հ踦 k34_pagePerson���� ������.
				k34_avg[4] = k34_sum[4] / k34_pagePerson;// ���� ������ ����� �հ踦 k34_pagePerson���� ������.
				
				k34_avg[5] = k34_sum[5] / (k34_i + 1);// ���� ������ ���� �հ踦 (k34_i + 1)�� ������.
				k34_avg[6] = k34_sum[6] / (k34_i + 1);// ���� ������ ���� �հ踦 (k34_i + 1)�� ������.
				k34_avg[7] = k34_sum[7] / (k34_i + 1);// ���� ������ ���� �հ踦 (k34_i + 1)�� ������.
				k34_avg[8] = k34_sum[8] / (k34_i + 1);// ������ ���� �հ踦 (k34_i + 1)�� ������.
				k34_avg[9] = k34_sum[9] / (k34_i + 1);// ����� ���� �հ踦 (k34_i + 1)�� ������.
				
				
				System.out.printf("============================================================\n");
				System.out.printf("���� ������\n");
				System.out.printf("�հ�%16d%8d%8d%8d%8d\n", k34_sum[0], k34_sum[1], k34_sum[2], k34_sum[3], k34_sum[4]);
				System.out.printf("���%16d%8d%8d%8d%8d\n", k34_avg[0], k34_avg[1], k34_avg[2], k34_avg[3], k34_avg[4]);
				System.out.printf("============================================================\n");
				System.out.printf("���� ������\n");
				System.out.printf("�հ�%16d%8d%8d%8d%8d\n", k34_sum[5], k34_sum[6], k34_sum[7], k34_sum[8], k34_sum[9]);
				System.out.printf("���%16d%8d%8d%8d%8d\n", k34_avg[5], k34_avg[6], k34_avg[7], k34_avg[8], k34_avg[9]);
				
				k34_sum[0] = 0;// ���� ������ ���� ������ �հ迡 0�� �ִ´�.
				k34_sum[1] = 0;// ���� ������ ���� ������ �հ迡 0�� �ִ´�.
				k34_sum[2] = 0;// ���� ������ ���� ������ �հ迡 0�� �ִ´�.
				k34_sum[3] = 0;// ���� ������ ���� ������ �հ迡 0�� �ִ´�.
				k34_sum[4] = 0;// ���� ������ ��� ������ �հ迡 0�� �ִ´�.
			}
			
			if ((k34_i + 1) == k34_iPerson) {// ���� k34_i + 1�� k34_iPerson�� ������ (������ �ϴܺ� ���)
				k34_avg[0] = k34_sum[0] / (k34_iPerson % k34_pagePerson);// ���� ������ ����� k34_iPerson�� k34_pagePerson���� ���� �������� ������.
				k34_avg[1] = k34_sum[1] / (k34_iPerson % k34_pagePerson);// ���� ������ ����� k34_iPerson�� k34_pagePerson���� ���� �������� ������.
				k34_avg[2] = k34_sum[2] / (k34_iPerson % k34_pagePerson);// ���� ������ ����� k34_iPerson�� k34_pagePerson���� ���� �������� ������.
				k34_avg[3] = k34_sum[3] / (k34_iPerson % k34_pagePerson);// ������ ����� k34_iPerson�� k34_pagePerson���� ���� �������� ������.
				k34_avg[4] = k34_sum[4] / (k34_iPerson % k34_pagePerson);// ����� ����� k34_iPerson�� k34_pagePerson���� ���� �������� ������.
				
				k34_avg[5] = k34_sum[5] / k34_iPerson;// ���� ������ ���� ����� k34_person���� ������.
				k34_avg[6] = k34_sum[6] / k34_iPerson;// ���� ������ ���� ����� k34_person���� ������.
				k34_avg[7] = k34_sum[7] / k34_iPerson;// ���� ������ ���� ����� k34_person���� ������.
				k34_avg[8] = k34_sum[8] / k34_iPerson;// ������ ���� ����� k34_person���� ������.
				k34_avg[9] = k34_sum[9] / k34_iPerson;// ����� ���� ����� k34_person���� ������.
				
				System.out.printf("============================================================\n");
				System.out.printf("���� ������\n");
				System.out.printf("�հ�%16d%8d%8d%8d%8d\n", k34_sum[0], k34_sum[1], k34_sum[2], k34_sum[3], k34_sum[4]);
				System.out.printf("���%16d%8d%8d%8d%8d\n", k34_avg[0], k34_avg[1], k34_avg[2], k34_avg[3], k34_avg[4]);
				System.out.printf("============================================================\n");
				System.out.printf("���� ������\n");
				System.out.printf("�հ�%16d%8d%8d%8d%8d\n", k34_sum[5], k34_sum[6], k34_sum[7], k34_sum[8], k34_sum[9]);
				System.out.printf("���%16d%8d%8d%8d%8d\n", k34_avg[5], k34_avg[6], k34_avg[7], k34_avg[8], k34_avg[9]);
			}
		}
	}

	public static void main(String[] args) {
		
		k34_dataSet();// ������ ����
		k34_dataSort();// ����
		k34_itemPrint();// ����ǥ ���
	}
}

