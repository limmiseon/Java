package softwarecoding006;

public class SoftwareCoding006_practice005_TvRemoconMain {
	
	public static void main(String[] args) {
		// SoftwareCoding006_practice005_TvRemoconCalss Ŭ������ ��ü�� �����Ѵ�.
		SoftwareCoding006_practice005_TvRemoconCalss k34_remo = new SoftwareCoding006_practice005_TvRemoconCalss();
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelUp �޼ҵ带 10�� ȣ���ϴ� �ݺ���
			k34_remo.k34_ChannelUp();
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelDn �޼ҵ带 10�� ȣ���ϴ� �ݺ���
			k34_remo.k34_ChannelDn();
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolUp �޼ҵ带 5�� ȣ���ϴ� �ݺ���
			k34_remo.k34_VolUp();
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolDn �޼ҵ带 5�� ȣ���ϴ� �ݺ���
			k34_remo.k34_VolDn();
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
	}
}
