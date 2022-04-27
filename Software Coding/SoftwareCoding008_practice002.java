package softwarecoding008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SoftwareCoding008_practice002 {

	public static void FileWrite() throws IOException {// 파일 쓰기 메소드
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\myTest001.txt");// 해당 주소에 파일을 저장한다.
			BufferedWriter k34_bw = new BufferedWriter(new FileWriter(k34_f));// 버퍼를 이용해 쓴다.
			
			k34_bw.write("안녕 파일");// 파일 내용 추가
			k34_bw.newLine();// 개행
			k34_bw.write("hello 헬로");
			k34_bw.newLine();// 개행
			
			k34_bw.close();// 파일을 닫는다.
	}
	
	public static void FileRead() throws IOException {// 파일 읽기 메소드
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\myTest001.txt");// 해당 주소의 파일을 읽어온다.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// 버퍼를 사용해 읽는다.
			
			String k34_readTxt;// 읽어온 문자열을 저장할 변수
			
			while ((k34_readTxt = k34_br.readLine()) != null) {// 읽어올 데이터값이 있으면 계속 반복된다
				System.out.printf("%s\n", k34_readTxt);// 데이터 출력
			}
			k34_br.close();// 파일을 닫는다.
	}
				
	public static void main(String[] args) throws IOException {
		FileWrite();// 파일을 쓰는 메소드 호출
		FileRead();// 파일을 읽는 메소드 호출
	}
}
