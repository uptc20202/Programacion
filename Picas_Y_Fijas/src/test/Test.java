package test;

import java.util.Scanner;
import model.Game;
import model.Number;
 
public class Test{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Game game1 = new Game();
		
		int[] num1;
		num1 = new int[4];
		int[] num2;
		num2 = new int[4];
		
		String validate1 = "";
		
		System.out.println(" PICAS Y FIJAS");
		System.out.println("Intrucciones: Usted debe adivinar un numero de 4 digitos, en las que se le irá informando el número de picas y fijas ");
		System.out.println("Numero de picas. ( las fijas son los dígitos que están en los dos números en la misma posición) ");
		System.out.println("Numero de fijas. (Las picas son los dígitos que están en los dos números, pero en diferente posición.) ");
		
		do{
			for(int i = 0; i < num1.length; i++) {			
					num1[i] = (int) (Math.random() * 9);		
					System.out.println("Ingrese el Dígito " + (i + 1));
					num2[i] = scanner.nextInt();
			}
			
			game1.setNumberA(num1);
			game1.setNumberB(num2);
			
			
			
			if(game1.validateNumber() == true) {
				System.out.println("El número que ingreso cuenta con digitos repetidos \nPor favor ingrese un número distinto ");
			}
			
		}while(game1.validateNumber() == true);
		

		
		System.out.println("resultados ");
		
		if(game1.valitateEquals()) {
			validate1 = "validos";
		}else {
			validate1 = "invalidos";
			}
		
		System.out.println("resultados son " + validate1);
		System.out.println("Hay " + game1.validateFijas() + " Fijas");
		System.out.println("Hay " + game1.validatePicas() + " Picas");
		
	}
}