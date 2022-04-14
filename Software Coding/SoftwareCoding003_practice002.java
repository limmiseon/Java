package softwarecoding003;

public class SoftwareCoding003_practice002 {

	public static void main(String[] args) {
		// #2. 누적하기, 합 구하기
		int kopo34_sum = 0;// kopo34_sum이라는 int형 변수를 선언하고 0으로 초기화한다.
		
		//1부터 100까지 더하기 위해 for문을 작성한다.
		for (int kopo34_i = 1; kopo34_i < 101; kopo34_i++) {// i는 1부터 시작하고, 101보다 작을 때까지 반복하며, 실행문이 끝나면 i를 1씩 증가시킨다.
			kopo34_sum = kopo34_sum + kopo34_i;// kopo34_sum의 값에 kopo34_sum + kopo34_i를 더한 값을 대입한다.
		}
		
		System.out.printf("#2-1 : %d\n", kopo34_sum);// 1~100까지 더한 값인 kopo34_sum을 출력한다.
		System.out.printf("#2-2 : %d\n", kopo34_sum/100);// 평균을 구하기 위해 1~100까지 더한 값을 더한 갯수만큼 나누고 출력한다.
		
		int[] kopo34_v = {1, 2, 3, 4, 5};// kopo34_v라는 int형 배열을 선언하고 초기화한다.
		int kopo34_vSum = 0;// 배열의 합을 저장할 kopo34_vSum이라는 변수를 선언하고 초기화한다.
		
		// kopo34_v 배열의 합을 구하기 위해 for문을 작성한다.
		for (int kopo34_i = 0; kopo34_i < 5; kopo34_i++) {// i는 0부터 시작하고, 5보다 작을 때까지 반복하며, 실행문이 끝나면 i를 1씩 증가시킨다.
			kopo34_vSum = kopo34_vSum + kopo34_v[kopo34_i];// kopo34_vSum의 값에 kopo34_v배열의 index 0~4까지를 누적 합산한다.
		}
	
		System.out.printf("#2-3 : %d\n", kopo34_vSum);// kopo34_v 배열의 합을 출력한다.

	}

}
