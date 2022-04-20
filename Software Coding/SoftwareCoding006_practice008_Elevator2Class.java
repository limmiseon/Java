package softwarecoding006;

public class SoftwareCoding006_practice008_Elevator2Class {
		int k34_limit_up_floor;// �ֻ��� ��
		int k34_limit_down_floor;// ������ �� 
		int k34_floor;// ���� ��
		String k34_help;
		
		SoftwareCoding006_practice008_Elevator2Class(){
			k34_limit_up_floor = 10;
			k34_limit_down_floor = 0;
			k34_floor = 1;
			System.out.println("���������� �⺻ �ذ��Ϸ�");
		}
		
		// ������ �����ε� (�ִ���, �ּ���, �������� �־ Ŭ������ ������ �� �ֵ��� ��) => ���� ����������
		SoftwareCoding006_practice008_Elevator2Class(int k34_up_floor, int k34_d_floor, int k34_in_floor) {
			k34_limit_up_floor = k34_up_floor;
			k34_limit_down_floor = k34_d_floor;
			k34_floor = k34_in_floor;
			k34_help = "���������� ���� �ذ��Ϸ�";
		}
		
		void k34_up() {// k34_up �޼ҵ� ���� (���������Ͱ� �ö�)
			if (k34_floor == k34_limit_up_floor) {// ���� ���������Ͱ� �ֻ��� ���̶��
				k34_help = "������ �� �Դϴ�.";
			} else {// ���������Ͱ� �ֻ��� ���� �ƴ϶��
				k34_floor++;// �� ���� �ö󰣴�.
				k34_help = String.format("%d���Դϴ�.", k34_floor);
			}
		}
		
		void k34_down() {// k34_down �޼ҵ� ���� (���������Ͱ� ������)
			if (k34_floor == k34_limit_down_floor) {// ���� ���������Ͱ� ������ ���̶��
				k34_help = "ó�� �� �Դϴ�.";
			} else {// ���������Ͱ� ������ ���� �ƴ϶��
				k34_floor--;// �� ���� ��������.
				k34_help = String.format("%d���Դϴ�.", k34_floor);
			}
		}
		
		// �޼ҵ� �����ε� (ó�� �������� �����ϸ� �׸�ŭ �ö󰡵��� ��)
		 void k34_up(int k34_up) { 
			 for (int k34_i = 0; k34_i < k34_up; k34_i++) {
				 this.k34_up(); // this�� ���� ��Ȯ������.
			 
			 }
		 }
		 
		 // �޼ҵ� �����ε� (ó�� �������� �����ϸ� �׸�ŭ ���������� ��) 
		 void k34_down(int k34_down) { 
			 for (int k34_i = 0; k34_i < k34_down; k34_i++)
				 k34_down();
		 }
		
		void msd(String k34_id) {
			System.out.printf("%s => [%s] �ִ��� [%d] �ּ��� [%d] ������[%d]\n",
						 	 k34_id, k34_help, k34_limit_up_floor, k34_limit_down_floor, k34_floor);
		}
}
