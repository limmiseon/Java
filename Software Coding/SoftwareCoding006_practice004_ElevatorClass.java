package softwarecoding006;

public class SoftwareCoding006_practice004_ElevatorClass {
		int k34_limit_up_floor = 10;// �ֻ��� ��
		int k34_limit_down_floor = 0;// ������ �� 
		int k34_floor = 1;// ���� ��
		String k34_help;
		
		void k34_up() {// ���������Ͱ� �ö�
			if (k34_floor == k34_limit_up_floor) {// ���� ���������Ͱ� �ֻ��� ���̶��
				k34_help = "������ �� �Դϴ�.";
			} else {// ���������Ͱ� �ֻ��� ���� �ƴ϶��
				k34_floor++;// �� ���� �ö󰣴�.
				k34_help = String.format("%d���Դϴ�.", k34_floor);
			}
		}
		
		void k34_down() {// ���������Ͱ� ������
			if (k34_floor == k34_limit_down_floor) {// ���� ���������Ͱ� ������ ���̶��
				k34_help = "ó�� �� �Դϴ�.";
			} else {// ���������Ͱ� ������ ���� �ƴ϶��
				k34_floor--;// �� ���� ��������.
				k34_help = String.format("%d���Դϴ�.", k34_floor);
			}
		}		
}
