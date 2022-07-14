package model;

import java.util.Date;

public class Loan {
	
	private int codeStudent;
	private String isbnBook;
	private Date dateLoan;
	
	public Loan() {
		
	}
	public Loan(int code,String isbn, Date date) {
		codeStudent = code;
		isbnBook = isbn;
		dateLoan = date;
	}
	
	
	public void setIsbnBook(String i) {
		isbnBook = i;
	}
	
	public Date getDateLoan() {
		return dateLoan;
	}
	
	public String getIsbnBook() {
		return isbnBook;
	}
	
	public int getCode() {
		return codeStudent;
	}
	
	public void loanBook(Book x) {
		
			x.setQuantity(x.getQuantity()-1);
		
	}
	
	public void returnBook(Book x) {
		
		x.setQuantity(x.getQuantity()+1);
	
	}
	
	
	
	public String toString() {
		return "Loan [Codigo del estudiante=" + codeStudent + " El isbn del libro prestado es= " + isbnBook + " ]" ;
	}
	

}
