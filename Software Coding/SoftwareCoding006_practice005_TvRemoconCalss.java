package softwarecoding006;

public class SoftwareCoding006_practice005_TvRemoconCalss {
		int k34_vol = 0;// int�� �ν��Ͻ� ���� k34_vol�� �����Ѵ�. (���� ����)
		int k34_channel = 0;// int�� �ν��Ͻ� ���� k34_channel�� �����Ѵ�. (���� ä��)
		String k34_help;// ���ڿ� �ν��Ͻ� ���� k34_help�� �����Ѵ�.
		
		void k34_VolUp() {// �޼ҵ� VolUp�� �����Ѵ�. (������ �ö�)
			k34_vol++;// k34_vol�� 1�� ���Ѵ�.
			k34_help = String.format("���� ���� :%d", k34_vol);// String Ŭ������ format�Լ��� �̿��� ���ڿ��� �����Ѵ�.
		}
		
		
		void k34_VolDn() {// �޼ҵ� VolDn�� �����Ѵ�. (������ ������)
			k34_vol--;// k34_vol���� 1�� ����.
			k34_help = String.format("���� ���� :%d", k34_vol);// String Ŭ������ format�Լ��� �̿��� ���ڿ��� �����Ѵ�.
		}
		
		void k34_ChannelUp() {// �޼ҵ� ChannelUp�� �����Ѵ�. (ä���� �ö�)
			k34_channel++;
			k34_help = String.format("���� ä�� :%d", k34_channel);// String Ŭ������ format�Լ��� �̿��� ���ڿ��� �����Ѵ�.
		}
		
		void k34_ChannelDn() {// �޼ҵ� ChannelDn�� �����Ѵ�. (ä���� ������)
			k34_channel--;
			k34_help = String.format("���� ä�� :%d", k34_channel);// String Ŭ������ format�Լ��� �̿��� ���ڿ��� �����Ѵ�.
		}		
}
