package softwarecoding006;

public class SoftwareCoding006_practice011_TvRemoconXMain {
	
	public static void main(String[] args) {
		// SoftwareCoding006_practice011_TvRemoconXCalss Ŭ������ ��ü�� �����Ѵ�.
		SoftwareCoding006_practice011_TvRemoconXCalss k34_remo = new SoftwareCoding006_practice011_TvRemoconXCalss();
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelUp �޼ҵ带 10�� ȣ���ϴ� �ݺ���
			k34_remo.k34_energeCheck();// ������ üũ �޼ҵ带 ȣ���Ѵ�.
			k34_remo.k34_ChannelUp();// ä���� �ø��� �޼ҵ带 ȣ���Ѵ�.
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// k34_ChannelDn �޼ҵ带 10�� ȣ���ϴ� �ݺ���
			k34_remo.k34_energeCheck();// ������ üũ �޼ҵ带 ȣ���Ѵ�.
			k34_remo.k34_ChannelDn();// ä���� ������ �޼ҵ带 ȣ���Ѵ�.
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolUp �޼ҵ带 5�� ȣ���ϴ� �ݺ���
			k34_remo.k34_energeCheck();// ������ üũ �޼ҵ带 ȣ���Ѵ�.
			k34_remo.k34_VolUp();// ������ �ø��� �޼ҵ带 ȣ���Ѵ�.
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 5; k34_i++) {// k34_VolDn �޼ҵ带 5�� ȣ���ϴ� �ݺ���
			k34_remo.k34_energeCheck();// ������ üũ �޼ҵ带 ȣ���Ѵ�.
			k34_remo.k34_VolDn();// ������ ������ �޼ҵ带 ȣ���Ѵ�.
			System.out.printf("MSD[%s]\n", k34_remo.k34_help);
		}
	}
}
