package softwarecoding004;

public class SoftwareCoding004_practice002 {

	public static void main(String[] args) {
		// while문으로 별 찍기
		int kopo34_A, kopo34_B; // int형 변수 kopo34_A와 kopo34_B를 선언한다.

		kopo34_A = 0;// kopo34_A를 0으로 초기화한다. 안쪽의 while문이 끝날 때마다 1씩 증가한다.
		while (true) {// while문을 실행한다.
			kopo34_B = 0;// kopo34_B를 0으로 초기화한다. 안쪽의 while문이 끝날 때마다 0으로 초기화된다.
			while (true) {// while문 안에 while문을 추가한다.
				System.out.printf("*");// 별을 찍는다.
				if (kopo34_A == kopo34_B) {// 만약 kopo34_A와 kopo34_B의 값이 같다면
					break;// 안쪽의 while문에서 빠져나온다.(안쪽의 while문은 kopo34_A와 kopo34_B의 값이 같아질 때까지 반복된다.)
				}
				kopo34_B++;// if문이 거짓이라면 kopo34_B를 1씩 증가시킨다.(kopo34_A + 1만큼 별이 찍힌다.)
			}
			
			System.out.printf("\n");// 줄을 바꾼다.
			kopo34_A++;// kopo34_A의 값을 증가시킨다.
			if (kopo34_A == 30) {// 만약 kopo34_A의 값이 30과 같다면(30줄만큼 별을 찍을 것이기 때문에 30으로 설정)
				break;// 바깥쪽의 while문에서 빠져나온다.
			}
		}
	}
}
