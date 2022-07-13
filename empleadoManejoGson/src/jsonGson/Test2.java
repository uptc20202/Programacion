package jsonGson;

import com.google.gson.Gson;

import model.Address;
import model.Employee;

public class Test2 {
	
	public static void main(String[] args) {
		Employee emp = new Employee(123,"Jorge", new Address("calle 13", "Tunja", 15003), new long[] {1,2,3});
		String json = new Gson().toJson(emp);
		System.out.println(json);
				
	}
}
