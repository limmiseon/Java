package sec03;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1; //리터럴 간의 연산은 타입 변환 없이 해당 타입으로 계산된다.
		System.out.println(c1);
		
		char c2 = 'A';
		// char c3 = c2 + 1; -> 컴파일 에러 / 변수값을 계산할때는 int로 변환 후 계산된다.
		int result = c2 + 1;
		System.out.println(result);
		
		char c3 = (char) result;
		System.out.println(c3);
	}

}
