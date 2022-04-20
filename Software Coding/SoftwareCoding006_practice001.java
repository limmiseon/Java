package softwarecoding006;

public class SoftwareCoding006_practice001 {
	
	public static void iamMethod() {// iamMethod 함수 정의
		System.out.printf("메소드라 불러줘요~~\n");
	}

	public static void main(String[] args) {
		SoftwareCoding006_practice001.iamMethod();// 클래스명.메소드명으로 메소드를 호출한다.
		iamMethod();// 클래스명.메소드명이 원칙이지만 자기 클래스 안에 static으로 함수를 정의하면 함수 이름만으로 메소드를 불러올 수 있다.
	}
}
