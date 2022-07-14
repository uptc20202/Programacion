package test;
import java.util.Scanner;
import model.Calculator;

public class Test {
	private Scanner console;
	private Calculator calculator;
	
	public Test() {
		console = new Scanner(System.in);
		calculator = new Calculator();
		run();
	}
	
	public void run() {
		int option = 0;
		do {
			String menu = "1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir";
			System.out.println(menu);
			System.out.print("Digite la opcion desea: ");
			option = Integer.parseInt(console.nextLine());
			switch(option) {
			case 1:
				add();
				break;
			case 2:
				substract();
				break;
			case 3:
				multiply();
				break;
			case 4:
				divide();
				break;
			case 5:
				System.out.println("gracias por utilizar la calculadora");
				break;
			default:
				
				break;
				
			}
		}while(option != 5);
		
	}
	
	public void add() {
		int a = Integer.parseInt(console.nextLine());
		int b = Integer.parseInt(console.nextLine());
		int answer = calculator.add(a,b);
		System.out.println("El resultado es " + answer);
	}
	
	public void substract() {
		int a = Integer.parseInt(console.nextLine());
		int b = Integer.parseInt(console.nextLine());
		int answer = calculator.substract(a,b);
		System.out.println("El resultado es " + answer);
	}
	
	public void multiply() {
		int a = Integer.parseInt(console.nextLine());
		int b = Integer.parseInt(console.nextLine());
		int answer = calculator.multiply(a,b);
		System.out.println("El resultado es " + answer);
	}
	
	public void divide() {
		int a = Integer.parseInt(console.nextLine());
		int b = Integer.parseInt(console.nextLine());
		int answer = calculator.divide(a,b);
		System.out.println("El resultado es " + answer);
	}

	public static void main(String [] args) {
		new Test();
		
	}
}
