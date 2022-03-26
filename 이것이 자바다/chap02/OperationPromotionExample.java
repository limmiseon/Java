package sec03.exam04_operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteVal1 = 10;
		byte byteVal2 = 20;
		
		//byte byteVal3 = byteVal1 + byteVal2; -> 컴파일 에러
		int intVal1 = byteVal1 + byteVal2;
		System.out.println(intVal1);
		
		char charVal1 = 'A';
		char charVal2 = 1; //유니코드 1번을 저장한다.
		
		// char charVal3 = charVal1 + charVal2; -> 컴파일 에러
		int intVal2 = charVal1 + charVal2;
		System.out.println("유니코드 = " + intVal2);
		System.out.println("출력문자 = " + (char) intVal2);
		
		int intVal3 = 10;
		int intVal4 = intVal3 / 4; // -> 2.5이지만 정수와 정수의 나눗셈은 정수로 저장된다.
		System.out.println(intVal4);
		
		int intVal5 = 10;
		// int intVal6 = 10 / 4.0 -> 피연산자 중 실수리터럴이 있으면 변수는 double로 자동 변환되므로 컴파일 에러
		double doubleVal = intVal5 / 4.0;
		System.out.println(doubleVal);
	}

}
