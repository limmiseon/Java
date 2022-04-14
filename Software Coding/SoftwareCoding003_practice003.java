package softwarecoding003;

public class SoftwareCoding003_practice003 {

	public static void main(String[] args) {
		// #3. 정수형 변수의 나눗셈은 정수 범위에서 버림처리
		int kopo34_ii = 1000/3;// kopo34_ii라는 int형 변수를 선언하고 1000/3으로 나눈 값으로 초기화 한다. 이때 값은 33.3333..이지만 int는 정수형 변수이므로 소숫점은 버려진다.
		System.out.printf("#3-1 : %d ", kopo34_ii);// kopo34_ii의 값을 출력한다.
		
		kopo34_ii = 1000%3;// kopo34_ii에 1000을 3으로 나눈 나머지를 대입한다.
		System.out.printf("#3-2 : %d ", kopo34_ii);// kopo34_ii의 값을 출력한다.
		
		//나머지 연산자의 응용을 위해 for문을 작성한다.
		for (int kopo34_i = 0; kopo34_i < 20; kopo34_i++) {// i는 0부터 시작하고, 20보다 작을 때까지 반복하며, 실행문이 끝나면 i를 1씩 증가시킨다.
			System.out.printf("#3-3 : %d ", kopo34_i);// kopo34_i의 값을 출력한다.
			
			if(((kopo34_i + 1) % 5) == 0) {// i에 1을 더하는 이유는 i가 0부터 시작하기 때문에 범위가 0~19까지이다. 여기에 1을 더해 범위를 1~20으로 설정해준다.
				System.out.printf("\n");// i를 5로 나눈 나머지가 0이라면 개행문자를 프린트한다.
			}
		}

	}

}
