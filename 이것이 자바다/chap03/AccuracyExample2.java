package sec03;

public class AccuracyExample2 {

	public static void main(String[] args) {
		//정확한 계산은 정수 사용
		int apple = 1;
		int totalPieces = apple * 10;
		int num = 7;
		int temp = totalPieces - num;
		
		double result = temp / 10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + " 조각이 남는다.");
	}

}
