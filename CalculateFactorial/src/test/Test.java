package test;

import model.Factorial;
import java.util.Scanner;

public class Test {
	public static void main(String [] args) {
		Factorial factorial1 = new Factorial();
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Ingrese el numero al que desea calcular su Factorial");
		int n = sr.nextInt();
		
		factorial1.factorial(n);
		
		System.out.println(factorial1.factorial(n));
		
	}
}
