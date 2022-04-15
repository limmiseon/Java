package softwarecoding004;

public class SoftwareCoding004_practice001 {
	
	public static void main(String[] args) {
		// for문과 복합 for문을 활용한 구구단 출력
		int kopo34_sum = 0;// int변수 kopo34_sum을 선언하고 0으로 초기화한다.
		for (int kopo34_i = 0; kopo34_i < 10; kopo34_i++) {// for문 : kopo34_i는 0부터 시작하고, kopo34_i가 10보다 작으면 반복하고, 실행문이 끝나면 kopo34_i를 1씩 증가시킨다.
			kopo34_sum += kopo34_i;// kopo34_sum에 kopo34_i의 값을 누적 합산한다.(0 ~ 9까지의 합)
		}
		System.out.printf("sum %d\n", kopo34_sum);// kopo34_sum을 출력한다.
	
		for (int kopo34_i = 1; kopo34_i < 10; kopo34_i++) {// for문 : kopo34_i는 1부터 시작하고, kopo34_i가 10보다 작으면 반복하고, 실행문이 끝나면 kopo34_i를 1씩 증가시킨다.
			System.out.printf("*********************\n");
			System.out.printf("    구구단 %d 단\n", kopo34_i);// 구구단의 단수를 출력한다.
			System.out.printf("*********************\n");
			
			for (int kopo34_j = 1; kopo34_j < 10; kopo34_j++) {// 중첩 for문 : kopo34_j는 1부터 kopo34_j가 10보다 작으면 반복하고, 실행문이 끝나면 kopo34_j를 1씩 증가시킨다.
				System.out.printf("%d * %d = %d\n", kopo34_i, kopo34_j, kopo34_i * kopo34_j);// 구구단의 내용을 출력한다.
			}
		}		
	}
}
