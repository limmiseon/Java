package softwarecoding008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SoftwareCoding008_practice006_3_A5931_maxmin {

	public static void main(String[] args) throws IOException {
			File k34_f = new File("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\A005930.csv");// 해당 위치에 있는 A005930.csv파일을 읽는다.
			BufferedReader k34_br = new BufferedReader(new FileReader(k34_f));// BufferedReader 사용해 읽는다.
			
			// 현재 시간을 출력하기 위해 Calendar 클래스를 가져온다.
			Calendar k34_cal01 = Calendar.getInstance();// Calendar 클래스를 사용하기 위해 객체를 생성한다.
			k34_cal01.setTime(new Date());// 시작 시간을 구한다.
			SimpleDateFormat k34_sd = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");// 현재 시간을 양식대로 출력하기 위해 SimpleDateFormat클래스의 객체를 생성하고 양식을 지정한다.
			
			long k34_start = System.currentTimeMillis();// 실행 시간 계산을 위한 메소드 호출	

			int k34_max = Integer.MIN_VALUE;// 최대값을 integer 범위의 가장 작은 값으로 초기화
			int k34_min = Integer.MAX_VALUE;// 최소값을 integer 범위의 가장 큰 값으로 초기화
			String k34_maxDay = "";
			String k34_minDay = "";
			String k34_readTxt;// 읽어낸 문자열을 저장하기 위한 변수
			
			while ((k34_readTxt = k34_br.readLine()) != null) {// 읽을 문자열이 있으면(null이 아니면) 반복한다.
				String[] k34_field = k34_readTxt.split(",");// 필드값을 콤마로 구분해 잘라낸다.
				if(k34_field.length > 2 &&k34_field[1].contains("2015")) {// 두번째 필드가 날짜이므로 2015년이 포함되어 있으면
					if(k34_max < Integer.parseInt(k34_field[3])) {// int형으로 형변환 후 값을 비교해 최대값보다 크면 현재 종가를 최댓값으로 설정한다.
						k34_max = Integer.parseInt(k34_field[3]);
						k34_maxDay = k34_field[1];
						
					}
				
					if(k34_min > Integer.parseInt(k34_field[3])) {// int형으로 형변환 후 값을 비교해 최소값보다 작으면 현재 종가를 최소값으로 설정한다.
						k34_min = Integer.parseInt(k34_field[3]);
						k34_minDay = k34_field[1];
					}
				}
			}
			
			k34_br.close();// 파일을 닫는다.
			
			Calendar k34_cal02 = Calendar.getInstance();//
			k34_cal02.setTime(new Date());// 종료 시간을 구한다.
			System.out.println("시작시간 : " + String.format(k34_sd.format(k34_cal01.getTime())));
			System.out.println("종료시간 : " + String.format(k34_sd.format(k34_cal02.getTime())));
			long k34_end = System.currentTimeMillis();// 실행 시간 계산을 위한 메소드 호출
			System.out.println("실행 시간 : " + (k34_end - k34_start) / 1000.0 + "초");
			System.out.printf("최소값 날짜 : %s = > %d\n최대값 날짜 : %s = > %d\n", k34_minDay, k34_min, k34_maxDay, k34_max);
	}
}
