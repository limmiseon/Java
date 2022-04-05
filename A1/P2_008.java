import java.util.Scanner;

public class P2_008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Input a string");
			String inputStr = scanner.next();
			char[] str = inputStr.toCharArray();
			middle(str);
		}

	}

	static void middle(char[] str) {
		if(str.length % 2 != 0) {
			int printNum = (str.length / 2);
			System.out.print(str[printNum]);
		}
		else {
			int printNum1 = (str.length / 2) - 1;
			int printNum2 = (str.length / 2);
			System.out.print(str[printNum1]);
			System.out.print(str[printNum2]);
		}
		System.out.print("\n\n");
	}
}
