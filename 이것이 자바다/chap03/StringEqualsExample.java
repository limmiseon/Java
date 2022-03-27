package sec03;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "임미선";//리터럴이 같으면 같은 객체의 번지수를 갖는다.
		String strVar2 = "임미선";
		String strVar3 = new String("임미선");//객체 생성 연산자를 사용해 다른 번지수를 갖는다.
		
		System.out.println(strVar1 == strVar2);//true
		System.out.println(strVar1 == strVar3);//false
		System.out.println();//개행
		System.out.println(strVar1.equals(strVar2));//문자열 비교
		System.out.println(strVar1.equals(strVar3));

	}

}
