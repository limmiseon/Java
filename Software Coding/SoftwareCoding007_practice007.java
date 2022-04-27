package softwarecoding007;

import java.util.ArrayList;


public class SoftwareCoding007_practice007 {
	
	public static void main(String[] args) {
		ArrayList k34_arr = new ArrayList();// ArrayList 선언
		
		k34_arr.add("abc");// add를 이용해 ArrayList에 요소를 추가한다.
		k34_arr.add("abcd");
		k34_arr.add("efga");
		k34_arr.add("가나다0");
		k34_arr.add("1234");
		k34_arr.add("12rk34");
		// k34_arr.add(356)은 x => 스트링으로 쓰기 위함
		
		System.out.printf("***********************************\n");
		System.out.printf(" 시작 ArraySize %d\n", k34_arr.size());
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {
			System.out.printf(" ArraySize %d = %s\n", k34_i, k34_arr.get(k34_i));
		}
		
		k34_arr.set(3, "가라라라");// set을 이용해 인덱스 3번 어레이리스트 내용을 변경한다.
		System.out.printf("***********************************\n");
		System.out.printf(" 내용변경 ArraySize %d\n", k34_arr.size());
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {
			System.out.printf(" ArraySize %d = %s\n", k34_i, k34_arr.get(k34_i));
		}
		
		k34_arr.remove(4); // remove를 이용해 인덱스 4번 어레이리스트를 삭제한다.
		System.out.printf("***********************************\n");
		System.out.printf(" 내용변경 ArraySize %d\n", k34_arr.size());
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {
			System.out.printf(" ArraySize %d = %s\n", k34_i, k34_arr.get(k34_i));
		}
		
		k34_arr.sort(null); // sort를 이용해 어레이리스트를 정렬한다.
		System.out.printf("***********************************\n");
			System.out.printf(" 리스트 Sort ArraySize %d\n", k34_arr.size());
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {
			System.out.printf(" ArraySList %d = %s\n", k34_i, k34_arr.get(k34_i));
		}
		
		k34_arr.clear(); // clear을 이용해 어레이리스트를 삭제한다.
		System.out.printf("***********************************\n");
		System.out.printf(" 전부 삭제 ArraySize %d\n", k34_arr.size());
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {
			System.out.printf(" ArraySList %d = %s\n", k34_i, k34_arr.get(k34_i));
		}
	}
}

