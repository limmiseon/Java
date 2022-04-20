package softwarecoding006;

public class SoftwareCoding006_practice012_Elevator3Main {
	
	public static void main(String[] args) {
		// 메소드 호출을 위해 SoftwareCoding006_practice012_Elevator3Class 클래스의 객체를 생성한다.
		SoftwareCoding006_practice012_Elevator3Class k34_elev3 = new SoftwareCoding006_practice012_Elevator3Class();
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_up 메소드를 10번 호출하기 위한 반복문
			k34_elev3.k34_up();
			System.out.printf("MSD k34_elev3[%s]\n", k34_elev3.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_down 메소드를 10번 호출하기 위한 반복문
			k34_elev3.k34_down();
			System.out.printf("MSD k34_elev3[%s]\n", k34_elev3.k34_help);
		}
		
		k34_elev3.repair();// repair 메소드를 호출한다.
		System.out.printf("MSD k34_elev3[%s]\n", k34_elev3.k34_help);
	}
}
