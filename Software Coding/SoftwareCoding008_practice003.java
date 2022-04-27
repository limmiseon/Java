package softwarecoding008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SoftwareCoding008_practice003 {

	public static void main(String[] args) throws IOException {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\무료와이파이정보.csv");// 해당 주소의 파일을 읽어온다.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// 버퍼를 사용해 읽는다.
			
			String k34_readTxt;// 읽어낸 문자열을 저장하기 위한 변수
			
			if((k34_readTxt = k34_br.readLine()) == null) {// 만약 더 이상 읽어올 데이터가 없다면
				System.out.printf("빈 파일입니다\n");
			}
			String[] k34_fieldName = k34_readTxt.split(",");// 데이터를 콤마로 구분해 잘라서 k34_fieldName 배열에 넣는다.
						
			int k34_lineCnt = 0;// 항목 번호를 세기 위한 변수
			while ((k34_readTxt = k34_br.readLine()) != null) {// 읽어올 데이터가 있다면 계속 반복한다.
				String[] k34_field = k34_readTxt.split(",");// k34_readTxt를 콤마로 구분해 k34_field 배열에 넣는다.
				System.out.printf("**[%d번째 항목]*********************\n", k34_lineCnt);// 항목명 출력
				
				for (int k34_j = 0; k34_j < k34_fieldName.length; k34_j++) {// 항목과 데이터값을 출력하는 반복문
					System.out.printf(" %s : %s\n", k34_fieldName[k34_j], k34_field[k34_j]);
				}
				
				System.out.printf("***********************************\n");
			
			if (k34_lineCnt == 100) {// 항목이 100개가 되면
				break;// 반복문에서 빠져나온다.
			}
			k34_lineCnt++;// k34_lineCnt에 1씩 더한다.
			}
			
			k34_br.close();// 파일을 닫는다.
	}
}
