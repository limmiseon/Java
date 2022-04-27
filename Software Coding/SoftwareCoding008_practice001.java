package softwarecoding008;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class SoftwareCoding008_practice001 {

	public static void main(String[] args) {
		try {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\myTest.txt");// 해당 주소에 파일을 저장한다.
			FileWriter k34_fw = new FileWriter(k34_f);// FileWriter를 이용해 파일을 쓴다.
			
			k34_fw.write("안녕 파일\n");// 파일 내용 추가
			k34_fw.write("hello 헬로\n");
			
			k34_fw.close();// 파일을 닫는다.
			
			FileReader k34_fr = new FileReader(k34_f);// FileReader을 이용해 파일을 읽는다.
			
			int k34_n;
			char[] k34_ch;
			
			while (true) {
				k34_ch = new char[100];// char 배열로 100개씩 읽어온다.
				k34_n = k34_fr.read(k34_ch);// 파일의 내용을 배열에 저장하고 그 길이를 k34_n에 대입한다.
				
				if(k34_n == -1) {// 만약 읽어올 데이터가 없다면
					break;// 반복문에서 빠져나온다.
				}
				
				for(int k34_i = 0; k34_i < k34_n; k34_i++) {// 배열의 길이만큼 파일을 읽기 위한 반복문
					System.out.printf("%c", k34_ch[k34_i]);// k34_ch 배열의 k34_i번째 인덱스의 값을 출력한다.
				}
			}
			k34_fr.close();// 파일을 닫는다.
				
			System.out.printf("\n*FILE READ END*");
			
		} catch (Exception k34_e) {
			System.out.printf("나 에러[%s]\n", k34_e);
		}
	}

}
