package softwarecoding006;

public class SoftwareCoding006_practice004_ElevatorMain {
	private static int k34_inVal;// 클래스 내 전역변수 k34_iStatic를 선언한다. (자료형 앞에 private을 붙이면 해당 클래스 내에서만 쓸 수 있다.)
	
	public static void k34_up() {// k34_up 메소드를 정의한다.
		k34_inVal++;// k34_inVal에 1을 더한다.
		System.out.printf("난 그냥 메소드[%d]\n", k34_inVal);
	}
	
	public static void main(String[] args) {
		k34_inVal = 0;// 자기 클래스 내부 변수 사용
		SoftwareCoding006_practice004_ElevatorClass k34_elev;// 클래스를 받아 객체를 만든다.
		k34_elev = new SoftwareCoding006_practice004_ElevatorClass();// 인스턴스를 생성하여 객체에 연결한다.
		
		k34_up();// 현재 클래스의 내 k34_up 메소드를 호출한다.
		for (int k34_i = 0; k34_i < 10; k34_i++) {// 10번 도는 반복문
			k34_elev.k34_up();// elev 클래스의 k34_up 메소드를 호출한다.
			System.out.printf("MSD[%s]\n", k34_elev.k34_help);
		}
		
		for (int k34_i = 0; k34_i < 10; k34_i++) {// 10번 도는 반복문
			k34_elev.k34_down();// elev 클래스의 k34_down 메소드를 호출한다.
			System.out.printf("MSD[%s]\n", k34_elev.k34_help);
		}
	}
}
