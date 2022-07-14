package models;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLTest {

	private File xmlFile;
	private DocumentBuilderFactory dbFactory;
	private DocumentBuilder dBuilder;
	private Document doc;

	public XMLTest() {
		test();
	}

	public void getBook(Node node) {
		Element element = (Element) node;
		System.out.println(getTagValue("titulo", element));
		System.out.println(getTagValue("autor", element));
	}

	public String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}

	public void test() {
		xmlFile = new File("data/prueba.xml");
		dbFactory = DocumentBuilderFactory.newInstance();
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(xmlFile);
			String etiquetRaiz = doc.getDocumentElement().getNodeName(); // Nombre etiqueta raiz
			NodeList nodeList = doc.getElementsByTagName("libro"); // Me recupera una lista de elementos de tipo libro
			for (int i = 0; i < nodeList.getLength(); i++) {
				getBook(nodeList.item(i));
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new XMLTest();
	}
}
