package jsonGson;

import model.Employee;

public class Employees {
	
	private Employee[] employees;

	public Employees(Employee[] employees) {
		super();
		this.employees = employees;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	

}
