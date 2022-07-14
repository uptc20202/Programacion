package model;

public class Game {
	
		private Number numberA;
		private Number numberB;
		
		public void setNumberA(int[] n1) {
			numberA = new Number();
			this.numberA.setNumber1(n1);
		}
		
		public void setNumberB(int[] n1) {
			numberB = new Number();
			this.numberB.setNumber1(n1);
		}
		
		public boolean validateNumber() {

			int[] n2 = new int[4];
			boolean validate = false;
			
			n2 = numberB.getNumber1() ;
			
			for(int i = 0; i < 4; i++) {

				for(int j = 0; j < 4; j++) {
					if(i != j && n2[i] == n2[j]) {
						validate = true;
					}
				}
				
			}
			
			return validate;
		}
		
		
		public int validateFijas() {
			int[] n1 = new int[4];
			int[] n2 = new int[4];
			int fijas = 0;
			
			n1 = numberA.getNumber1() ;
			n2 = numberB.getNumber1() ;
			
			for (int i = 0; i < 4; i++) {
				if (n1[i] == n2[i]) {
					fijas = fijas + 1;
 
				}
			}
			
			return fijas;
		}
		
		public int validatePicas() {
			int[] n1 = new int[4];
			int[] n2 = new int[4];
			int picas = 0;
			
			n1 = numberA.getNumber1() ;
			n2 = numberB.getNumber1() ;
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < n1.length; j++) {
					if (n2[i] == n1[j]) {
						picas = picas + 1;
					}
				}
			}
			
			return picas;
					
		}
		
		public boolean valitateEquals() {
			if(numberA.getNumber1() == numberB.getNumber1()) {
				return true;
			}
		
			return false;
		}
		

		
		
}
