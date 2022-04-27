package softwarecoding008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SoftwareCoding008_practice006_1_A005930 {

	public static void main(String[] args) throws IOException {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\StockDailyPrice.csv");// 해당 위치에 있는 THTSKS010H00.dat파일을 읽는다.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// BufferedReader 사용해 읽는다.
			
			File k34_f1 = new File("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\A005930.csv");// 해당 위치에 A005930.csv 파일을 생성한다.
			BufferedWriter k34_bw = new BufferedWriter(new FileWriter(k34_f1));// BufferedWriter 사용해 쓴다.
			
			// 현재 시간을 출력하기 위해 Calendar 클래스를 가져온다.
			Calendar k34_cal01 = Calendar.getInstance();// Calendar 클래스를 사용하기 위해 객체를 생성한다.
			k34_cal01.setTime(new Date());// 시작 시간을 구한다.
			SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");// 현재 시간을 양식대로 출력하기 위해 SimpleDateFormat클래스의 객체를 생성하고 양식을 지정한다.
			
			long k34_start = System.currentTimeMillis();// 실행 시간 계산을 위한 메소드 호출			
			
			String k34_readTxt;// 읽어낸 문자열을 저장하기 위한 변수
			
			int k34_cnt = 0;// 전체 카운트
			int k34_wcnt = 0;// 삼성만 카운트
			while ((k34_readTxt = k34_br.readLine()) != null) {// 읽을 문자열이 있으면(null이 아니면) 반복한다.
				StringBuffer k34_s = new StringBuffer();// 스트링 버퍼 객체를 생성한다.
				String[] k34_field = k34_readTxt.split(",");// 필드값을 콤마로 구분해 잘라낸다.
				
				if(k34_field.length > 2 && k34_field[2].equals("A005930")) {// 삼성전자를 구분하기 위한 조건문
																		    // 삼성전자는 세번째 필드가 A005930이다.
					k34_s.append(k34_field[0]);// 첫번째 필드를 k34_s에 더한다.
					for (int k34_j = 1; k34_j < k34_field.length; k34_j++) {// 필드를 저장하는 반복문
						k34_s.append("," + k34_field[k34_j]);// 첫번째 필드를 제외한 나머지 필드를 k34_s에 더한다.
					}
					
					k34_bw.write(k34_s.toString());// k34_s의 값을 쓴다.
					k34_bw.newLine();// 개행
					k34_wcnt++;// 삼성 카운트에 1씩 더한다.
				}
				
				k34_cnt++;// 전체 카운트에 1씩 더한다.
			}
			k34_br.close();// 읽기 파일을 닫는다.
			k34_bw.close();// 쓰기 파일을 닫는다.
			
			Calendar k34_cal02 = Calendar.getInstance();
			k34_cal02.setTime(new Date());// 종료 시간을 구한다.
			System.out.println("시작시간 : " + String.format(k34_sd.format(k34_cal01.getTime())));
			System.out.println("종료시간 : " + String.format(k34_sd.format(k34_cal02.getTime())));
			long k34_end = System.currentTimeMillis();// 실행 시간 계산을 위한 메소드 호출
			System.out.println("실행 시간 : " + (k34_end - k34_start) / 1000.0 + "초");
			System.out.printf("전체 카운트 : [%d]\n삼성 카운트 : [%d]records\n", k34_cnt, k34_wcnt);
	}
}
