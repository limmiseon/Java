package softwarecoding005;

public class SoftwareCoding005_practice003 {

	public static void main(String[] args) {
		// 달력 출력
		int k34_dayStart = 5; // int변수 k34_dayStart을 선언하고 5로 초기화한다. (1월 1일이 금요일이므로 5로 초기화)
							  // 0 = 일, 1 = 월,  2 = 화, 3 = 수, 4  = 목, 5 = 금, 6 = 토
		int[] k34_end = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};// int배열 k34_end를 선언하고 매달 마지막 날짜를 요소로 넣어준다.
		for (int k34_mon = 0; k34_mon < 12; k34_mon++) {// for문 : k34_mon는 0부터 시작하고, k34_mon가 12보다 작으면 반복하고, 실행문이 끝나면 k34_mon를 1씩 증가시킨다.
														// k34_mon는 월을 의미한다.
			System.out.printf("\n\n         %d월\n", k34_mon + 1);// k34_mon의 범위가 0 ~ 11이므로 출력할때는 1을 더해 1 ~ 12까지 출력될 수 있도록 한다.
			System.out.printf("======================\n");
			System.out.printf(" 일 월 화 수 목 금 토\n");
			for (int k34_space = 0; k34_space < k34_dayStart; k34_space++) {// 중첩 for문 : k34_space는 0부터 시작하고, k34_space가 k34_dayStart보다 작으면 반복하고,
																			// 실행문이 끝나면 k34_space를 1씩 증가시킨다.
																			// 매달 1일의 요일에 맞춰 빈칸을 출력하기 위한 반복문
				System.out.printf("   ");
			}
			for (int k34_days = 1; k34_days <= k34_end[k34_mon]; k34_days++) {// 중첩 for문 : k34_days는 0부터 시작하고, k34_days가 매달의 마지막 날짜보다 작거나 같으면 반복하고,
																			  // 실행문이 끝나면 k34_days를 1씩 증가시킨다.
																			  // 날짜를 출력하기 위한 반복문
				System.out.printf(" %2d", k34_days);// 날짜를 출력한다.
				k34_dayStart++;// k34_dayStart에 1을 더한다.
				if (k34_dayStart == 7) {// 만약 k34_dayStart가 7이라면
					k34_dayStart = 0;// 0을 대입한다. (요일의 범위는 0 ~ 6까지이므로)
					System.out.printf("\n");// 일요일마다 줄바꿈
				}
			}
		}
	}
}
