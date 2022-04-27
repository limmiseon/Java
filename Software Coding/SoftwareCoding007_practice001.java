package softwarecoding007;

public class SoftwareCoding007_practice001 {

	public static void main(String[] args) {
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ�abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ��ѱ�aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword("�ѱ�aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword("�ѱ��ѱ�aa", 15));
		System.out.printf("�ѱ��� [%d]��\n", HanCount("�ѱ��ѱ�aa"));
	}
	
	public static String HanBlankForeword(String k34_str, int k34_num) {// ���ڿ��� ��ȯ�ϴ� HanBlankForeword �޼ҵ带 �����Ѵ�.
		String k34_return = "";// String���� k34_return�� �����ϰ� ���ڿ� �ȿ� �ƹ��͵� ���� �ʴ´�.
		byte[] strByte = k34_str.getBytes();// getByte�� �̿��� ���ڿ��� ����Ʈ ���� ���Ѵ�.
		for (int k34_i = 0; k34_i < (k34_num - k34_str.getBytes().length); k34_i++) {// �տ� ������ �߰��ϱ� ���� �ݺ���
			k34_return += " ";//������ �߰��Ѵ�.
		}
		return k34_return + k34_str;// ������ �տ� �߰������Ƿ� ������ �κп� �Ű������� ���� ���ڿ��� �߰��� ��ȯ�Ѵ�.
	}
	
	public static String HanBlankBackword(String k34_str, int k34_num) {// ���ڿ��� ��ȯ�ϴ� HanBlankBackword �޼ҵ带 �����Ѵ�.
		String k34_return = "";// String���� k34_return�� �����ϰ� ���ڿ� �ȿ� �ƹ��͵� ���� �ʴ´�.
		byte[] strByte = k34_str.getBytes();// getByte�� �̿��� ���ڿ��� ����Ʈ ���� ���Ѵ�.
		for (int k34_i = 0; k34_i < (k34_num - k34_str.getBytes().length); k34_i++) {// �ڿ� ������ �߰��ϱ� ���� �ݺ���
			k34_return += " ";//������ �߰��Ѵ�.
		}
		return k34_str + k34_return;// �Ű������� ���� ���ڿ� �ڿ� �ʿ��Ѹ�ŭ ������ �ٿ����Ƿ� �״�� ��ȯ�Ѵ�.
	}
	
	public static int HanCount(String k34_str) {// ���ڿ����� �ѱ��� ������ ���� �޼ҵ�
		byte[] strByte = k34_str.getBytes();// getByte�� �̿��� ���ڿ��� ����Ʈ ���� ���Ѵ�.
		return k34_str.getBytes().length - k34_str.length();// ����Ʈ �� - ���ڿ��� ���� = �ѱ��� �����̴�.
	}
}
