import java.util.Scanner;

public class P1_008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Input two sets of numbers");
			String numarr1 = scanner.nextLine();
			String numarr2 = scanner.nextLine();
			String[] arr1 = numarr1.split(" ");
			String[] arr2 = numarr2.split(" ");

			duplicate(arr1, arr2);
		}
	}

	static void duplicate(String[] arr1, String[] arr2) {
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (Double.parseDouble(arr1[i]) == Double.parseDouble(arr2[j])) {
					System.out.print(Double.parseDouble(arr1[i]) + " ");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.print("There are no numbers to duplicate.");
		}
		System.out.print("\n\n");
	}
}
