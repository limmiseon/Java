package softwarecoding008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SoftwareCoding008_practice005_1 {

	public static void main(String[] args) throws IOException {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\실습데이터\\day_data\\THTSKS010H00.dat");// 해당 위치에 있는 THTSKS010H00.dat파일을 가져온다.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// BufferedReader 사용해 읽는다.
			
			int k34_n = 0; // 읽은 갯수
			StringBuffer k34_s = new StringBuffer();// 스트링 버퍼를 생성한다.
			while (true) {
				char[] k34_ch = new char[1000];// char 배열로 1000개씩 읽어온다.
				
				k34_n = k34_br.read(k34_ch);// 배열로 쓰기
				
				if (k34_n == -1) {// 만약 데이터가 없으면
					break;// 반복문에서 빠져나온다.
				}
				
				for (int k34_i = 0; k34_i < k34_n; k34_i++) {// char배열 만큼 반복한다.
					if (k34_ch[k34_i] == '\n') {// 개행문자가 아니라면
						System.out.printf(" [%s]***\n", k34_s.toString());// 출력한다.
						k34_s.delete(0, k34_s.length());// 스트링 버퍼를 지워준다.
					} else {// 개행이 아니라면
						k34_s.append(k34_ch[k34_i]);// append로 더한다.
					}
				}
			}
			k34_br.close();// 버퍼를 닫는다.
			System.out.printf(" [%s]***\n", k34_s.toString());// 마지막 줄 출력
	}
}
