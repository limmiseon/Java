package sec03;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�ӹ̼�";//���ͷ��� ������ ���� ��ü�� �������� ���´�.
		String strVar2 = "�ӹ̼�";
		String strVar3 = new String("�ӹ̼�");//��ü ���� �����ڸ� ����� �ٸ� �������� ���´�.
		
		System.out.println(strVar1 == strVar2);//true
		System.out.println(strVar1 == strVar3);//false
		System.out.println();//����
		System.out.println(strVar1.equals(strVar2));//���ڿ� ��
		System.out.println(strVar1.equals(strVar3));

	}

}
