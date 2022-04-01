package A1;

import java.util.Scanner;

public class A5_006 {

	public static void main(String[] args) {
		A5_Class myA5 = new A5_Class();
		converterSelect();
	}
	
	static void converterSelect() {
		Scanner scanner = new Scanner(System.in);
		String units = scanner.nextLine();
		String[] unitsCut = units.split(" ");
		int unitSelect1 = Integer.parseInt(unitsCut[0]);
		int unitSelect2 = Integer.parseInt(unitsCut[1]);
		A5_Class myA5 = new A5_Class();
		
		if(unitSelect1 == 1) {
			myA5.cmConverter(unitSelect2);
		} else if (unitSelect1 == 2) {
			myA5.mConverter(unitSelect2);
		} else if (unitSelect1 == 3) {
			myA5.mmConverter(unitSelect2);
		} else if (unitSelect1 == 4) {
			myA5.kmConverter(unitSelect2);
		} else if (unitSelect1 == 5) {
			myA5.mileConverter(unitSelect2);
		} else {
			System.out.println("Wrong number");
			return;
		} 
	}
}
