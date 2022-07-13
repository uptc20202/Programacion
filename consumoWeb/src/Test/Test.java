package Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import persistence.WebConsumer;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException {
		WebConsumer web = new WebConsumer();
		String url1 = "https://cat-fact.herokuapp.com/facts/random?animal_type=";
		
		String webConsumer = web.WebServicePlainReader("https://cat-fact.herokuapp.com/facts/random?animal_type=cat"+"&amount=1");
		
		System.out.println(webConsumer);
		
		PrintWriter print = new PrintWriter("data/nuevoArchivo.json");
		print.write(webConsumer);
		print.close();
	}
}
