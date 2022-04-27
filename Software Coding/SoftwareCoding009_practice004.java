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
		
		//JSON�����͸� �־� JSONObject�� ����� �ش�.
		Object k34_obj = k34_parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\testJson.json"));// �ش� �ּ��� Json������ �־��ش�.
		
		//JSONArray�� �����ϰ� JSONObject�� �ٿ��ش�.
		JSONArray k34_array = (JSONArray)k34_obj;
		
		System.out.printf("*****************************************************\n");
		for (int k34_i = 0; k34_i < k34_array.size(); k34_i++) {// k34_array�� ���̸�ŭ �ݺ����� ������.
			JSONObject k34_result = (JSONObject)k34_array.get(k34_i);// k34_array ������ �ϳ��� �����´�.
			System.out.println("�̸� : " + k34_result.get("name"));// �̸��� �����´�.
			System.out.println("�й� : " + k34_result.get("studentid"));// �й��� �����´�.
			
			JSONArray k34_score = (JSONArray) k34_result.get("score"); // score�� ���� ������ JSONArray�� �ִ´�.
			long k34_kor = (long) k34_score.get(0);// �迭�� ù��°�� ���� ����
			long k34_eng = (long) k34_score.get(1);// �迭�� �ι�°�� ���� ����
			long k34_mat = (long) k34_score.get(2);// �迭�� ����°�� ���� ����
			
			System.out.println("���� : " + k34_kor);
			System.out.println("���� : " + k34_eng);
			System.out.println("���� : " + k34_mat);
			System.out.println("���� : " + (k34_kor + k34_eng + k34_mat));
			System.out.println("��� : " + (k34_kor + k34_eng + k34_mat) / 3.0 );;
			System.out.printf("*****************************************************\n");
		}
	}
}
