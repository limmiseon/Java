package softwarecoding004;

public class SoftwareCoding004_practice011 {

	public static void main(String[] args) {
		//���� �б� ���
		int kopo34_iNumVal = 1001034567;// int���� kopo34_iNumVal�� �����ϰ� 1001034567�� �ʱ�ȭ�Ѵ�.(�ѱ۷� ���� ����)
		String kopo34_sNumVal = String.valueOf(kopo34_iNumVal);// String ���� kopo34_sNumVal�� �����ϰ� kopo34_iNumVal�� String���� �� ��ȯ�� ������ �ʱ�ȭ�Ѵ�.
		String kopo34_sNumVoice = "";// String���� kopo34_sNumVoice�� �����ϰ� ""�� �ʱ�ȭ�Ѵ�. (���������� ���� -> �ѱ۷� ���� ����)
		System.out.printf("==> %s [%d�ڸ�]\n", kopo34_sNumVal, kopo34_sNumVal.length());// kopo34_sNumVal�� �ڸ����� ����Ʈ�Ѵ�.(= �迭�� ����)
		
		int kopo34_i, kopo34_j;// int���� kopo34_i�� kopo34_j�� �����Ѵ�.
		String[] kopo34_unitS = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };// ���ڸ� �б� ���� string �迭 kopo34_unitS�� �����ϰ� �ʱ�ȭ�Ѵ�.
		String[] kopo34_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };// �ڸ����� �б� ���� string �迭 kopo34_unitX�� �����ϰ� �ʱ�ȭ�Ѵ�.
		
		// ���ʺ��� �Ѱ��� ó��
		kopo34_i = 0;// kopo34_i�� 0���� �ʱ�ȭ�Ѵ�.(���ڸ� �б� ���� �ε����� Ȱ��)
		kopo34_j = kopo34_sNumVal.length() - 1;// kopo34_j�� kopo34_sNumVal �迭�� ���� - 1 �� ������ �ʱ�ȭ�Ѵ�.(�ڸ����� �б� ���� �ε����� Ȱ��)
		
		while (true) {// break������ ���������� ������ ���� �ݺ��ϴ� while���� �ۼ��Ѵ�.
			if (kopo34_i >= kopo34_sNumVal.length()) {// ���� kopo34_i�� �迭�� ���̿� ���ų� Ŀ����
				break;// while���� �������´�.
			}
			
			System.out.printf("%s[%s]",
					kopo34_sNumVal.substring(kopo34_i, kopo34_i + 1),// kopo34_i���� kopo34_i + 1���� �迭�� ���� �ڸ���. ��, kopo34_i���� �ε��� ���� �����´�.
					kopo34_unitS[Integer.parseInt(kopo34_sNumVal.substring(kopo34_i, kopo34_i + 1))]);//�� ���� Integer�� ��ȯ�� ���ڸ� �ѱ۷� �ٲ۴�.
			
			if (kopo34_sNumVal.substring(kopo34_i, kopo34_i + 1).equals("0")) {// ���� �߶� kopo34_sNumVal�� ���� 0�̶��
				if (kopo34_unitX[kopo34_j].equals("��") | kopo34_unitX[kopo34_j].equals("��")) {// �� ���� �ڸ����� "��"�̰ų� "��"�̶��
					kopo34_sNumVoice += "" + kopo34_unitX[kopo34_j];// ���� 0�̱� ������ kopo34_sNumVoice�� �ڸ����� �ٿ��ش�.
				} else {// �ڸ����� "��"�̳� "��"�� �ƴ϶�� �ƹ��͵� ���� �ʴ´�. ("��"�� "��"�� ���ڰ� 0�̾ �ڸ����� �ٿ��ֱ� ����)
					
				}
				
			} else {// ���� �߶� kopo34_sNumVal�� ���� 0�� �ƴ϶��
				kopo34_sNumVoice +=
						kopo34_unitS[Integer.parseInt(kopo34_sNumVal.substring(kopo34_i, kopo34_i + 1))]// kopo34_i���� kopo34_i + 1���� �迭�� ���� �ڸ���. ��, kopo34_i���� �ε��� ���� �����´�.
																									    // �׸��� string�� integer�� ��ȯ�� ���� -> �ѱ۷� ���� ���� ������ kopo34_sNumVoice�� �߰��Ѵ�.
						+ kopo34_unitX[kopo34_j]; // �ڸ����� ���� ���� ������ kopo34_sNumVoice�� �߰��Ѵ�.
			}
			
			kopo34_i ++;// kopo34_i�� 1�� ���Ѵ�.(������)
			kopo34_j --;// kopo34_j�� 1�� ����.(������)
		}
		
		System.out.printf("\n %s[%s]\n", kopo34_sNumVal, kopo34_sNumVoice);
	}
}
