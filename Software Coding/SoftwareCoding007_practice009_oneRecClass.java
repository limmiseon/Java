package softwarecoding007;

public class SoftwareCoding007_practice009_oneRecClass{
	
	int k34_studentId;// int �ν��Ͻ��� ���� (�й��� ������ ����)
	String k34_name;// String �ν��Ͻ��� ���� (�̸��� ������ ����)
	int k34_kor;// int �ν��Ͻ��� ���� (���� ������ ������ ����)
	int k34_eng;// int �ν��Ͻ��� ���� (���� ������ ������ ����)
	int k34_mat;// int �ν��Ͻ��� ���� (���� ������ ������ ����)
	
	SoftwareCoding007_practice009_oneRecClass(int k34_studentId, String k34_name, int k34_kor, int k34_eng, int k34_mat) {// ������ ȣ�� �� 4���� �Ű������� �ִ´�.
		this.k34_studentId = k34_studentId;// this�� �ٿ� �ش� Ŭ������ k34_studentId �ν��Ͻ� ���� �Ű������� ���� k34_studentId ���� �����Ѵ�.
		this.k34_name = k34_name;// this�� �ٿ� �ش� Ŭ������ k34_name �ν��Ͻ� ���� �Ű������� ���� k34_name ���� �����Ѵ�.
		this.k34_kor = k34_kor;// this�� �ٿ� �ش� Ŭ������ k34_kor �ν��Ͻ� ���� �Ű������� ���� k34_kor ���� �����Ѵ�.
		this.k34_eng = k34_eng;// this�� �ٿ� �ش� Ŭ������ k34_eng �ν��Ͻ� ���� �Ű������� ���� k34_eng ���� �����Ѵ�.
		this.k34_mat = k34_mat;// this�� �ٿ� �ش� Ŭ������ k34_mat �ν��Ͻ� ���� �Ű������� ���� k34_mat ���� �����Ѵ�.
	}
	
	public int k34_studentId() {// ��ȯ���� int ���� k34_studentId �޼ҵ� ����
		return this.k34_studentId;
	}
	
	public String k34_name() {// ��ȯ���� String ���� k34_name �޼ҵ� ����
		return this.k34_name;
	}
	
	public int k34_kor() {// ��ȯ���� int ���� k34_kor �޼ҵ� ����
		return this.k34_kor;
	}
	
	public int k34_eng() {// ��ȯ���� int ���� k34_eng �޼ҵ� ����
		return this.k34_eng;
	}
	
	public int k34_mat() {// ��ȯ���� int ���� k34_mat �޼ҵ� ����
		return this.k34_mat;
	}
	
	public int k34_sum() {// ��ȯ���� int ���� k34_sum �޼ҵ� ����
		return this.k34_kor + this.k34_eng + this.k34_mat;
	}
	
	public double k34_ave() {// ��ȯ���� double ���� k34_ave �޼ҵ� ����
		return this.k34_sum() / 3.0;
	}
}
