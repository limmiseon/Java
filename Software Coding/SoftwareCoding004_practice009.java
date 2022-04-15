package softwarecoding004;

public class SoftwareCoding004_practice009 {

	public static void main(String[] args) {
		// Array문 비교 (달력 출력)
		int[] kopo34_LMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int kopo34_i = 1; kopo34_i < 13; kopo34_i++) {
			System.out.printf("%d월 => ", kopo34_i);
			for (int kopo34_j = 1; kopo34_j < 32; kopo34_j++) {
				System.out.printf("%d", kopo34_j);
				if (kopo34_LMD[kopo34_i - 1] == kopo34_j) {
					break;
				}
				System.out.printf(",");
			}
			System.out.print("\n");
		}
	}
}
