package JavaReview;

import java.util.Scanner;

public class JavaReview009 {

	public static void main(String[] args) {
		// Calculating ages in International age and in Korean age
		Scanner sc = new Scanner(System.in);
		System.out.println("Current Date :");
		String today = sc.nextLine();
		System.out.println("Birthday :");
		String birthday = sc.nextLine();

		int KoreanAge = 0;
		int Age = 0;

		int todayYear = Integer.parseInt(today.substring(0, 4));
		int todayMonth = Integer.parseInt(today.substring(4, 6));
		int todayDay = Integer.parseInt(today.substring(6, 8));

		int birthdayYear = Integer.parseInt(birthday.substring(0, 4));
		int birthdayMonth = Integer.parseInt(birthday.substring(4, 6));
		int birthdayDay = Integer.parseInt(birthday.substring(6, 8));

		KoreanAge = (todayYear - birthdayYear) + 1;
		Age = todayYear - birthdayYear;

		if (todayMonth < birthdayMonth) { // Check if "month" is past
			Age--;
		} else if (todayMonth == birthdayMonth) { // If "month" is the same, check if "day" has passed
			if (todayDay < birthdayDay) {
				Age--;
			}
		}

		System.out.println(KoreanAge + " years old in Korean age");
		System.out.println(Age + " years old in International age");
	}
}
