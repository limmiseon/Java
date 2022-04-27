package softwarecoding009;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SoftwareCoding009_practice003 {
	
	public static JSONObject k34_oneRec(String k34_name, int k34_studentid, int k34_kor, int k34_eng, int k34_mat) {
		JSONObject k34_dataObject = new JSONObject(); // ���� �ϼ��� k34_dataObject�� �����Ѵ�.
		k34_dataObject.put("name", k34_name);// k34_dataObject�� �Ű������� ���� k34_name�� �ִ´�.
		k34_dataObject.put("studentid", k34_studentid);// k34_dataObject�� �Ű������� ���� k34_studentid�� �ִ´�.
		// JSON �迭 ����
		JSONArray k34_score = new JSONArray();// ���� ������ ���� �迭�� �����Ѵ�.
		k34_score.add(k34_kor);// �Ű������� ���� ���� ������ �ִ´�.
		k34_score.add(k34_eng);// �Ű������� ���� ���� ������ �ִ´�.
		k34_score.add(k34_mat);// �Ű������� ���� ���� ������ �ִ´�.
		k34_dataObject.put("score", k34_score);// k34_dataObject�� ������ ���� �迭�� �ִ´�.
		
		return k34_dataObject;// k34_dataObject�� ����� ���� ��ȯ�Ѵ�.
	}

	public static void main(String[] args) {
		// ���� �ϼ��� JSONObject ���� (��ü)
		JSONObject k34_jsonObject = new JSONObject();
		// �Ѹ� ������ JSON ������ ���� �迭 ����
		JSONArray k34_datasArray = new JSONArray();
		
		// �Ѹ� ������ �� JSONObject
		JSONObject k34_dataObject = new JSONObject();
		k34_dataObject.put("name", "����"); // k34_dataObject�� �̸��� �ִ´�.
		k34_dataObject.put("studentid", 209901);
		// JSON �迭 ����
		JSONArray k34_score = new JSONArray();
		k34_score.add(90);// ���� ���� JSONArray�� ���� ������ �ִ´�.
		k34_score.add(100);// ���� ������ �ִ´�.
		k34_score.add(95);// ���� ������ �ִ´�.
		k34_dataObject.put("score", k34_score);// ������ ���� �迭�� k34_dataObject�� �߰��Ѵ�.
		k34_datasArray.add(k34_dataObject);// k34_datasArray�� k34_dataObject�� �߰��Ѵ�.
		
		// �������� �Լ� ó��
		k34_datasArray.add(k34_oneRec("����", 209902, 100, 85, 75));
		k34_datasArray.add(k34_oneRec("���", 209903, 90, 75, 85));
		k34_datasArray.add(k34_oneRec("�糪", 209904, 90, 85, 75));
		k34_datasArray.add(k34_oneRec("��ȿ", 209905, 80, 75, 85));
		k34_datasArray.add(k34_oneRec("�̳�", 209906, 90, 85, 55));
		k34_datasArray.add(k34_oneRec("�ٿ�", 209907, 70, 75, 65));
		k34_datasArray.add(k34_oneRec("ä��", 209908, 100, 75, 95));
		k34_datasArray.add(k34_oneRec("����", 209909, 80, 65, 95));
		
		try {
			FileWriter k34_file = new FileWriter("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\testJson.json");
			k34_file.write(k34_datasArray.toJSONString());
			k34_file.flush();// �޸𸮿��� ����̽��� �Ű���(�޸𸮿� �ִ°� �� ���� ����)
			k34_file.close();// ������ �ݴ´�. 
		} catch(IOException k34_e) {
			k34_e.printStackTrace();
		}
		System.out.println("JSON ����� : " + k34_datasArray);
	}
}
