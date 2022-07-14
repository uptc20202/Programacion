package model;

import java.util.Date;

public class Library {
	
	private Student[] students;
	private Book[] book1;
	private Loan[] loan1;
	private int quantity;
	
	public Library() {
		quantity = 30;
		students = new Student[quantity];
		book1 = new Book[quantity];
		loan1 =	new Loan[quantity];
		
	}
	 
	
	public void setStudent1(Student[] students) {
		this.students = students;
	}
	
	public Book[] consultByTopic(String x){
		Book book2[] = new Book[30];
		int i = 0;
		
		while(book1[i] != null) {
			
			if(book1[i].getTopic().equals(x)) {
					book2[i] = book1[i];
			}
			i++;
		}
	   return book2;
	}
	
	public Book consultByWriter(String x, int i){
		Book book2 = null;
		
		if(book1[i] != null) {
			if(book1[i].getWriter().equals(x)) {
				
				book2 = book1[i];				
			}
		}	
		return book2;
	}
	
	public Book consultByYear(int x, int i){
	   Book book2 = null;
		
	   if(book1[i] != null) {
			if(book1[i].getYear() == x) {
				
				book2 = book1[i];				
			}
	   }	
		return book2;

	}
	
	public Book consultByIsbn(String x, int i){
		Book book2 = null;
		
		if(book1[i] != null) {
			if(book1[i].getIsbn().equals(x)) {
				
				book2 = book1[i];				
			}
		}	
		return book2;
	}
	
	public Book consultForQuantity(String x) {
		Book book2 = null;
		int i = 0;		
		if(book1[i] != null) {
			while(!book1[i].getIsbn().equals(x)) {
				i++;
			}
			book2 = book1[i];
			
		}
		return book2;
	
	}
	
	public Student consultByCode(int x) {
		Student student2 = null;
		int i = 0;		
		if(students[i] != null) {
			while(students[i].getCode() != x) {
				i++;
			}
			student2 = students[i];
			
		}
		return student2;
	
	}
	
	public Loan returnLoan(int x, String y) {
		Date z = new Date();
		Loan loan3 = new Loan(x, y, z);
		int i = 0;		
			
			while(loan1[i] != null) {
				if(loan1[i].getCode() == loan3.getCode() && loan1[i].getIsbnBook().equals(loan3.getIsbnBook())) {
				loan3 = loan1[i];
				}
				i++;
			}
			
		return loan3;
		
	}
	
	
	
	public Loan printLoan(int i){
		Loan loan2 = null;
		loan2 = loan1[i];
	
		return loan2;	
	}

	
	public void addStudent(Student student, int position) {
		students[position] = student;
	}
	
	public void addBook(Book book, int position) {
		book1[position] = book;
	}
	
	public void addLoan(Loan loan, int position) {
		loan1[position] = loan;
	}
	
	public int countArrangement() {
		int x = book1.length;
		return x;
	}
	
	public int countBook() {
		int i = 0;
		int i2 = 0;
		while(i < book1.length) {
			if(book1[i] != null) {
				i2++;
			}
			i++;
		}
		return i2;
	}
	
	public int countLoan() {
		int x = loan1.length;
		return x;
	}
	
	public int countStudent() {
		int x = students.length;
		return x;
	}
	
	public int countBookFree() {
		int i = 0;
		int i2 = 0;
		while(book1[i] != null ) {
			i2++;
			i++;
		}
		return i2;
	}
	
	public int countLoanFree() {
		int i = 0;
		int i2 = 0;
		while(loan1[i] != null ) {
			i2++;
			i++;
		}
		return i2;
	}
	
	public int countStudentFree() {
		int i = 0;
		int i2 = 0;
		while(students[i] != null ) {
			i2++;
			i++;
		}
		return i2;
	}
}
