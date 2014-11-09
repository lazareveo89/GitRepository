package test.se.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class UtilXml {
	public void createXml(){
		
	}
	public void parseXml(){
		
	}
	public NodeList readXml(String name) throws ParserConfigurationException, SAXException, IOException{
		//��� ������ ��������� ��������� ������ ���� DocumentBuilder
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new UtilFile().getFile(name));
		//�������� ������ ��������� � �������� ������� �������
		Element root = doc.getDocumentElement();
		NodeList list = root.getChildNodes();		
		return list;
	}
}