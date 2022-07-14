package model;

public class Book {
	
	private String name;
	private String topic;
	private int year;
	private String writer;
	private String review;
	private String isbn;
	private int quantity;
	
	public Book(String n, String t, int y, String w, String r, String i, int q) {
		name = n;
		topic = t;
		year = y;
		writer = w;
		review = r;
		isbn = i;
		quantity = q;
		
	}
	

	public String getTopic() {
		return topic;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getWriter() {
		return writer;
	}
	
	/*public String getReview() {
		return review;
	}*/
	
	public String getIsbn() {
		return isbn;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int x) {
		quantity = x;
	}
	
	public String toString() {
		return "Book [name=" + name + " topic=" + topic + " year=" + year + " writer=" + writer + " review=" + review + " isbn=" + isbn + " Disponibles=" + quantity;
	}
}
