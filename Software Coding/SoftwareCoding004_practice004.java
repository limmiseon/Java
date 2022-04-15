package softwarecoding004;

public class SoftwareCoding004_practice004 {

	public static void main(String[] args) {
		// 범위를 주어서 찾기
		int kopo34_val;
		for (int kopo34_i = 0; kopo34_i < 300; kopo34_i++) {
			kopo34_val = 5 * kopo34_i;
			if (kopo34_val >= 0 && kopo34_val < 10) {
				System.out.printf("일 %d\n", kopo34_val);
			} else if (kopo34_val >= 10 && kopo34_val < 100) {
				System.out.printf("십 %d\n", kopo34_val);
			} else if (kopo34_val >= 100 && kopo34_val < 1000) {
				System.out.printf("백 %d\n", kopo34_val);
			} else {
				System.out.printf("천 %d\n", kopo34_val);
			}
		}
	}
}
