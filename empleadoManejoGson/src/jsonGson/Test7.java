package jsonGson;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.Employee;

public class Test7 {
	
	public static void main(String[] args) throws FileNotFoundException {
		JsonReader reader = new Gson().newJsonReader(new FileReader("data/empleados.json"));
		Employee[] emp = new Gson().fromJson(reader, Employee[].class);
		
		System.out.println("con arreglo json");
		for(int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
 		
	}

}
