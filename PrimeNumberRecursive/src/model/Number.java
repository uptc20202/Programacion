package model;

public class Number {
	
	private int i;
	private boolean validate;
	
	public Number() {
		i = 2;
	}
	
	public boolean calculatePrime(int number){
		  
		
		if( i != number){

			if((number % i) == 0) {
				System.out.println("false");
				validate = false;
				
			}else {
				i++;
				calculatePrime(number);
			}	 
			
		}else {
			validate = true;
		}
 
		return validate;
	}	  
	
}
