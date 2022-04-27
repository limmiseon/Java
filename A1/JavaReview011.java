package JavaReview;

public class JavaReview011 {

	public static void main(String[] args) {
		// Vedic Mathematics 2
		String strNum1 = "88";
		String strNum2 = "93";
		
		String minusNum1 = Integer.toString(100 - Integer.parseInt(strNum1));
		String minusNum2 = Integer.toString(100 - Integer.parseInt(strNum2));
		
		String plusMinusNum = Integer.toString(Integer.parseInt(minusNum1) + Integer.parseInt(minusNum2));
		String MultiMinusNum = Integer.toString(Integer.parseInt(minusNum1) * Integer.parseInt(minusNum2));
		
		String FirstTwoDigits = Integer.toString(100 - Integer.parseInt(plusMinusNum));
		String LastTwoDigits = Integer.toString(Integer.parseInt(minusNum1) * Integer.parseInt(minusNum2));
		
		System.out.println(strNum1 + "          X          " + strNum2 + " = " + FirstTwoDigits + LastTwoDigits);
		System.out.println();
		System.out.println("100-" + strNum1 + "             " + "100-" + strNum2);
		System.out.println(minusNum1 + "          +          " + minusNum2 + "     = " + plusMinusNum);
		System.out.println(minusNum1 + "          X          " + minusNum2 + "     = " + MultiMinusNum);
		System.out.println();
		System.out.println("First two digits : 100 - " + plusMinusNum + " = " + FirstTwoDigits);
		System.out.println("Last two digits : " + LastTwoDigits);
		System.out.println("Result : " + FirstTwoDigits + LastTwoDigits);
	}
}
