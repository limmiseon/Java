package softwarecoding006;

public class SoftwareCoding006_practice012_Elevator3Class extends SoftwareCoding006_practice008_Elevator2Class{
		void repair() {// �޼ҵ� ���� (���������� ������)
			k34_help = String.format("������ �Դϴ�.");
		}

		@Override
		void k34_up() {// �θ� Ŭ������ k34_up �޼ҵ带 �������̵��Ѵ�.
			if (k34_floor >= k34_limit_up_floor) {
				k34_help = "������ �� �Դϴ�.";
			} else {
				k34_floor +=  2;// �ֻ����� �ƴ� �� 2���� �ö󰣴�.
				k34_help = String.format("%d���Դϴ�.", k34_floor);
			}
			
			this.k34_down();// �θ� Ŭ������ k34_down �޼ҵ带 ȣ���Ѵ�.
							// 2�� �ö󰡰� �ٽ� 1�� ������
		}
		
		@Override// �θ� Ŭ������ k34_down �޼ҵ带 �������̵��Ѵ�.
		void k34_down() {// �θ� Ŭ������ k34_up �޼ҵ带 �������̵��Ѵ�.
			super.k34_down();// �θ� Ŭ������ k34_down �޼ҵ带 ȣ���Ѵ�.
			System.out.printf("Ŭ���� �ȿ��� ��� �ִ� MSD [%s]\n", this.k34_help);
		}
}
