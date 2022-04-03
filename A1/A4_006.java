package A1;

import java.util.Scanner;

public class A4_006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strNum = scanner.nextLine();
		String[] cutNum = strNum.split(" ");
		double[] arr = new double[cutNum.length];

		// String array to double array
		for (int i = 0; i < cutNum.length; i++) {
			arr[i] = Double.parseDouble(cutNum[i]);
		}

		double inputNum = scanner.nextDouble();

		// Finding the Nearest Number
		double distance = Math.abs(arr[0] - inputNum);
		int index = 0;
		for (int k = 1; k < arr.length; k++) {
			double kdistance = Math.abs(arr[k] - inputNum);
			if (kdistance < distance && kdistance != 0) {
				index = k;
				distance = kdistance;
			}
		}
		
		double nearestNumber = arr[index];
		System.out.println(arr[index]);
	}
}
