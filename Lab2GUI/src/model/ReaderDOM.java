package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReaderDOM {
	private Document doc;

	public ReaderDOM(String file) {
		doc = getDocument(file);
	}

	private Document getDocument(String file) {
		File xmlFile = new File(file);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		Document doc = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
		} catch (IOException | ParserConfigurationException | SAXException e) {
			e.printStackTrace();
		}
		return doc;
	}

	public void writeDOM2(Word book, String file) {
		Element rootElement = doc.getDocumentElement();
		rootElement.appendChild((Node) new Word(""));

		// for output to file, console
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = transformerFactory.newTransformer();
			// for pretty print
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
			DOMSource source = new DOMSource(doc);
			// write to console or file
			StreamResult file2 = new StreamResult(new File(file));
			// write data
			transformer.transform(source, file2);
		} catch (TransformerException e1) {
			e1.printStackTrace();
		}
	}

	public Node newBook(Document doc, String id, String word, String synonyms) {
		Element book = doc.createElement("book");
		book.setAttribute("id", id);
		book.appendChild(getLibroElements(doc, book, "word", word));
		book.appendChild(getLibroElements(doc, book, "synonyms", synonyms));
		return book;
	}

	public Node getLibroElements(Document doc, Element element, String name, String value) {
		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));
		return node;
	}

	public ArrayList<Dictionary> getBooks() {
		ArrayList<Dictionary> books = new ArrayList<>();
		NodeList nodeList = doc.getElementsByTagName("book");	
		for (int i = 0; i < nodeList.getLength(); i++) {
			books.add(getLibro(nodeList.item(i)));
		}
		return books;
	}
	
	public Dictionary getLibro(Node node) {
		Dictionary libro = null;
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			libro = new Dictionary(Integer.parseInt(element.getAttribute("id")), getTagValue("tittle", element),
					getTagValue("author", element), Integer.parseInt(getTagValue("year", element)));
		}
		return libro;
	}
	
	public String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
}
