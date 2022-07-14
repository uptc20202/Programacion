package presenter;

import view.ViewConsole;
import model.Book;
import model.Library;
import model.Loan;
import model.Student;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Presenter {
	private ViewConsole view;
	private Library library;
	private Loan loan;
	private Date dateNow;
	private static final long DATE_MAX = 30;
	
	public Presenter() {
		library = new Library();
		view = new ViewConsole();
		loan = new Loan();
		dateNow = new Date();
		run();
	}
	
	public void run() {
		createTestData();
		String option = "";
		do {
			String menu = "1.Consultar cuantos libros hay\n2.Consultar libro por\n 2.1.Tema\n 2.2.Año\n 2.3.Autor\n3.Consultar Datos De un Libro\n4.Consular prestamos activos\n5.Prestar Libro\n6.Crear Libros\n7.Retardos en Devolucion\n8.Consultar Datos De Deudor\n9.Devolver Prestamo\n10.Consultar Tiempo de Prestamo\n11.Crear Alumno";
			System.out.println(menu);
			option = view.readString("Digite la opcion desea: ");
			switch(option) {
				case "1":
					countBook();
					break;
				case "2":
					System.out.println("2.1.Tema\n2.2.Año\n2.3.Autor");
					break;
				case "2.1":
					ByTopic();
					break;
				case "2.2":
					ByYear();
					break;
				case "2.3":
					ByWriter();
					break;
				case "3":
					byData();
					break;
				case "4":
					byLoan();
					break;	
				case "5":
					lendBook();
					break;
				case "6":
					readBook();
					break;
				case "7":
					byDelay();
					break;
				case "8":
					byCode();
					break;
				case "9":
					returnBook();
					break;
				case "10":	
					byTime();
					break;
				case "11":
					readStudent();
					break;	
				default:
					System.out.println("Seleccione una opción correcta");
					break;
			}
		}while(option != "10");
		
	}
	
	public void ByTopic() {
		
		Book book2[] = new Book[30];
		String topic = view.readString("Inserte el tema ");
		book2 = library.consultByTopic(topic); 
		int i = 0;

		while(i < book2.length) {
			if(book2[i] != null ) {
			System.out.println(book2[i]);
			}
			i++;
		}
		System.out.println("No se encontraron más libros con el criterio indicado");
			
	}
	
	public void ByYear() {
		
		int year = view.readInt("Inserte el año ");
		int i = 0;
		while( i < library.countArrangement() ) {
			Book book2 = library.consultByYear(year,i);
			if(book2 != null) {
				System.out.println(book2);
			}
		i++;
		
		}		
		
	}
				
	public void ByWriter() {
		
		String writer = view.readString("Inserte el escritor ");
		int i = 0;
		while( i < library.countArrangement() ) {
			Book book2 = library.consultByWriter(writer,i);
			if(book2 != null) {
				System.out.println(book2);
			}
		i++;
		}
		
	}
	
	public void byData() {
		
		String isbn = view.readString("Inserte el ISBN ");
		int i = 0;
		while( i < library.countArrangement() ) {
			Book book2 = library.consultByIsbn(isbn,i);
			if(book2 != null) {
				System.out.println(book2);
			}
		i++;
		}
		
	}
	
	public void createTestData() {
		library.addBook(new Book("Orgullo y prejuicio", "Novela", 1813, "Jane Austen", "Orgullo y prejuicio, publicada por primera vez el 28 de enero de 1813 como una obra anónima, es la más famosa de las novelas de Jane Austen y una de las primeras comedias románticas en la historia de la novela.","9789583006760",1), 0);
		library.addBook(new Book("Odisea", "Epopeya", 1614, "Homero", "La Odisea es un poema épico griego compuesto por 24 cantos, atribuido al poeta griego Homero. Se cree que fue compuesta en el siglo VIII a. C. en los asentamientos que tenía Grecia en la costa oeste del Asia Menor. Según otros autores, la Odisea se completa en el siglo VII a.","9788497646932",1), 1);
		library.addBook(new Book("El principito", "Novela", 1943, "Antoine de Saint-Exupéry", "El principito es una novela corta y la obra más famosa del escritor y aviador francés Antoine de Saint-Exupéry.​","9788478886289",1), 2);
		library.addBook(new Book("Cumbres borrascosas", "Novela", 1847, "Emily Brontë", "Cumbres Borrascosas es la única novela de Emily Brontë. Fue publicada por primera vez en 1847 bajo el seudónimo de Ellis Bell. Su hermana Charlotte editó una segunda edición póstuma.","9788408181804",1), 3);
		library.addBook(new Book("Frankenstein o el moderno Prometeo", "Novela", 1823, "Mary Shelley", "Frankenstein o el moderno Prometeo, o simplemente Frankenstein, es una obra literaria de la escritora inglesa Mary Shelley.","9788476729281",1), 4);
		//library.addBook(new Book("El principito", "Novela", 1943, "Antoine de Saint-Exupéry", "","9788497646932"), 1);
		
		library.addStudent(new Student("ADRIANA CAROLINA HERNANDEZ MONTERROZA", 1, "3111111111"), 0);
		library.addStudent(new Student("ADRIANA MARCELA REY SANCHEZ", 2, "3111111111"), 1);
		library.addStudent(new Student("ALEJANDRO ABONDANO ACEVEDO", 3, "3111111111"), 2);
		
	}
	
	public void lendBook() {
		int i = library.countLoanFree();
		int x = 0;
		int codeStudent = view.readInt("digite el codigo del estudiante al que va a realizar el prestamo ");
		String isbn = view.readString("digite el isbn del libro que va a prestar ");
		
		if(library.consultForQuantity(isbn) != null) {
			x = library.consultForQuantity(isbn).getQuantity();
			
			if(x <= 0 ) {
				System.out.println("El libro no cuenta con ejemplares disponibles para prestar");
			}else {
			library.addLoan(new Loan(codeStudent, isbn, dateNow), i++);
			loan.loanBook(library.consultForQuantity(isbn));
			System.out.println("Tramite realizado");
			
			}
		}else {
			System.out.println("La operación no pudo ser realizada");
		}
		
		
	}
	
	public void returnBook() {
		
		int codeStudent = view.readInt("digite el codigo del estudiante al que va a retirar el prestamo ");
		String isbn = view.readString("digite el isbn del libro que va a ser devuelto ");
		
		
		
		library.returnLoan(codeStudent,isbn).setIsbnBook("Prestamo Cerrado");
		
		loan.returnBook(library.consultForQuantity(isbn));

	}
	
	public void byLoan() {
		
		int i = 0;
		int i2 = 0;
		while( i < library.countLoan() ) {
			Loan loan2 = library.printLoan(i);
			if(loan2 != null) {
				System.out.println(loan2);
				i2++;
			}
		i++;
		}
		System.out.println("Hay " + (i2) + " prestamos realizados");
	
	}
	
	public void byCode() {
		int x = view.readInt("digite el codigo del estudiante ");
		
		if(library.consultByCode(x) != null) {
			System.out.println(library.consultByCode(x));
		}
		
	}
	
	public void readBook() {
		int i = library.countBookFree();
		
		String name = view.readString("Digite el nombre del libro ");
		String topic = view.readString("digite el tema del libro ");
		int year = view.readInt("digite año de publicación  ");
		String writer = view.readString("digite el escritor ");
		String review = view.readString("digite una breve reseña ");
		String isbn = view.readString("digite codigo ISBN del libro ");
		int quantity = view.readInt("digite cuantos ejemplares desea ingresar ");

		library.addBook(new Book(name, topic, year, writer, review, isbn, quantity), i++);
		
	}

	public void byDelay() {
		int i = 0;
		long dateLoan = 0;
		while( i < library.countLoan() ) {
			Loan loan2 = library.printLoan(i);
			if(loan2 != null) {
				dateLoan = loan2.getDateLoan().getTime() - dateNow.getTime();
				if(dateLoan > DATE_MAX) {
					System.out.println("El libro " + loan2 + " cuenta con un retardo de " + dateLoan + " días");
				}
			}
		i++;
		}
		System.out.println("No se encontraron más libros con retardo en entrega");
	}
	
	public void byTime() {
		int codeStudent = view.readInt("digite el codigo del estudiante al que va a colsultar tiempo de prestamo ");
		String isbn = view.readString("digite el isbn del libro que corresponde al prestamo ");
		Date dateLoan = library.returnLoan(codeStudent,isbn).getDateLoan();
		
		long difference = dateLoan.getTime() - dateNow.getTime();
		
		TimeUnit time = TimeUnit.DAYS; 
        long diffrence2 = time.convert(difference, TimeUnit.MILLISECONDS);
        System.out.println("el tiempo de prestamo es "+ diffrence2);
		
	}
	
	public void readStudent() {
		int i = library.countStudentFree();
		
		String name = view.readString("Digite el nombre del estudiante ");
		int code = view.readInt("digite el codigo del estudiante  ");
		String phone = view.readString("digite el número de contacto del estudiante ");
		library.addStudent(new Student(name, code, phone), i++); 
		System.out.println("Estudiante creado correctamente");
		
	}
	
	public void countBook() {
		System.out.println("Hay " + library.countBook() + " Titulos de Libros Disponibles");
	}
	
	public static void main(String [] args) {
		new Presenter();
		
	}
	
}
