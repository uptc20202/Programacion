package test;

import model.Number;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("caso 2a : "+(new Number().validate(50113)?" OK ":" Error"));
	    System.out.println("caso 2b : "+(new Number().validate(50114)==false?" OK ":" Error"));
	    System.out.println("caso 2c : "+(new Number().validate(1468)?" OK ":" Error"));
	    System.out.println("caso 2d : "+(new Number().validate(1469)==false?" OK ":" Error"));

	}
}
