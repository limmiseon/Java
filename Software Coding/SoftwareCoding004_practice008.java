package softwarecoding004;

public class SoftwareCoding004_practice008 {

	public static void main(String[] args) {
		// switch, case문 비교 (달력 출력) 적합하지 않은 사례
		for (int kopo34_i = 1; kopo34_i < 13; kopo34_i++) {
			System.out.printf("%d월 => ", kopo34_i);
			LOOP: for (int kopo34_j = 1; kopo34_j < 32; kopo34_j++) {
				System.out.printf("%d,", kopo34_j);
				
				switch (kopo34_i) {
					case 4: case 6: case 7: case 9: case 11:
						if (kopo34_j == 30) {
							break LOOP;
						}
					case 2:
						if (kopo34_j == 28) {
							break LOOP;
						}
				}
			}
			System.out.print("\n");
		}
	}
}
