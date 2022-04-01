package A1;

import java.util.Scanner;

public class A5_Class {
	double convertNum;

	void cmConverter(int a) {
		Scanner scanner = new Scanner(System.in);
		double number = scanner.nextDouble();

		if (a == 2) {
			convertNum = number / 100;
		} else if (a == 3) {
			convertNum = number * 10;
		} else if (a == 4) {
			convertNum = number / 100000;
		} else if (a == 5) {
			convertNum = number / 160934;
		} else {
			System.out.println("Wrong number");
			return;
		}
		System.out.println(convertNum);
	}

	void mConverter(int a) {
		Scanner scanner = new Scanner(System.in);
		double number = scanner.nextDouble();

		if (a == 1) {
			convertNum = number * 100;
		} else if (a == 3) {
			convertNum = number * 1000;
		} else if (a == 4) {
			convertNum = number / 1000;
		} else if (a == 5) {
			convertNum = number / 1609;
		} else {
			System.out.println("Wrong number");
			return;
		}
		System.out.println(convertNum);
	}

	void mmConverter(int a) {
		Scanner scanner = new Scanner(System.in);
		double number = scanner.nextDouble();

		if (a == 1) {
			convertNum = number / 10;
		} else if (a == 2) {
			convertNum = number / 1000;
		} else if (a == 4) {
			convertNum = number / 100000;
		} else if (a == 5) {
			convertNum = number / 1609340;
		} else {
			System.out.println("Wrong number");
			return;
		}
		System.out.println(convertNum);
	}

	void kmConverter(int a) {
		Scanner scanner = new Scanner(System.in);
		double number = scanner.nextDouble();

		if (a == 1) {
			convertNum = number * 100000;
		} else if (a == 2) {
			convertNum = number * 1000;
		} else if (a == 3) {
			convertNum = number * 1000000;
		} else if (a == 5) {
			convertNum = number / 1.609;
		} else {
			System.out.println("Wrong number");
			return;
		}
		System.out.println(convertNum);
	}

	void mileConverter(int a) {
		Scanner scanner = new Scanner(System.in);
		double number = scanner.nextDouble();

		if (a == 1) {
			convertNum = number * 160934;
		} else if (a == 2) {
			convertNum = number * 1609;
		} else if (a == 3) {
			convertNum = number * 1609340;
		} else if (a == 4) {
			convertNum = number * 1.609;
		} else {
			System.out.println("Wrong number");
			return;
		}
		System.out.println(convertNum);
	}
}
