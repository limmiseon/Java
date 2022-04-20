package softwarecoding006;

public class SoftwareCoding006_practice002 {
	static int k34_iStatic;// Ŭ���� �� �������� k34_iStatic�� �����Ѵ�. (�ڷ��� �տ� static�� ���̸� ��������)
	
	public static void k34_add(int k34_i) {// k34_add�޼ҵ带 �����Ѵ�. ���ڷδ� int�� ������ �ް�, ���ϰ��� ����.
		k34_iStatic++;// k34_iStatic�� 1�� ���Ѵ�.
		k34_i++;// ���ڷ� ���� ������ 1�� ���Ѵ�.
		System.out.printf("add�޼ҵ忡��->k34_iStatic=[%d]\n", k34_iStatic);
		System.out.printf("add�޼ҵ忡��->k34_i=[%d]\n", k34_i);
	}
	
	public static int k34_add2(int k34_i) {// k34_add2�޼ҵ带 �����Ѵ�. ���ڷδ� int�� ������ �ް�, ���ϰ��� int���̴�.
		k34_iStatic++;// k34_iStatic�� 1�� ���Ѵ�.
		k34_i++;// ���ڷ� ���� ������ 1�� ���Ѵ�.
		System.out.printf("add2�޼ҵ忡��->k34_iStatic=[%d]\n", k34_iStatic);
		System.out.printf("add2�޼ҵ忡��->k34_i=[%d]\n", k34_i);
		return k34_i;// k34_i���� ��ȯ�Ѵ�.
	}

	public static void main(String[] args) {
		int k34_iMain = 1;// int���� k34_iMain�� �����Ѵ�.
		k34_iStatic = 1;// k34_iStatic�� 1�� �����Ѵ�.
		
		System.out.printf("**************************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k34_iStatic=[%d]\n", k34_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k34_iMain=[%d]\n", k34_iMain);
		System.out.printf("**************************************\n");
		
		k34_add(k34_iMain);// �޼ҵ� k34_add�� ȣ���Ѵ�. ���ڷδ� k34_iMain�� �ִ´�.
		
		System.out.printf("**************************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k34_iStatic=[%d]\n", k34_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k34_iMain=[%d]\n", k34_iMain);// k34_iMain �޼ҵ� �ȿ��� �Ͻ������� 2�� ������ ���� �޾ƿ��� �ʾұ� ������
																			    // ���ο����� �ٽ� 1�� �ƴ�.
		System.out.printf("**************************************\n");
		
		k34_iMain = k34_add2(k34_iMain);// �޼ҵ� k34_add2�� ȣ���� ���� ���� k34_iMain�� �ִ´�. (�̷��� �ؾ� ������ k34_iMain���� ���ο��� �����)
										// �̷������� ���� �����ϰ� �޴� ����� �����ϱ� ����.
		
		System.out.printf("**************************************\n");
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->k34_iStatic=[%d]\n", k34_iStatic);
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->k34_iMain=[%d]\n", k34_iMain);
		System.out.printf("**************************************\n");
	}
}
