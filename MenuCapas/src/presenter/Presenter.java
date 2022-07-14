package presenter;

import view.ViewConsole;
import model.Calculator;

public class Presenter {
	private Calculator calculator;
	private ViewConsole view;
	
	public Presenter() {
		calculator = new Calculator();
		view = new ViewConsole();
		run();
	}
	
	public void run() {
		int option = 0;
		do {
			String menu = "1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir";
			System.out.println(menu);
			option = view.read("Digite la opcion desea: ");
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
		int a = view.read("Ingrese primer Digito");
		int b = view.read("Ingrese segundo Digito");
		int answer = calculator.add(a,b);
		System.out.println("El resultado es " + answer);
	}
	
	public void substract() {
		int a = view.read("Ingrese primer Digito");
		int b = view.read("Ingrese segundo Digito");
		int answer = calculator.substract(a,b);
		System.out.println("El resultado es " + answer);
	}
	
	public void multiply() {
		int a = view.read("Ingrese primer Digito");
		int b = view.read("Ingrese segundo Digito");
		int answer = calculator.multiply(a,b);
		System.out.println("El resultado es " + answer);
	}
	
	public void divide() {
		int a = view.read("Ingrese primer Digito");
		int b = view.read("Ingrese segundo Digito");
		int answer = calculator.divide(a,b);
		System.out.println("El resultado es " + answer);
	}

	public static void main(String [] args) {
		new Presenter();
		
	}
}
