package persistence;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReader {
	
	public XMLReader() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		org.w3c.dom.Document document = builder.parse(new File("data/lybrary.xml")); 
		
		String root = document.getDocumentElement().getNodeName();
		System.out.println("etiqueta raiz " + root);
		
		NodeList nodos = document.getElementsByTagName("libro");
		System.out.println("nombre primer elemento " + nodos.item(0).getNodeName());
		
		Element element = (Element)nodos.item(0);
		System.out.println("valor del atributo id " +  element.getAttribute("id"));
		
		System.out.println("titulo " + element.getElementsByTagName("titulo").item(0).getNodeValue());
	}
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		new XMLReader();
	}
}
