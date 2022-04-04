import java.util.Scanner;

public class A2_007 {

	public static void main(String[] args) {
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		Scanner scanner = new Scanner(System.in);
		int inputN = scanner.nextInt();

		for (int i = 0; i < numbers.length; i++) {
			int compare = numbers[i];
			while (compare > 0) {
				if (compare % 10 == inputN) {
					System.out.print(numbers[i] + " ");
				}
				compare /= 10;
			}
		}
	}
}
