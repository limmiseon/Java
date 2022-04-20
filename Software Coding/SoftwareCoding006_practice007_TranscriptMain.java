package softwarecoding006;

public class SoftwareCoding006_practice007_TranscriptMain {
	
	public static void main(String[] args) {
		// 메소드 사용을 위한 SoftwareCoding006_practice007_TranscriptClass 객체 생성
		SoftwareCoding006_practice007_TranscriptClass k34_cc = new SoftwareCoding006_practice007_TranscriptClass();
		
		k34_cc.transcript(100, 100, 100);
		System.out.println();
		k34_cc.transcript(100, 100, 100, 100);// 오버로딩 된 메소드를 호출한다.
		System.out.println();
		k34_cc.transcript(100, 100, 100, 100, 100);// 오버로딩 된 메소드를 호출한다.
	}
}
