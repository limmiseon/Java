package softwarecoding006;

public class SoftwareCoding006_practice006_CalcMain {
	
	public static void main(String[] args) {
		// Calc Ŭ������ �޼ҵ带 ����ϱ� ���� ��ü�� �����Ѵ�.
		SoftwareCoding006_practice006_CalcClass k34_calc = new SoftwareCoding006_practice006_CalcClass();
		
		System.out.printf("2�� ������ ȣ��� [%d]\n", k34_calc.k34_sum(1, 2));// ���� �޼ҵ� ȣ��
		System.out.printf("3�� ������ ȣ��� [%d]\n", k34_calc.k34_sum(1, 2, 3));// �����ε� �� �޼ҵ� ȣ��
		System.out.printf("4�� ������ ȣ��� [%d]\n", k34_calc.k34_sum(1, 2, 3, 4));// �����ε� �� �޼ҵ� ȣ��
		System.out.printf("������ ������ ȣ��� [%f]\n", k34_calc.k34_sum(1.3, 2.4));// �����ε� �� �޼ҵ� ȣ��
	}
}
