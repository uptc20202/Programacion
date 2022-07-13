package test;

import model.CurrencyConverter;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
			CurrencyConverter currencyConverter1=new CurrencyConverter();
			Scanner sc = new Scanner(System.in);
			Scanner cp = new Scanner(System.in);
			String p = "n";
			
			while(CurrencyConverter.CalculateValue(p) == -1) {
				System.out.println("Seleccione a que Modena desea realizar la conversion (d)olar - (e)uro - (p)Libra");
				p = sc.next();
				CurrencyConverter.CalculateValue(p);
			}
			
			System.out.println("Incerte el valor en pesos");
			CurrencyConverter.setColombianPeso(cp.nextDouble());
			
			
			
			System.out.println("La conversión es igual a "+CurrencyConverter.CalculateValue(p));
	}

}
