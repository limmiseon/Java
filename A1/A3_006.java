package A1;

import java.util.Scanner;

public class A3_006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		reverse(str);
	}

	static void reverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}

