package model;

public class Number{
	

	private static final int NUMBER_CORRECT = 19;
			
	public boolean meetNumber(int dataIn) {		
		boolean meet = false;
		if(dataIn == NUMBER_CORRECT){
			meet = true;
		}
		return meet;
	}
	

}
