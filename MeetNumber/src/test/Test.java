package test;

import java.util.Scanner;

import model.Number;

public class Test {
	
	public static void main(String[] args) {
		Number number1 = new Number();
		Scanner sc = new Scanner(System.in);		
		int i = 1;
		
		System.out.println("Encuentre el número correcto de 1 a 30\n Tiene 3 Intentos" );
		int n = sc.nextInt();		
		
		while(i < 3 && number1.meetNumber(n)==false){
			i = i + 1;
			System.out.println("Incerte un número correcto");
			n = sc.nextInt();
			
		}
		if(number1.meetNumber(n)==true) {
			System.out.println("Has Encontrado el Numero");
		}else {
			System.out.println("Has terminado tus Intentos");
		}
	}

	

}
