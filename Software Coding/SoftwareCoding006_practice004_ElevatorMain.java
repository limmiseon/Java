package softwarecoding006;

public class SoftwareCoding006_practice004_ElevatorMain {
	private static int k34_inVal;// Ŭ���� �� �������� k34_iStatic�� �����Ѵ�. (�ڷ��� �տ� private�� ���̸� �ش� Ŭ���� �������� �� �� �ִ�.)
	
	public static void k34_up() {// k34_up �޼ҵ带 �����Ѵ�.
		k34_inVal++;// k34_inVal�� 1�� ���Ѵ�.
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", k34_inVal);
	}
	
	public static void main(String[] args) {
		k34_inVal = 0;// �ڱ� Ŭ���� ���� ���� ���
		SoftwareCoding006_practice004_ElevatorClass k34_elev;// Ŭ������ �޾� ��ü�� �����.
		k34_elev = new SoftwareCoding006_practice004_ElevatorClass();// �ν��Ͻ��� �����Ͽ� ��ü�� �����Ѵ�.
		
		k34_up();// ���� Ŭ������ �� k34_up �޼ҵ带 ȣ���Ѵ�.
		for (int k34_i = 0; k34_i < 10; k34_i++) {// 10�� ���� �ݺ���
			k34_elev.k34_up();// elev Ŭ������ k34_up �޼ҵ带 ȣ���Ѵ�.
			System.out.printf("MSD[%s]\n", k34_elev.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// 10�� ���� �ݺ���
			k34_elev.k34_down();// elev Ŭ������ k34_down �޼ҵ带 ȣ���Ѵ�.
			System.out.printf("MSD[%s]\n", k34_elev.k34_help);
		}
	}
}
