package models;

public class Book {

	private int id;
	private String title;
	private String[] athors;
	private int yearOfP�blication;
	
	public Book(int id, String title, String[] athors, int yearOfPublication) {
		this.id = id;
		this.title = title;
		this.athors = athors;
		this.yearOfP�blication = yearOfPublication;
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

	public int getYearOfP�blication() {
		return yearOfP�blication;
	}

	public void setYearOfP�blication(int yearOfP�blication) {
		this.yearOfP�blication = yearOfP�blication;
	}
}
