package models;

public class Book {

	private int id;
	private String title;
	private String[] athors;
	private int yearOfPúblication;
	
	public Book(int id, String title, String[] athors, int yearOfPublication) {
		this.id = id;
		this.title = title;
		this.athors = athors;
		this.yearOfPúblication = yearOfPublication;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getAthors() {
		return athors;
	}

	public void setAthors(String[] athors) {
		this.athors = athors;
	}

	public int getYearOfPúblication() {
		return yearOfPúblication;
	}

	public void setYearOfPúblication(int yearOfPúblication) {
		this.yearOfPúblication = yearOfPúblication;
	}
}
