package model;

public class PrimeNumber {
	
	public boolean calculatePrime(int number){
		  int i = 2;
		  boolean primo=true;
		  while ((primo) && (i!=number)){
		    if (number % i == 0)
		      primo = false;
		    i++;
		  }
		  return primo;
		}

}
