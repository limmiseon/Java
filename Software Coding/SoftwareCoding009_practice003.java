package softwarecoding009;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SoftwareCoding009_practice003 {
	
	public static JSONObject k34_oneRec(String k34_name, int k34_studentid, int k34_kor, int k34_eng, int k34_mat) {
		JSONObject k34_dataObject = new JSONObject(); // 최종 완성될 k34_dataObject를 선언한다.
		k34_dataObject.put("name", k34_name);// k34_dataObject에 매개변수로 받은 k34_name을 넣는다.
		k34_dataObject.put("studentid", k34_studentid);// k34_dataObject에 매개변수로 받은 k34_studentid을 넣는다.
		// JSON 배열 생성
		JSONArray k34_score = new JSONArray();// 성적 정보를 담을 배열을 선언한다.
		k34_score.add(k34_kor);// 매개변수로 받은 국어 점수를 넣는다.
		k34_score.add(k34_eng);// 매개변수로 받은 영어 점수를 넣는다.
		k34_score.add(k34_mat);// 매개변수로 받은 수학 점수를 넣는다.
		k34_dataObject.put("score", k34_score);// k34_dataObject에 위에서 만든 배열을 넣는다.
		
		return k34_dataObject;// k34_dataObject에 저장된 값을 반환한다.
	}

	public static void main(String[] args) {
		// 최종 완성될 JSONObject 선언 (전체)
		JSONObject k34_jsonObject = new JSONObject();
		// 한명 성적의 JSON 정보를 담을 배열 선언
		JSONArray k34_datasArray = new JSONArray();
		
		// 한명 정보가 들어갈 JSONObject
		JSONObject k34_dataObject = new JSONObject();
		k34_dataObject.put("name", "나연"); // k34_dataObject에 이름을 넣는다.
		k34_dataObject.put("studentid", 209901);
		// JSON 배열 생성
		JSONArray k34_score = new JSONArray();
		k34_score.add(90);// 위에 만든 JSONArray에 국어 점수를 넣는다.
		k34_score.add(100);// 영어 점수를 넣는다.
		k34_score.add(95);// 수학 점수를 넣는다.
		k34_dataObject.put("score", k34_score);// 위에서 만든 배열을 k34_dataObject에 추가한다.
		k34_datasArray.add(k34_dataObject);// k34_datasArray에 k34_dataObject를 추가한다.
		
		// 나머지는 함수 처리
		k34_datasArray.add(k34_oneRec("정연", 209902, 100, 85, 75));
		k34_datasArray.add(k34_oneRec("모모", 209903, 90, 75, 85));
		k34_datasArray.add(k34_oneRec("사나", 209904, 90, 85, 75));
		k34_datasArray.add(k34_oneRec("지효", 209905, 80, 75, 85));
		k34_datasArray.add(k34_oneRec("미나", 209906, 90, 85, 55));
		k34_datasArray.add(k34_oneRec("다연", 209907, 70, 75, 65));
		k34_datasArray.add(k34_oneRec("채영", 209908, 100, 75, 95));
		k34_datasArray.add(k34_oneRec("쯔위", 209909, 80, 65, 95));
		
		try {
			FileWriter k34_file = new FileWriter("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\testJson.json");
			k34_file.write(k34_datasArray.toJSONString());
			k34_file.flush();// 메모리에서 디바이스로 옮겨줌(메모리에 있는걸 다 쓰고 끝냄)
			k34_file.close();// 파일을 닫는다. 
		} catch(IOException k34_e) {
			k34_e.printStackTrace();
		}
		System.out.println("JSON 만든거 : " + k34_datasArray);
	}
}
