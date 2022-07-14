package model;

public class Number {
	
	private int numberFinal;//parametro que nos guardara el numero que indica si el valor ingresado es un digito magico
	
//Este metodo valida si el número es o no es magico
//(un numero es magico si la suma de sus dígitos recursivamente es 1, en caso contrario no es magico )
	public boolean validate(int number) {
		
		if(numberApart(number) == 1) {
			return true;
		}
		
		return false;
	}
	
//Este metodo realiza la suma recursivamente de los dígitos del número ingresao 	
	public int numberApart(int number) {
		int n1 = 0; //asignamos este parametro para poder dar valor de 0 al parametro numberFinal en el segundo if y no presente problemas para ejecutar el primero 
		
		if(number > 0) { 
			numberFinal = (number % 10) + numberFinal; //realizamos suma recursiva
            number = number/10; //Realizamos divición para conocer cada uno de los digitos que conforman el número ingresado
			numberApart(number); 
			n1 = numberFinal; //asinamos el valor de numberFinal a n1 para poder utilizarlo en el siguiente if
		}
		
//Este metodo valida si el número entregado del if anterior contiene mas de 2 digitos lo cual indicaria que debemos operarlo nuevamente hasta contar con un número conformado por solo un digito		
		if(n1 > 9 && number == 0) { 
			numberFinal = 0;
			numberApart(n1);
		}

		return numberFinal;

	}

}
