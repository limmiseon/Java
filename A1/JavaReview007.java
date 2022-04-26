package JavaReview;

import java.util.Scanner;

public class JavaReview007 {

	public static void main(String[] args) {
		// comparing the velocities in different units
		Scanner sc = new Scanner(System.in);
		String[] unit = { "m/s", "km/h", "m/ms" };
		System.out.println("input the three values");
		double[] inputNum = { 0, 0, 0 };
		inputNum[0] = sc.nextDouble();
		inputNum[1] = sc.nextDouble();
		inputNum[2] = sc.nextDouble();

		double[] ms = { 0, 0, 0 };
		ms[0] = inputNum[0];
		ms[1] = (inputNum[1] * 1000) / 3600;
		ms[2] = inputNum[2] * 1000;

		int index = 0;
		double max = ms[0];
		for (int i = 0; i < 3; i++) {
			if (ms[i] > max) {
				max = ms[i];
				index = i;
			}
		}

		if (index < 2) {
			System.out.println((int) inputNum[index] + unit[index]);
		} else {
			System.out.println(inputNum[index] + unit[index]);
		}
	}
}
