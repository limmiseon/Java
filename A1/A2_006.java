package A1;

import java.util.Scanner;

public class A2_006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputNum = scanner.nextLine();
		reverse(inputNum);
	}

	static void reverse(String num) {
		for (int i = num.length() - 1; i >= 0; i--) {
			System.out.print(num.charAt(i));
		}
	}
}
