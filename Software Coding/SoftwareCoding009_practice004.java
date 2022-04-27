package softwarecoding009;

import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.xml.sax.SAXException;

public class SoftwareCoding009_practice004 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ParseException {
		JSONParser k34_parser = new JSONParser();
		
		//JSON데이터를 넣어 JSONObject로 만들어 준다.
		Object k34_obj = k34_parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\testJson.json"));// 해당 주소의 Json파일을 넣어준다.
		
		//JSONArray를 생성하고 JSONObject를 붙여준다.
		JSONArray k34_array = (JSONArray)k34_obj;
		
		System.out.printf("*****************************************************\n");
		for (int k34_i = 0; k34_i < k34_array.size(); k34_i++) {// k34_array의 길이만큼 반복문을 돌린다.
			JSONObject k34_result = (JSONObject)k34_array.get(k34_i);// k34_array 값에서 하나를 가져온다.
			System.out.println("이름 : " + k34_result.get("name"));// 이름을 가져온다.
			System.out.println("학번 : " + k34_result.get("studentid"));// 학번을 가져온다.
			
			JSONArray k34_score = (JSONArray) k34_result.get("score"); // score의 값을 가져와 JSONArray에 넣는다.
			long k34_kor = (long) k34_score.get(0);// 배열중 첫번째는 국어 점수
			long k34_eng = (long) k34_score.get(1);// 배열중 두번째는 국어 점수
			long k34_mat = (long) k34_score.get(2);// 배열중 세번째는 국어 점수
			
			System.out.println("국어 : " + k34_kor);
			System.out.println("영어 : " + k34_eng);
			System.out.println("수학 : " + k34_mat);
			System.out.println("총점 : " + (k34_kor + k34_eng + k34_mat));
			System.out.println("평균 : " + (k34_kor + k34_eng + k34_mat) / 3.0 );;
			System.out.printf("*****************************************************\n");
		}
	}
}
