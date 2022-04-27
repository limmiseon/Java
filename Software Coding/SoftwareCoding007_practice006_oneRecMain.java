package softwarecoding007;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SoftwareCoding007_practice006_oneRecMain {
	
	public static void main(String[] args) {
		
		int k34_person = 5;// �� ���� �ִ� ��ŭ ����Ұ� �����ȴ�.
		
		SoftwareCoding007_practice006_oneRecClass[] k34_inpuData= new SoftwareCoding007_practice006_oneRecClass[k34_person];// Ŭ���� ������ �迭�� �����ȴ�.
		k34_inpuData[0] = new SoftwareCoding007_practice006_oneRecClass("ȫ��01", 100, 100, 90);// �� �迭���� Ŭ���� �ν��Ͻ��� �����Ѵ�.
		k34_inpuData[1] = new SoftwareCoding007_practice006_oneRecClass("ȫ��02", 90, 90, 90);// �� �迭���� Ŭ���� �ν��Ͻ��� �����Ѵ�.
		k34_inpuData[2] = new SoftwareCoding007_practice006_oneRecClass("ȫ��03", 80, 70, 90);// �� �迭���� Ŭ���� �ν��Ͻ��� �����Ѵ�.
		k34_inpuData[3] = new SoftwareCoding007_practice006_oneRecClass("ȫ��04", 70, 60, 90);// �� �迭���� Ŭ���� �ν��Ͻ��� �����Ѵ�.
		k34_inpuData[4] = new SoftwareCoding007_practice006_oneRecClass("ȫ��05", 60, 100, 90);// �� �迭���� Ŭ���� �ν��Ͻ��� �����Ѵ�.
		
		Calendar k34_cal = Calendar.getInstance();// Calendar Ŭ������ ����ϱ� ���� ��ü�� �����Ѵ�.
		k34_cal.setTime(new Date());// ���� ��¥�� ���Ѵ�.
		SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY.MM.dd HH:mm");// ���� �ð��� ��Ĵ�� ����ϱ� ���� SimpleDateFormatŬ������ ��ü�� �����ϰ� ����� �����Ѵ�.
		
		int k34_pagePerson = 3;
		int k34_page = 0; // �������� ǥ���ϱ� ���� ����
		// �迭 index 0 ~ 4������ ���� ������ , 5 ~ 9 ������ ���� ������
		int[] k34_sum = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] k34_avg = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		for (int k34_i = 0; k34_i < k34_inpuData.length; k34_i++) {// �Է� �� ��ŭ ����� ����ϱ� ���� �ݺ���
			if ((k34_i == 0) || k34_i % k34_pagePerson == 0) {// ���� k34_i�� 0�̰ų� k34_pagePerson�� ����̸� (��� ���)
				k34_page++;// �������� 1�� ���Ѵ�.
				System.out.printf("%25s", "��������ǥ\n");
				System.out.printf("PAGE: %2d%48s\n", k34_page, "������� : " + k34_sd.format(k34_cal.getTime()));
				System.out.printf("============================================================\n");
				System.out.printf("%s%5s%7s%6s%6s%6s%6s\n","��ȣ", "�̸�", "����", "����", "����", "����", "���");
				System.out.printf("============================================================\n");
				
			}
			
			System.out.printf("%03d%8s%7d%8d%8d%8d%8d\n",
					k34_i + 1, k34_inpuData[k34_i].k34_name,  k34_inpuData[k34_i].k34_kor,  k34_inpuData[k34_i].k34_eng,  k34_inpuData[k34_i].k34_mat, k34_inpuData[k34_i].k34_sum(), (int)k34_inpuData[k34_i].k34_ave());
			
			k34_sum[0] += k34_inpuData[k34_i].k34_kor;// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[5] += k34_inpuData[k34_i].k34_kor;// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[1] += k34_inpuData[k34_i].k34_eng;// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[6] += k34_inpuData[k34_i].k34_eng;// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[2] += k34_inpuData[k34_i].k34_mat;// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[7] += k34_inpuData[k34_i].k34_mat;// ���� ������ ���� ������ �հ踦 �˱� ���� ���� ������ ���Ѵ�.
			k34_sum[3] += k34_inpuData[k34_i].k34_sum();// ���� ������ ������ �հ踦 �˱� ���� ������ ���Ѵ�.
			k34_sum[8] += k34_inpuData[k34_i].k34_sum();// ���� ������ ������ �հ踦 �˱� ���� ������ ���Ѵ�.
			k34_sum[4] += k34_inpuData[k34_i].k34_ave();// ���� ������ ����� �հ踦 �˱� ���� ����� ���Ѵ�.
			k34_sum[9] += k34_inpuData[k34_i].k34_ave();// ���� ������ ����� �հ踦 �˱� ���� ����� ���Ѵ�.
			
			
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
			
			if ((k34_i + 1) == k34_person) {// ���� k34_i + 1�� k34_person�� ������ (������ �ϴܺ� ���)
				k34_avg[0] = k34_sum[0] / (k34_person % k34_pagePerson);// ���� ������ ����� k34_person�� k34_pagePerson���� ���� �������� ������.
				k34_avg[1] = k34_sum[1] / (k34_person % k34_pagePerson);// ���� ������ ����� k34_person�� k34_pagePerson���� ���� �������� ������.
				k34_avg[2] = k34_sum[2] / (k34_person % k34_pagePerson);// ���� ������ ����� k34_person�� k34_pagePerson���� ���� �������� ������.
				k34_avg[3] = k34_sum[3] / (k34_person % k34_pagePerson);// ������ ����� k34_person�� k34_pagePerson���� ���� �������� ������.
				k34_avg[4] = k34_sum[4] / (k34_person % k34_pagePerson);// ����� ����� k34_person�� k34_pagePerson���� ���� �������� ������.
				
				k34_avg[5] = k34_sum[5] / k34_person;// ���� ������ ���� ����� k34_person���� ������.
				k34_avg[6] = k34_sum[6] / k34_person;// ���� ������ ���� ����� k34_person���� ������.
				k34_avg[7] = k34_sum[7] / k34_person;// ���� ������ ���� ����� k34_person���� ������.
				k34_avg[8] = k34_sum[8] / k34_person;// ������ ���� ����� k34_person���� ������.
				k34_avg[9] = k34_sum[9] / k34_person;// ����� ���� ����� k34_person���� ������.
				
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
}

