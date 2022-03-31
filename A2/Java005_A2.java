import java.util.Scanner;

public class Java005_A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputN = sc.nextInt();
		int sum = 0;
		double mean = 0, median = 0;
		for(int i = inputN; i > 0; i--) {
			sum += i;
			System.out.println(i);
		}
		
		mean = ((double) sum / inputN);
		if (inputN % 2 == 0) {
			median = (double) (inputN / 2) + 0.5;
		} else {
			median = (double) (inputN / 2) + 1;
		}
		System.out.println("Mean : " + mean + ", Median : " + median);

	}

}
