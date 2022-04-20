package softwarecoding006;

public class SoftwareCoding006_practice007_TranscriptClass {
		
	public void transcript(int k34_a, int k34_b, int k34_c) {// 메소드 transcript를 정의한다.
														     // 매개변수의 갯수 : 3개
			int k34_sum = k34_a + k34_b + k34_c;// 매개변수들의 합을 구한다.
			double k34_avg = k34_sum / 3;// 매개변수들의 평균을 구한다.
			System.out.printf("3월 성적표\n");
			System.out.printf("============================================================\n");
			System.out.printf("%s%7s%5s%5s%5s%5s\n", "이름", "국어", "영어", "수학", "총점", "평균");
			System.out.printf("============================================================\n");
			System.out.printf("폴리융%7d%7d%7d%7d%7.0f\n", k34_a, k34_b, k34_c, k34_sum, k34_avg);
		}
		
		public void transcript(int k34_a, int k34_b, int k34_c, int k34_d) {// 메소드 transcript를 오버로딩한다.
																			// 매개변수의 갯수 : 4개
			int k34_sum = k34_a + k34_b + k34_c + k34_d;// 매개변수들의 합을 구한다.
			double k34_avg = k34_sum / 4;// 매개변수들의 평균을 구한다.
			System.out.printf("4월 성적표\n");
			System.out.printf("============================================================\n");
			System.out.printf("%s%7s%5s%5s%5s%5s%5s\n", "이름", "국어", "영어", "수학", "과학", "총점", "평균");
			System.out.printf("============================================================\n");
			System.out.printf("폴리융%7d%7d%7d%7d%7d%7.0f\n", k34_a, k34_b, k34_c, k34_d, k34_sum, k34_avg);
		}
		
		public void transcript(int k34_a, int k34_b, int k34_c, int k34_d, int k34_e) {// 메소드 transcript를 오버로딩한다.
																					   // 매개변수의 갯수 : 5개
			int k34_sum = k34_a + k34_b + k34_c + k34_d + k34_e;// 매개변수들의 합을 구한다.
			double k34_avg = k34_sum / 5;// 매개변수들의 평균을 구한다.
			System.out.printf("5월 성적표\n");
			System.out.printf("============================================================\n");
			System.out.printf("%s%7s%5s%5s%5s%5s%5s%5s\n", "이름", "국어", "영어", "수학", "과학", "사회", "총점", "평균");
			System.out.printf("============================================================\n");
			System.out.printf("폴리융%7d%7d%7d%7d%7d%7d%7.0f\n", k34_a, k34_b, k34_c, k34_d, k34_d, k34_sum, k34_avg);
		}
}
