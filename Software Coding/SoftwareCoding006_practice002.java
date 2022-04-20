package softwarecoding006;

public class SoftwareCoding006_practice002 {
	static int k34_iStatic;// 클래스 내 전역변수 k34_iStatic를 선언한다. (자료형 앞에 static을 붙이면 전역변수)
	
	public static void k34_add(int k34_i) {// k34_add메소드를 정의한다. 인자로는 int형 변수를 받고, 리턴값은 없다.
		k34_iStatic++;// k34_iStatic에 1을 더한다.
		k34_i++;// 인자로 받은 변수에 1을 더한다.
		System.out.printf("add메소드에서->k34_iStatic=[%d]\n", k34_iStatic);
		System.out.printf("add메소드에서->k34_i=[%d]\n", k34_i);
	}
	
	public static int k34_add2(int k34_i) {// k34_add2메소드를 정의한다. 인자로는 int형 변수를 받고, 리턴값도 int형이다.
		k34_iStatic++;// k34_iStatic에 1을 더한다.
		k34_i++;// 인자로 받은 변수에 1을 더한다.
		System.out.printf("add2메소드에서->k34_iStatic=[%d]\n", k34_iStatic);
		System.out.printf("add2메소드에서->k34_i=[%d]\n", k34_i);
		return k34_i;// k34_i값을 반환한다.
	}

	public static void main(String[] args) {
		int k34_iMain = 1;// int변수 k34_iMain을 선언한다.
		k34_iStatic = 1;// k34_iStatic에 1을 대입한다.
		
		System.out.printf("**************************************\n");
		System.out.printf("메소드호출전 메인에서->k34_iStatic=[%d]\n", k34_iStatic);
		System.out.printf("메소드호출전 메인에서->k34_iMain=[%d]\n", k34_iMain);
		System.out.printf("**************************************\n");
		
		k34_add(k34_iMain);// 메소드 k34_add를 호출한다. 인자로는 k34_iMain을 넣는다.
		
		System.out.printf("**************************************\n");
		System.out.printf("메소드호출후 메인에서->k34_iStatic=[%d]\n", k34_iStatic);
		System.out.printf("메소드호출후 메인에서->k34_iMain=[%d]\n", k34_iMain);// k34_iMain 메소드 안에서 일시적으로 2가 됐지만 값을 받아오지 않았기 때문에
																			    // 메인에서는 다시 1이 됐다.
		System.out.printf("**************************************\n");
		
		k34_iMain = k34_add2(k34_iMain);// 메소드 k34_add2를 호출해 얻은 값을 k34_iMain에 넣는다. (이렇게 해야 증가된 k34_iMain값이 메인에서 저장됨)
										// 이런식으로 값을 전달하고 받는 방법이 이해하기 쉽다.
		
		System.out.printf("**************************************\n");
		System.out.printf("메소드 add2호출후 메인에서->k34_iStatic=[%d]\n", k34_iStatic);
		System.out.printf("메소드 add2호출후 메인에서->k34_iMain=[%d]\n", k34_iMain);
		System.out.printf("**************************************\n");
	}
}
