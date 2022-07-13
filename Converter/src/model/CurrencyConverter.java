package model;

public class CurrencyConverter {
	private static final double DOLLAR_VALUE = 0.00027;
	private static final double EURO_VALUE = 0.00023;
	private static final double POUND_VALUE = 0.00020;
	private static double colombianPeso;
	
	public static void setColombianPeso(double p) {
		colombianPeso = p;
	}
	
	public static double CalculateValue(String n) {
		double value = 0;
		
		switch(n){
			case "d":
				value = colombianPeso*DOLLAR_VALUE;
				break;
			case "e":
				value = colombianPeso*EURO_VALUE;
				break;
			case "p":
				value = colombianPeso*POUND_VALUE;
			default:
				value = -1;
		
		}
		return value;
	}
}
