package model;

public class Person {

	private int id;
	private String name;
	private String lastname;
	public Person(int id, String name, String lastname) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int compareOtherPerson(Person person) {
		return name.compareTo(person.getName());
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lastname=" + lastname + "]";
	}
	
	
}
