package test.se.xml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class TestXML {
	public static void main(String[] args){
		UtilXml ux = new UtilXml();
		NodeList list;		
		Node n;
		try {
			list = ux.readXml("D:\\FormatProp.xml");
			for (int i=0; i < list.getLength(); i++){
				n = list.item(i);
				if(n instanceof Element){
					//element of node
					Element element = (Element)n;
					String loc = element.getNodeName().trim();
					//Output name of node
					System.out.println("LOC:"+loc);
					
					NamedNodeMap attributes = element.getAttributes();
					String locName = element.getTextContent().trim();
					
					System.out.println(locName);
					for(int j=0;j<attributes.getLength();j++){
						Node attribute = attributes.item(j);
						String name = attribute.getNodeName().trim();
						String value = attribute.getNodeValue().trim();
						//variable name - name of attribute and name of node
						System.out.println(name+":"+value);
					}
				}
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
