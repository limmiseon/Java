package softwarecoding004;

public class SoftwareCoding004_practice006 {

	public static void main(String[] args) {
		// 비정형비교2 (달력 출력)
		for (int kopo34_i = 1; kopo34_i < 13; kopo34_i++) {
			System.out.printf("%d월 => ", kopo34_i);
			for (int kopo34_j = 1; kopo34_j < 32; kopo34_j++) {
				System.out.printf("%d,", kopo34_j);
				
				if (kopo34_i == 4 | kopo34_i == 6 | kopo34_i == 7 | kopo34_i == 9 | kopo34_i == 11) {
					if (kopo34_j == 30) {
						break;
					}
				}
				
				if (kopo34_i == 2) {
					if (kopo34_j == 28) {
						break;
					}
				}
			}
			System.out.print("\n");
		}
	}
}
