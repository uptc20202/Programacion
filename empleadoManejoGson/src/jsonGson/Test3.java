package jsonGson;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.Employee;

public class Test3 {
	
	public static void main(String[] args) throws FileNotFoundException {
		JsonReader reader = new Gson().newJsonReader(new FileReader("data/empleados.json"));
		Employees emp = new Gson().fromJson(reader, Employees.class);
		
		Employee[] emps = emp.getEmployees();
		for(int i = 0; 1 < emps.length; i++) {
			System.out.println(emps[i]);
		}
	}
}
