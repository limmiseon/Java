package A1;

import java.util.Scanner;

public class A4_006 {

	public static void main(String[] args) {
		printNum ();
		

	}
	
	static void printNum () {
		Scanner scanner = new Scanner(System.in);
		String strNum = scanner.nextLine();
		String[] cutNum = strNum.split(" ");
		
		double inputNum = scanner.nextDouble();
		double min = Double.MAX_VALUE;
		double minus = 0;
		
		for (int j = 0; j <= cutNum.length - 1; j++) {
			cutNum[j] - Math.abs(inputNum);
			if(minus != 0 && minus < min) {
				min = minus;
			}
		}
		System.out.println(min);
	}

}
