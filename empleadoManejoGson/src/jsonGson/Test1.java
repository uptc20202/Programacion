package jsonGson;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.Employee;

public class Test1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		JsonReader reader = new Gson().newJsonReader(new FileReader("data/nuevoArchivo.json"));
		Employee emp = new Gson().fromJson(reader, Employee.class);
		System.out.println(emp);
	}
}
