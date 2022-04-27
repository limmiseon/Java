package softwarecoding009;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SoftwareCoding009_practice002 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// DocumentBuilder를 생성한다.
		DocumentBuilder k34_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		// xml 파일의 경로를 지정한다. (해당 경로의 파일을 가져옴)
		Document k34_doc = k34_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\kopo34 과제\\소프트웨어 코딩\\queryDFS.xml"));
		
		String k34_seq = "";// 48시간 중 몇번째인지
		String k34_hour = "";// 동네예보 3시간 단위
		String k34_day = "";// 1번째 날 (0 : 오늘 /1 : 내일/2 : 모레)
		String k34_temp = "";// 현재 시간과 온도
		String k34_tmx = "";// 최고 온도
		String k34_tmn = "";// 최저 온도
		String k34_sky = "";// 하늘 상태코드 (1: 맑음, 2: 구름조금, 3: 구름많음, 4: 흐림)
		String k34_pty = "";// 강수 상태코드 (0 : 없음, 1: 비, 2: 비/눈, 3: 눈/비, 4: 눈)
		String k34_wfKor = "";// 날씨 한국어
		String k34_wfEn = "";// 날씨 영어
		String k34_pop = "";// 강수 확률(%)
		String k34_r12 = "";// 12시간 예상 강수량
		String k34_s12 = "";// 12시간 예상 적설량
		String k34_ws = "";// 풍속(m/s)
		String k34_wd = "";// 풍향 (0~7: 북, 북동, 동, 남동, 남, 남서, 서, 북서)
		String k34_wdkor = "";// 풍향 한국어
		String k34_wdEn = "";// 풍향 영어
		String k34_reh = "";// 습도(%)
		String k34_r06 = "";// 6시간 예상 강수량
		String k34_s06 = "";// 6시간 예상 적설량
		
		Element root = k34_doc.getDocumentElement();// 루트를 기준으로 요소를 받아온다.
		NodeList k34_tag001 = k34_doc.getElementsByTagName("data");// xml의 루트를 기준으로 data 태그를 찾는다.
		for(int k34_i = 0; k34_i < k34_tag001.getLength(); k34_i++) {
			Element k34_elmt = (Element)k34_tag001.item(k34_i);
			System.out.println("***************************************");
			k34_seq = k34_tag001.item(k34_i).getAttributes().getNamedItem("seq").getNodeValue();
			System.out.printf("시간(48시간 기준) : %s\n", k34_seq);
			k34_hour = k34_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			System.out.printf("동네 예보(3시간 단위) : %s\n", k34_hour);
			k34_day = k34_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			System.out.printf("날짜(0 : 오늘/ 1: 내일/2 : 모레) : %s\n", k34_day);
			k34_temp = k34_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			System.out.printf("현재 온도 : %s\n", k34_temp);
			k34_tmx = k34_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			System.out.printf("최고 온도 : %s\n", k34_tmx);
			k34_tmn = k34_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			System.out.printf("최저 온도 : %s\n", k34_tmn);
			k34_sky = k34_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			System.out.printf("하늘 상태 : %s\n", k34_sky);
			k34_pty = k34_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			System.out.printf("강수 상태 : %s\n", k34_pty);
			k34_wfKor = k34_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			System.out.printf("날씨 (한국어) : %s\n", k34_wfKor);
			k34_wfEn = k34_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			System.out.printf("날씨 (영어) : %s\n", k34_wfEn);
			k34_pop = k34_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			System.out.printf("강수 확률(%%) : %s\n", k34_pop);
			k34_r12 = k34_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			System.out.printf("12시간 예상 강수량 : %s\n", k34_r12);
			k34_s12 = k34_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			System.out.printf("12시간 예상 적설량 : %s\n", k34_s12);
			k34_ws = k34_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			System.out.printf("풍속(m/s) : %s\n", k34_ws);
			k34_wd = k34_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			System.out.printf("풍향 : %s\n", k34_wd);
			k34_wdkor = k34_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			System.out.printf("풍향 (한국어) : %s\n", k34_wdkor);
			k34_wdEn = k34_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			System.out.printf("풍향 (영어) : %s\n", k34_wdEn);
			k34_reh = k34_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			System.out.printf("습도(%%) : %s\n", k34_reh);
			k34_r06 = k34_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			System.out.printf("6시간 예상 강수량 : %s\n", k34_r06);
			k34_s06 = k34_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();
			System.out.printf("6시간 예상 적설량 : %s\n", k34_s06);
		
		}
	}
}
