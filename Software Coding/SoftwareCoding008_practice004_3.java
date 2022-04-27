package softwarecoding008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SoftwareCoding008_practice004_3 {

	public static void main(String[] args) throws IOException {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\경기도광주시_무료개방주차장.csv");// 다음 주소의 파일을 읽는다.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// 버퍼를 이용해 파일을 읽는다.
			
			String k34_readTxt;// 읽어낸 문자열을 저장하기 위한 변수
			
			if((k34_readTxt = k34_br.readLine()) == null) {// 만약 더 이상 읽어올 데이터가 없다면
				System.out.printf("빈 파일입니다\n");
			}
			
			String[] k34_fieldName = k34_readTxt.split(",");// 데이터를 콤마로 구분해 잘라서 k34_fieldName 배열에 넣는다.
			
			// 우리집 위도경도 지도에서 알아보기
			double lat = 37.4507;// 위도
			double lng = 127.2428;// 경도
			
			double k34_dist;// 거리를 저장할 변수
			double k34_max = Integer.MIN_VALUE;// 가장 가까운 주차장 거리를 저장할 변수
			double k34_min = Integer.MAX_VALUE;// 가장 먼 주차장 거리를 저장할 변수
			
			String k34_close = "";// 가장 가까운 주차장 주소를 저장할 변수
			String k34_far = "";// 가장 먼 주차장 주소를 저장할 변수
			
			int k34_lineCnt = 0;// 항목 번호를 저장할 변수
			while ((k34_readTxt = k34_br.readLine()) != null) {// 읽어올 데이터가 있다면 계속 반복한다.
				String[] k34_field = k34_readTxt.split(",");// k34_readTxt를 콤마로 구분해 k34_field 배열에 넣는다.
				
				System.out.printf("**[%d번째 항목]*********************\n", k34_lineCnt);
				System.out.printf(" %s : %s\n", k34_fieldName[5], k34_field[5]); // 5번 : 도로명 주소
				System.out.printf(" %s : %s\n", k34_fieldName[7], k34_field[7]); // 7번 : 위도 주소
				System.out.printf(" %s : %s\n", k34_fieldName[8], k34_field[8]); // 8번 : 경도 주소
				k34_dist = Math.sqrt( Math.pow(Double.parseDouble(k34_field[7]) - lat, 2)
						+ Math.pow(Double.parseDouble(k34_field[8]) - lng, 2));// 피타고라스 식을 이용해 거리 구하고 k34_dist에 저장한다.
				System.out.printf(" 현재지점과 거리 : %f\n", k34_dist);
				System.out.printf("***********************************\n");

				// 우리집에서 가장 가까운 곳와 먼 곳
				if(k34_max < k34_dist) {// 만약 k34_max값보다 현재 거리가 더 멀다면
					k34_max = k34_dist;// k34_max값에 현재 거리값을 대입한다.
					k34_far = k34_field[5];// 먼 곳 주소에 k34_field의 5번째 인덱스 값(도로명 주소)를 저장한다.
				}
				
				if(k34_min > k34_dist) {// 만약 k34_min값보다 현재 거리가 더 작다면
					k34_min = k34_dist;// k34_min값에 현재 거리값을 대입한다.
					k34_close = k34_field[5];// 가까운 곳 주소에 k34_field의 5번째 인덱스 값(도로명 주소)를 저장한다.
				}
				k34_lineCnt ++;// 항목 번호에 1씩 더한다.
			}
			k34_br.close();// 버퍼를 닫는다.
			
			System.out.printf("***********************************\n");
			System.out.printf("우리집에서 가장 먼 곳 : %s\n", k34_far);
			System.out.printf("우리집과의 거리 : %s\n", k34_max);
			System.out.printf("***********************************\n");
			
			System.out.printf("***********************************\n");
			System.out.printf("우리집에서 가장 가까운 곳 : %s\n", k34_close);
			System.out.printf("우리집과의 거리 : %s\n", k34_min);
			System.out.printf("***********************************\n");
	}
}
