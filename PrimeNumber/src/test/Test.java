package test;

import model.PrimeNumber;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		PrimeNumber primeNumber1=new PrimeNumber();
		Scanner sr = new Scanner(System.in); 
		
		System.out.println("Ingrese en numero a calcular");
		int n=sr.nextInt();
		
		//primeNumber1.calculatePrime(n);
		
		if(primeNumber1.calculatePrime(n)) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}
		
	}
}
