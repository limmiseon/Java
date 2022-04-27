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
	static final int k34_iPerson = 20; // (= 배열의 길이)
	
	static void k34_dataSet() { // 데이터를 만드는 메소드
		for (int k34_i = 0; k34_i < k34_iPerson; k34_i++) {
			String k34_name = String.format("홍길%02d", k34_i);
			int k34_kor = (int) (Math.random() * 100);
			int k34_eng = (int) (Math.random() * 100);
			int k34_mat = (int) (Math.random() * 100);
			// 하나의 OneRec클래스를 생성 후 어레이리스트에 집어넣음
			k34_arrOneRec.add(new SoftwareCoding007_practice009_oneRecClass(k34_i, k34_name, k34_kor, k34_eng, k34_mat));
		}
	}
	static void k34_headerPrint() {// 헤더 인쇄
		System.out.printf("============================================================\n");
		System.out.printf("%s%5s%7s%6s%6s%6s%6s\n","번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.printf("============================================================\n");
	}
	static void k34_itemPrint(int k34_i) {// 내용 인쇄
		SoftwareCoding007_practice009_oneRecClass k34_rec; // oneRec클래스의 객체 생성
		k34_rec = k34_arrOneRec.get(k34_i);// 어레이리스트의 값을 집어넣음
		System.out.printf("%3s%7s%8d%8d%8d%8d   %6.2f\n",
		k34_rec.k34_studentId,  k34_rec.k34_name,  k34_rec.k34_kor, k34_rec.k34_eng, k34_rec.k34_mat, k34_rec.k34_sum(), k34_rec.k34_ave());
		
		k34_sumKor += k34_rec.k34_kor();// 국어 점수 누적 합산
		k34_sumEng += k34_rec.k34_eng();// 영어 점수 누적 합산
		k34_sumMat += k34_rec.k34_mat();// 수학 점수 누적 합산
		k34_sumSum += k34_rec.k34_sum();// 합계 누적 합산
		k34_sumAve += k34_rec.k34_ave();// 평균 누적 합산
	}
	static void k34_tailPrint() { //꼬리 인쇄
		System.out.printf("============================================================\n");
		System.out.printf("국어 합계 %8d 국어 평균 : %6.2f\n", k34_sumKor, k34_sumKor / (double)k34_arrOneRec.size());
		System.out.printf("영어 합계 %8d 영어 평균 : %6.2f\n", k34_sumEng, k34_sumEng / (double)k34_arrOneRec.size());
		System.out.printf("수학 합계 %8d 수학 평균 : %6.2f\n", k34_sumMat, k34_sumMat / (double)k34_arrOneRec.size());
		System.out.printf("============================================================\n");
		System.out.printf("반 평균 합계 %5d  반 평균 : %6.2f\n", k34_sumAve, k34_sumAve / (double)k34_arrOneRec.size());
	}
	public static void main(String[] args) {
		
		k34_dataSet();// 데이터 세팅
		k34_headerPrint();
		for (int k34_i = 0; k34_i < k34_arrOneRec.size(); k34_i++) {// 학생 목록 인쇄
			k34_itemPrint(k34_i);
		}
		k34_tailPrint();
	}
}

