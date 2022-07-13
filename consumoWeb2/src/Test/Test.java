package Test;

import persistence.WebConsumer;

public class Test {
	
	public static void main(String[] args) {
		WebConsumer web = new WebConsumer();
		System.out.println(web.WebServicePlainReader("https://raw.githubusercontent.com/prust/wikipedia-movie-data/master/movies.json"));
		String webConsumer = web.WebServicePlainReader("https://raw.githubusercontent.com/prust/wikipedia-movie-data/master/movies.json");
	}
}
