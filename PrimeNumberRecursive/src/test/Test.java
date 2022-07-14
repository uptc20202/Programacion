package test;

import model.Number;

public class Test {
	
public static void main(String[] args) {
		
		System.out.println("caso 2a : "+(new Number().calculatePrime(19)?" OK ":" Error") + (new Number().calculatePrime(19)) );
	    System.out.println("caso 2b : "+(new Number().calculatePrime(25)==false?" OK ":" Error")+ (new Number().calculatePrime(19)) );
	    System.out.println("caso 2c : "+(new Number().calculatePrime(181)?" OK ":" Error"));
	    System.out.println("caso 2d : "+(new Number().calculatePrime(27)==false?" OK ":" Error"));

	}
	
}
