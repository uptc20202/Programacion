package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.Cat;
import model.Cats;
import persistence.WebConsumer;

public class Test3 {
	
	public static void main(String[] args) throws FileNotFoundException {
		WebConsumer web = new WebConsumer();
		String webConsumer = web.WebServicePlainReader("https://raw.githubusercontent.com/prust/wikipedia-movie-data/master/movies.json");
		JsonReader reader = new Gson().newJsonReader(new FileReader("data/empleados.json"));
		Cats emp = new Gson().fromJson(reader, Cats.class);
		
		Cat[] emps = emp.getCats();
		for(int i = 0; 1 < emps.length; i++) {
			System.out.println(emps[i]);
		}
	}
}
