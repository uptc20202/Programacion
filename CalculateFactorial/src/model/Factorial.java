package model;

public class Factorial {
	
	public int factorial(int x) {
		if (x < 0) {
			return 0;
		}
 
		int factorial = 1;
 
		while (x > 1) {
			factorial = factorial * x;
			x = x - 1;
		}
 
		return factorial;
	}
}
