package JavaReview;

import java.util.Scanner;

public class JavaReview006 {

	public static void main(String[] args) {
		// comparing the two strings
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("input the two strings");
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();

			char[] str1Arr = str1.toCharArray();
			char[] str2Arr = str2.toCharArray();

			int correct = 0;
			for (int i = 0; i < str1Arr.length; i++) {
				for (int j = 0; j < str1Arr.length; j++) {
					if (str1Arr[i] == str2Arr[j]) {
						correct++;
						break;
					}
				}
			}

			if (correct == str1Arr.length) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			System.out.println();
		}
	}
}
