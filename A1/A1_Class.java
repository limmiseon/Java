package A1;

import java.util.Scanner;

public class A1_Class {
	int[] storeCourse = new int[10];
	int index = 0;

	public A1_Class() {
	}

	public void printMenu() {

		System.out.println("# Menu");
		System.out.println("1. Course List");
		System.out.println("2. My Course");
		System.out.print("-> ");

		Scanner scanner = new Scanner(System.in);
		int choose;
		choose = scanner.nextInt();
		if (choose == 1) {
			printCourseList();
		} else if (choose == 2) {
			myCourse();
		} else {
			System.out.println("Worng number! please select the number agian.");
			printMenu();
		}
	}

	public void printCourseList() {
		int choose = 0;
		System.out.println("# Course List");
		System.out.println("1. Korean");
		System.out.println("2. Math");
		System.out.println("3. English");
		System.out.println("4. Social Studies");
		System.out.println("5. Science");
		System.out.println("0. Back to Main");
		System.out.print("-> ");

		Scanner scanner = new Scanner(System.in);
		choose = scanner.nextInt();

		if (choose == 0) {
			printMenu();
			return;
		} else if (choose < 6 && choose > 0) {
			this.storeCourse[index] = choose;
			chooseCourse(choose);
			index++;
			printCourseList();
		} else {
			System.out.println("Worng number! please select the number agian.");
			printCourseList();
		}

	}

	public void chooseCourse(int storeCourse) {
		String num1 = "Korean";
		String num2 = "Math";
		String num3 = "English";
		String num4 = "Social Studies";
		String num5 = "Science";

		if (storeCourse == 1) {
			System.out.println("\"" + num1 + "\" is registered.");
		} else if (storeCourse == 2) {
			System.out.println("\"" + num2 + "\" is registered.");
		} else if (storeCourse == 3) {
			System.out.println("\"" + num3 + "\" is registered.");
		} else if (storeCourse == 4) {
			System.out.println("\"" + num4 + "\" is registered.");
		} else if (storeCourse == 5) {
			System.out.println("\"" + num5 + "\" is registered.");
		} else if (storeCourse == 0) {
			printMenu();
		} else {
			System.out.println("Wrong number");
		}
	}

	public void myCourse() {
		String courseName = "";
		System.out.println("# My Course");

		for (int i = 0, j = 1; i <= index; i++, j++) {
			if (storeCourse[i] == 1) {
				courseName = "Korean";
			} else if (storeCourse[i] == 2) {
				courseName = "Math";
			} else if (storeCourse[i] == 3) {
				courseName = "English";
			} else if (storeCourse[i] == 4) {
				courseName = "Social Studies";
			} else if (storeCourse[i] == 5) {
				courseName = "Science";
			} else if (storeCourse[0] == 0) {
				System.out.println("You didn't choose the course");
				break;
			} else {
				continue;
			}

			System.out.println(j + ". " + courseName);

			if (storeCourse[i] == 0) {
				break;
			}
		}
		System.out.println("- End -");

		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();

		if (choose == 0) {
			this.index = 0;
			printMenu();
		} else {
			System.out.println("Close the program.");
			return;
		}
	}
}
