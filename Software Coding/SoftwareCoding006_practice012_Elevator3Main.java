package softwarecoding006;

public class SoftwareCoding006_practice012_Elevator3Main {
	
	public static void main(String[] args) {
		// �޼ҵ� ȣ���� ���� SoftwareCoding006_practice012_Elevator3Class Ŭ������ ��ü�� �����Ѵ�.
		SoftwareCoding006_practice012_Elevator3Class k34_elev3 = new SoftwareCoding006_practice012_Elevator3Class();
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_up �޼ҵ带 10�� ȣ���ϱ� ���� �ݺ���
			k34_elev3.k34_up();
			System.out.printf("MSD k34_elev3[%s]\n", k34_elev3.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_down �޼ҵ带 10�� ȣ���ϱ� ���� �ݺ���
			k34_elev3.k34_down();
			System.out.printf("MSD k34_elev3[%s]\n", k34_elev3.k34_help);
		}
		
		k34_elev3.repair();// repair �޼ҵ带 ȣ���Ѵ�.
		System.out.printf("MSD k34_elev3[%s]\n", k34_elev3.k34_help);
	}
}
