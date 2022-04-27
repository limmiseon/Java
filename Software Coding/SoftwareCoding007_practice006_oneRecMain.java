package softwarecoding007;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SoftwareCoding007_practice006_oneRecMain {
	
	public static void main(String[] args) {
		
		int k34_person = 5;// 이 값을 주는 만큼 저장소가 생성된다.
		
		SoftwareCoding007_practice006_oneRecClass[] k34_inpuData= new SoftwareCoding007_practice006_oneRecClass[k34_person];// 클래스 형태의 배열이 생성된다.
		k34_inpuData[0] = new SoftwareCoding007_practice006_oneRecClass("홍길01", 100, 100, 90);// 각 배열마다 클래스 인스턴스를 생성한다.
		k34_inpuData[1] = new SoftwareCoding007_practice006_oneRecClass("홍길02", 90, 90, 90);// 각 배열마다 클래스 인스턴스를 생성한다.
		k34_inpuData[2] = new SoftwareCoding007_practice006_oneRecClass("홍길03", 80, 70, 90);// 각 배열마다 클래스 인스턴스를 생성한다.
		k34_inpuData[3] = new SoftwareCoding007_practice006_oneRecClass("홍길04", 70, 60, 90);// 각 배열마다 클래스 인스턴스를 생성한다.
		k34_inpuData[4] = new SoftwareCoding007_practice006_oneRecClass("홍길05", 60, 100, 90);// 각 배열마다 클래스 인스턴스를 생성한다.
		
		Calendar k34_cal = Calendar.getInstance();// Calendar 클래스를 사용하기 위해 객체를 생성한다.
		k34_cal.setTime(new Date());// 현재 날짜를 구한다.
		SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY.MM.dd HH:mm");// 현재 시간을 양식대로 출력하기 위해 SimpleDateFormat클래스의 객체를 생성하고 양식을 지정한다.
		
		int k34_pagePerson = 3;
		int k34_page = 0; // 페이지를 표시하기 위한 변수
		// 배열 index 0 ~ 4까지는 현재 페이지 , 5 ~ 9 까지는 누적 페이지
		int[] k34_sum = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] k34_avg = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		for (int k34_i = 0; k34_i < k34_inpuData.length; k34_i++) {// 입력 수 만큼 목록을 출력하기 위한 반복문
			if ((k34_i == 0) || k34_i % k34_pagePerson == 0) {// 만약 k34_i가 0이거나 k34_pagePerson의 배수이면 (헤더 출력)
				k34_page++;// 페이지에 1을 더한다.
				System.out.printf("%25s", "성적집계표\n");
				System.out.printf("PAGE: %2d%48s\n", k34_page, "출력일자 : " + k34_sd.format(k34_cal.getTime()));
				System.out.printf("============================================================\n");
				System.out.printf("%s%5s%7s%6s%6s%6s%6s\n","번호", "이름", "국어", "영어", "수학", "총점", "평균");
				System.out.printf("============================================================\n");
				
			}
			
			System.out.printf("%03d%8s%7d%8d%8d%8d%8d\n",
					k34_i + 1, k34_inpuData[k34_i].k34_name,  k34_inpuData[k34_i].k34_kor,  k34_inpuData[k34_i].k34_eng,  k34_inpuData[k34_i].k34_mat, k34_inpuData[k34_i].k34_sum(), (int)k34_inpuData[k34_i].k34_ave());
			
			k34_sum[0] += k34_inpuData[k34_i].k34_kor;// 현재 페이지 국어 점수의 합계를 알기 위해 국어 점수를 더한다.
			k34_sum[5] += k34_inpuData[k34_i].k34_kor;// 누적 페이지 국어 점수의 합계를 알기 위해 국어 점수를 더한다.
			k34_sum[1] += k34_inpuData[k34_i].k34_eng;// 현재 페이지 영어 점수의 합계를 알기 위해 영어 점수를 더한다.
			k34_sum[6] += k34_inpuData[k34_i].k34_eng;// 누적 페이지 영어 점수의 합계를 알기 위해 영어 점수를 더한다.
			k34_sum[2] += k34_inpuData[k34_i].k34_mat;// 현재 페이지 수학 점수의 합계를 알기 위해 수학 점수를 더한다.
			k34_sum[7] += k34_inpuData[k34_i].k34_mat;// 누적 페이지 수학 점수의 합계를 알기 위해 수학 점수를 더한다.
			k34_sum[3] += k34_inpuData[k34_i].k34_sum();// 현재 페이지 총점의 합계를 알기 위해 총점을 더한다.
			k34_sum[8] += k34_inpuData[k34_i].k34_sum();// 누적 페이지 총점의 합계를 알기 위해 총점을 더한다.
			k34_sum[4] += k34_inpuData[k34_i].k34_ave();// 현재 페이지 평균의 합계를 알기 위해 평균을 더한다.
			k34_sum[9] += k34_inpuData[k34_i].k34_ave();// 누적 페이지 평균의 합계를 알기 위해 평균을 더한다.
			
			
			if ((k34_i + 1) % k34_pagePerson == 0) {// 만약 k34_i + 1이 k34_pagePerson의 배수이면 (하단부 출력)
				k34_avg[0] = k34_sum[0] / k34_pagePerson;// 현재 페이지 국어 점수의 합계를 k34_pagePerson으로 나눈다.
				k34_avg[1] = k34_sum[1] / k34_pagePerson;// 현재 페이지 영어 점수의 합계를 k34_pagePerson으로 나눈다.
				k34_avg[2] = k34_sum[2] / k34_pagePerson;// 현재 페이지 수학 점수의 합계를 k34_pagePerson으로 나눈다.
				k34_avg[3] = k34_sum[3] / k34_pagePerson;// 현재 페이지 총점의 합계를 k34_pagePerson으로 나눈다.
				k34_avg[4] = k34_sum[4] / k34_pagePerson;// 현재 페이지 평균의 합계를 k34_pagePerson으로 나눈다.
				
				k34_avg[5] = k34_sum[5] / (k34_i + 1);// 국어 점수의 누적 합계를 (k34_i + 1)로 나눈다.
				k34_avg[6] = k34_sum[6] / (k34_i + 1);// 영어 점수의 누적 합계를 (k34_i + 1)로 나눈다.
				k34_avg[7] = k34_sum[7] / (k34_i + 1);// 수학 점수의 누적 합계를 (k34_i + 1)로 나눈다.
				k34_avg[8] = k34_sum[8] / (k34_i + 1);// 총점의 누적 합계를 (k34_i + 1)로 나눈다.
				k34_avg[9] = k34_sum[9] / (k34_i + 1);// 평균의 누적 합계를 (k34_i + 1)로 나눈다.
				
				
				System.out.printf("============================================================\n");
				System.out.printf("현재 페이지\n");
				System.out.printf("합계%16d%8d%8d%8d%8d\n", k34_sum[0], k34_sum[1], k34_sum[2], k34_sum[3], k34_sum[4]);
				System.out.printf("평균%16d%8d%8d%8d%8d\n", k34_avg[0], k34_avg[1], k34_avg[2], k34_avg[3], k34_avg[4]);
				System.out.printf("============================================================\n");
				System.out.printf("누적 페이지\n");
				System.out.printf("합계%16d%8d%8d%8d%8d\n", k34_sum[5], k34_sum[6], k34_sum[7], k34_sum[8], k34_sum[9]);
				System.out.printf("평균%16d%8d%8d%8d%8d\n", k34_avg[5], k34_avg[6], k34_avg[7], k34_avg[8], k34_avg[9]);
				
				k34_sum[0] = 0;// 현재 페이지 국어 점수의 합계에 0을 넣는다.
				k34_sum[1] = 0;// 현재 페이지 영어 점수의 합계에 0을 넣는다.
				k34_sum[2] = 0;// 현재 페이지 수학 점수의 합계에 0을 넣는다.
				k34_sum[3] = 0;// 현재 페이지 총점 점수의 합계에 0을 넣는다.
				k34_sum[4] = 0;// 현재 페이지 평균 점수의 합계에 0을 넣는다.
			}
			
			if ((k34_i + 1) == k34_person) {// 만약 k34_i + 1이 k34_person과 같으면 (마지막 하단부 출력)
				k34_avg[0] = k34_sum[0] / (k34_person % k34_pagePerson);// 국어 점수의 평균을 k34_person을 k34_pagePerson으로 나눈 나머지로 나눈다.
				k34_avg[1] = k34_sum[1] / (k34_person % k34_pagePerson);// 영어 점수의 평균을 k34_person을 k34_pagePerson으로 나눈 나머지로 나눈다.
				k34_avg[2] = k34_sum[2] / (k34_person % k34_pagePerson);// 수학 점수의 평균을 k34_person을 k34_pagePerson으로 나눈 나머지로 나눈다.
				k34_avg[3] = k34_sum[3] / (k34_person % k34_pagePerson);// 총점의 평균을 k34_person을 k34_pagePerson으로 나눈 나머지로 나눈다.
				k34_avg[4] = k34_sum[4] / (k34_person % k34_pagePerson);// 평균의 평균을 k34_person을 k34_pagePerson으로 나눈 나머지로 나눈다.
				
				k34_avg[5] = k34_sum[5] / k34_person;// 국어 점수의 누적 평균을 k34_person으로 나눈다.
				k34_avg[6] = k34_sum[6] / k34_person;// 영어 점수의 누적 평균을 k34_person으로 나눈다.
				k34_avg[7] = k34_sum[7] / k34_person;// 수학 점수의 누적 평균을 k34_person으로 나눈다.
				k34_avg[8] = k34_sum[8] / k34_person;// 총점의 누적 평균을 k34_person으로 나눈다.
				k34_avg[9] = k34_sum[9] / k34_person;// 평균의 누적 평균을 k34_person으로 나눈다.
				
				System.out.printf("============================================================\n");
				System.out.printf("현재 페이지\n");
				System.out.printf("합계%16d%8d%8d%8d%8d\n", k34_sum[0], k34_sum[1], k34_sum[2], k34_sum[3], k34_sum[4]);
				System.out.printf("평균%16d%8d%8d%8d%8d\n", k34_avg[0], k34_avg[1], k34_avg[2], k34_avg[3], k34_avg[4]);
				System.out.printf("============================================================\n");
				System.out.printf("누적 페이지\n");
				System.out.printf("합계%16d%8d%8d%8d%8d\n", k34_sum[5], k34_sum[6], k34_sum[7], k34_sum[8], k34_sum[9]);
				System.out.printf("평균%16d%8d%8d%8d%8d\n", k34_avg[5], k34_avg[6], k34_avg[7], k34_avg[8], k34_avg[9]);
			}
		}
	}
}

