package JavaReview;

import java.util.Scanner;

public class JavaReview008 {

	public static void main(String[] args) {
		// Drawing a line vertically or horizontally
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("input 0s or 1s -> size : 4 x 3");
			String[] inputNum = new String[3];
			inputNum[0] = sc.nextLine();
			inputNum[1] = sc.nextLine();
			inputNum[2] = sc.nextLine();
		
			int cnt = 0;
			for (int i = 0; i < inputNum.length; i++) {
				cnt = 0;
				// All numbers are zero
				if (Integer.parseInt(inputNum[i]) == 0) {
					System.out.println("Pass");
					break;
				}
				
				for (int j = 0; j < 4; j++) {
					if (inputNum[i].substring(j, j+1).equals("0")) {
						cnt++;
						continue;
					} else {
						break;
					}
				}
				
				if (cnt == inputNum.length) {
					System.out.println("Pass");
					break;
				}
				if (i == inputNum.length - 1) {
					System.out.println("Fail");
				}
			}
		}
	}
}
