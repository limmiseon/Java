package softwarecoding006;

public class SoftwareCoding006_practice009_TvRemocon2Calss {
		int k34_vol = 0;// int�� �ν��Ͻ� ���� k34_vol�� �����Ѵ�. (���� ����)
		int k34_channel = 0;// int�� �ν��Ͻ� ���� k34_channel�� �����Ѵ�. (���� ä��)
		String k34_help;// ���ڿ� �ν��Ͻ� ���� k34_help�� �����Ѵ�.
		
		SoftwareCoding006_practice009_TvRemocon2Calss() {
			System.out.println("=> ä�� �ö󰡿�");
			for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelUp �޼ҵ带 10�� ȣ���ϴ� �ݺ���
				k34_ChannelUp();
			}
			
			System.out.println("=> ä�� ��������");
			for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelDn �޼ҵ带 10�� ȣ���ϴ� �ݺ���
				k34_ChannelDn();
			}
			
			System.out.println("=> ���� �ö󰡿�");
			for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolUp �޼ҵ带 5�� ȣ���ϴ� �ݺ���
				k34_VolUp();
			}
			
			System.out.println("=> ���� ��������");
			for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolDn �޼ҵ带 5�� ȣ���ϴ� �ݺ���
				k34_VolDn();
			}
		}
		
		void k34_VolUp() {// �޼ҵ� VolUp�� �����Ѵ�. (������ �ö�)
			k34_vol++;// k34_vol�� 1�� ���Ѵ�.
			k34_help = String.format("���� ���� :%d", k34_vol);// String Ŭ������ format�Լ��� �̿��� ���ڿ��� �����Ѵ�.
			System.out.printf("MSD[%s]\n", k34_help);
		}
		
		void k34_VolDn() {// �޼ҵ� VolDn�� �����Ѵ�. (������ ������)
			k34_vol--;// k34_vol���� 1�� ����.
			k34_help = String.format("���� ���� :%d", k34_vol);// String Ŭ������ format�Լ��� �̿��� ���ڿ��� �����Ѵ�.
			System.out.printf("MSD[%s]\n", k34_help);
		}
		
		void k34_ChannelUp() {// �޼ҵ� ChannelUp�� �����Ѵ�. (ä���� �ö�)
			k34_channel++;
			k34_help = String.format("���� ä�� :%d", k34_channel);// String Ŭ������ format�Լ��� �̿��� ���ڿ��� �����Ѵ�.
			System.out.printf("MSD[%s]\n", k34_help);
		}
		
		void k34_ChannelDn() {// �޼ҵ� ChannelDn�� �����Ѵ�. (ä���� ������)
			k34_channel--;
			k34_help = String.format("���� ä�� :%d", k34_channel);// String Ŭ������ format�Լ��� �̿��� ���ڿ��� �����Ѵ�.
			System.out.printf("MSD[%s]\n", k34_help);
		}		
}
