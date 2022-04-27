package softwarecoding007;

public class SoftwareCoding007_practice005 {

	public static void main(String[] args) {
		// int배열 생성
		int[] k34_arr = { 20, 7, 11, 248, 321, 26, 72, 3, 78, 2200, 3714, 982, 34, 21, 63, 55 };

		// 최대값 최소값 찾기
		int k34_max = k34_arr[0];// 최대값을 k34_arr 배열의 0번째 인덱스로 설정한다.
		int k34_min = k34_arr[0];// 최소값을 k34_arr 배열의 0번째 인덱스로 설정한다.
		int k34_maxPt = 0;// 최대값의 인덱스번호
		int k34_minPt = 0;// 최소값의 인덱스번호
		
		for (int k34_i = 0; k34_i < k34_arr.length; k34_i++) {// 최대값 최소값을 찾는 반복문
			if (k34_max < k34_arr[k34_i]) {// 만약 k34_arr배열의 k34_i번째 인덱스의 값이 k34_max 보다 크다면
				k34_max = k34_arr[k34_i];// k34_max에 값을 대입하고
				k34_maxPt = k34_i;// 인덱스 번호에 k34_i값을 대입한다.
			}

			if (k34_min > k34_arr[k34_i]) {// 만약 k34_arr배열의 k34_i번째 인덱스의 값이 k34_min 보다 작다면
				k34_min = k34_arr[k34_i];// k34_min에 값을 대입하고
				k34_minPt = k34_i;// 인덱스 번호에 k34_i값을 대입한다.
			}
		}

		System.out.printf("MAX : k34_arr[%d] = %d\n", k34_maxPt, k34_max);
		System.out.printf("MIN : k34_arr[%d] = %d\n", k34_minPt, k34_min);
	}
}
