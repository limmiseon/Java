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
		// DocumentBuilder�� �����Ѵ�.
		DocumentBuilder k34_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		// xml ������ ��θ� �����Ѵ�. (�ش� ����� ������ ������)
		Document k34_doc = k34_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\kopo34 ����\\����Ʈ���� �ڵ�\\queryDFS.xml"));
		
		String k34_seq = "";// 48�ð� �� ���°����
		String k34_hour = "";// ���׿��� 3�ð� ����
		String k34_day = "";// 1��° �� (0 : ���� /1 : ����/2 : ��)
		String k34_temp = "";// ���� �ð��� �µ�
		String k34_tmx = "";// �ְ� �µ�
		String k34_tmn = "";// ���� �µ�
		String k34_sky = "";// �ϴ� �����ڵ� (1: ����, 2: ��������, 3: ��������, 4: �帲)
		String k34_pty = "";// ���� �����ڵ� (0 : ����, 1: ��, 2: ��/��, 3: ��/��, 4: ��)
		String k34_wfKor = "";// ���� �ѱ���
		String k34_wfEn = "";// ���� ����
		String k34_pop = "";// ���� Ȯ��(%)
		String k34_r12 = "";// 12�ð� ���� ������
		String k34_s12 = "";// 12�ð� ���� ������
		String k34_ws = "";// ǳ��(m/s)
		String k34_wd = "";// ǳ�� (0~7: ��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)
		String k34_wdkor = "";// ǳ�� �ѱ���
		String k34_wdEn = "";// ǳ�� ����
		String k34_reh = "";// ����(%)
		String k34_r06 = "";// 6�ð� ���� ������
		String k34_s06 = "";// 6�ð� ���� ������
		
		Element root = k34_doc.getDocumentElement();// ��Ʈ�� �������� ��Ҹ� �޾ƿ´�.
		NodeList k34_tag001 = k34_doc.getElementsByTagName("data");// xml�� ��Ʈ�� �������� data �±׸� ã�´�.
		for(int k34_i = 0; k34_i < k34_tag001.getLength(); k34_i++) {
			Element k34_elmt = (Element)k34_tag001.item(k34_i);
			System.out.println("***************************************");
			k34_seq = k34_tag001.item(k34_i).getAttributes().getNamedItem("seq").getNodeValue();
			System.out.printf("�ð�(48�ð� ����) : %s\n", k34_seq);
			k34_hour = k34_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			System.out.printf("���� ����(3�ð� ����) : %s\n", k34_hour);
			k34_day = k34_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			System.out.printf("��¥(0 : ����/ 1: ����/2 : ��) : %s\n", k34_day);
			k34_temp = k34_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			System.out.printf("���� �µ� : %s\n", k34_temp);
			k34_tmx = k34_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			System.out.printf("�ְ� �µ� : %s\n", k34_tmx);
			k34_tmn = k34_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			System.out.printf("���� �µ� : %s\n", k34_tmn);
			k34_sky = k34_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			System.out.printf("�ϴ� ���� : %s\n", k34_sky);
			k34_pty = k34_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			System.out.printf("���� ���� : %s\n", k34_pty);
			k34_wfKor = k34_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			System.out.printf("���� (�ѱ���) : %s\n", k34_wfKor);
			k34_wfEn = k34_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			System.out.printf("���� (����) : %s\n", k34_wfEn);
			k34_pop = k34_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			System.out.printf("���� Ȯ��(%%) : %s\n", k34_pop);
			k34_r12 = k34_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			System.out.printf("12�ð� ���� ������ : %s\n", k34_r12);
			k34_s12 = k34_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			System.out.printf("12�ð� ���� ������ : %s\n", k34_s12);
			k34_ws = k34_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			System.out.printf("ǳ��(m/s) : %s\n", k34_ws);
			k34_wd = k34_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			System.out.printf("ǳ�� : %s\n", k34_wd);
			k34_wdkor = k34_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			System.out.printf("ǳ�� (�ѱ���) : %s\n", k34_wdkor);
			k34_wdEn = k34_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			System.out.printf("ǳ�� (����) : %s\n", k34_wdEn);
			k34_reh = k34_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			System.out.printf("����(%%) : %s\n", k34_reh);
			k34_r06 = k34_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			System.out.printf("6�ð� ���� ������ : %s\n", k34_r06);
			k34_s06 = k34_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();
			System.out.printf("6�ð� ���� ������ : %s\n", k34_s06);
		
		}
	}
}
