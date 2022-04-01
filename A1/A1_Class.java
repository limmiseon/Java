package A1;

import java.util.Scanner;

public class A1_Class {
	int storeCourse;

	public A1_Class() {
	}

	public void printMenu() {
		System.out.println("# Menu");
		System.out.println("1. Course List");
		System.out.println("2. My Course");
		System.out.print("-> ");

		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();

		if (choose == 1) {
			printCourseList();
		} else if (choose == 2) {
			myCourse(storeCourse);
		} else {
			System.out.println("Worng number");
			printMenu();
		}
	}

	public void printCourseList() {
		System.out.println("# Course List");
		System.out.println("1. Korean");
		System.out.println("2. Math");
		System.out.println("3. English");
		System.out.println("4. Social Studies");
		System.out.println("5. Science");
		System.out.println("0. Back to Main");
		System.out.print("-> ");

		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();

		if (choose == 0) {
			printMenu();
			return;
		} else if (choose > 5) {
			System.out.println("Wrong number");
			printCourseList();
			return;
		}

		this.storeCourse = choose;
		chooseCourse(storeCourse);

		printCourseList();
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

	public void myCourse(int storeCourse) {
		this.storeCourse = storeCourse;
		String index;

		System.out.println("# My Course");

		if (storeCourse == 1) {
			index = "Korean";
		} else if (storeCourse == 2) {
			index = "Math";
		} else if (storeCourse == 3) {
			index = "English";
		} else if (storeCourse == 4) {
			index = "Social Studies";
		} else if (storeCourse == 5) {
			index = "Science";
		} else {
			System.out.println("You didn't choose the course");
			return;
		}

		System.out.println("1. " + index);
		System.out.println("- End -");
		
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		
		if(choose == 0) { 
			printMenu();
		} else {
			System.out.println("Wrong number");
			return;
		}
	}
}
