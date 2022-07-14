package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
	private NodeList nodeList;
	private ArrayList<String> synonyms;

	public XMLTest() {
		test();
	}

	public void getBook(Node node) {
		Element element = (Element) node;
		System.out.println(getTagValue("titulo", element));
		System.out.println(getTagValue("autor", element));
	}
	
	public ArrayList<String> searchSynonyms(String word) {
		System.out.println(doc.getElementById("1acabar") + word );
	
		Element word2 = doc.getElementById(word);
		return getTagSynonym("synonym", word2);
		
	}
	
	public ArrayList<String> getTagSynonym(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		
		for(int i = 0; i < nodeList.getLength(); i++) {
			Node node = (Node) nodeList.item(i);
			synonyms.add(node.getNodeValue());
		}
		return synonyms;
	}

	public String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}

	public NodeList test() {
		xmlFile = new File("data/words.xml");
		dbFactory = DocumentBuilderFactory.newInstance();
		nodeList = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(xmlFile);
			String etiquetRaiz = doc.getDocumentElement().getNodeName(); // Nombre etiqueta raiz
			nodeList = doc.getElementsByTagName("word"); // Me recupera una lista de elementos de tipo libro
			/*for (int i = 0; i < nodeList.getLength(); i++) {
				getBook(nodeList.item(i));
			}*/
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return nodeList; 
	}

	/*public static void main(String[] args) {
		new XMLTest();
	}*/
}
