package softwarecoding007;

import java.util.ArrayList;


public class SoftwareCoding007_practice008 {
	
	public static void main(String[] args) {
		int k34_testMAX = 10;
		ArrayList k34_arr = new ArrayList();// ArrayList 선언
		
		for (int k34_i = 0; k34_i < k34_testMAX; k34_i++) {// 어레이리스트에 랜덤값을 주기위한 반복문
			k34_arr.add((int) (Math.random()*100));// 0 ~ 99 까지의 난수 생성
		}
		
		System.out.println(" 정렬 전");
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {// 어레이리스트 값을 출력하는 반복문
			System.out.printf(" ArrayList %d = %d\n", k34_i, k34_arr.get(k34_i));
		}
		
		System.out.printf("***********************************\n");
		k34_arr.sort(null);// 어레이리스트를 정렬한다.
		
		System.out.println(" 정렬 후");
		for (int k34_i = 0; k34_i < k34_arr.size(); k34_i++) {// 정렬 후 어레이리스트 값을 출력하는 반복문
			System.out.printf(" ArrayList %d = %d\n", k34_i, k34_arr.get(k34_i));
		}
	}
}

