package softwarecoding006;

public class SoftwareCoding006_practice011_TvRemoconXCalss extends SoftwareCoding006_practice005_TvRemoconCalss{
		int k34_energe = 10;// ������ üũ�� ���� ����
		
		void k34_energeCheck() {// ������ üũ�� ���� ����
			if (k34_energe > 0) {// k34_energe�� 0���� ũ�ٸ�
				System.out.printf("���� ������ �ܷ� : %d\n", k34_energe);
			} else {// 0�̶��
				System.out.printf("�������� ��ü�� �ּ���.\n");
				k34_energeChange();// ������ ��ü�� ���� �޼ҵ带 ����Ѵ�.
				
			}
		}
		
		void k34_energeChange() {// �������� ��ü�ϴ� �޼ҵ�
			System.out.printf("�������� ��ü�ϴ� ���Դϴ� ��\n");
			k34_energe += 10;// k34_energe�� 10�� ���Ѵ�.
			System.out.printf("��ü �Ϸ�\n");
		}
		
		@Override// �θ� Ŭ������ k34_VolUp �޼ҵ带 �������̵��Ѵ�.
		void k34_VolUp() {
			super.k34_VolUp();// �θ� Ŭ������ k34_VolUp �޼ҵ� ȣ��
			k34_energe --;
		}
		
		@Override// �θ� Ŭ������ k34_VolDn �޼ҵ带 �������̵��Ѵ�.
		void k34_VolDn() {
			super.k34_VolDn();// �θ� Ŭ������ k34_VolDn �޼ҵ� ȣ��
			k34_energe --;
		}
		
		@Override// �θ� Ŭ������ k34_ChannelUp �޼ҵ带 �������̵��Ѵ�.
		void k34_ChannelUp() {
			super.k34_ChannelUp();// �θ� Ŭ������ k34_ChannelUp �޼ҵ� ȣ��
			k34_energe --;
		}
		
		@Override// �θ� Ŭ������ k34_ChannelDn �޼ҵ带 �������̵��Ѵ�.
		void k34_ChannelDn() {
			super.k34_ChannelDn();// �θ� Ŭ������ k34_ChannelDn �޼ҵ� ȣ��
			k34_energe --;
		}
}
