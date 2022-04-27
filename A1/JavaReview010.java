package JavaReview;

public class JavaReview010 {

	public static void main(String[] args) {
		// Vedic Mathematics 1
		int num1 = 88;
		int num2 = 93;
		int minusNum1 = 100 - num1;
		int minusNum2 = 100 - num2;
		int plusMinusNum = minusNum1 + minusNum2;

		System.out.println(num1 + "          X          " + num2 + " = " + (num1 * num2));
		System.out.println();
		System.out.println("100-" + num1 + "             " + "100-" + num2);
		System.out.println(minusNum1 + "          +          " + minusNum2 + "     = " + (minusNum1 + minusNum2));
		System.out.println(minusNum1 + "          X          " + minusNum2 + "     = " + (minusNum1 * minusNum2));
		System.out.println();
		System.out.println("First two digits : 100 - " + plusMinusNum + " = " + (100 - plusMinusNum));
		System.out.println("Last two digits : " + (minusNum1 * minusNum2));
		System.out.println("Result : " + num1 * num2);
	}
}
