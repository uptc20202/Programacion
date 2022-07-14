package model;

public class Student {

	private String name;
	private int code;
	private String phone;
	
	public Student(String n, int c, String p) {
		name = n;
		code = c;
		phone = p;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String toString() {
		return "Student [name=" + name + " code=" + code + " phone=" + phone;
	}
}
