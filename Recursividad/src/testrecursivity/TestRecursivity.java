package testrecursivity;

	/**
	 * calcular la suma de los numeros entreos entre N y M, M>N
	 * ejemplo :
	 *     2 y 5  --> 2 + 3 + 4 + 5 = 14
	 * 1. estructuras de algoritmizacion de repeticion.
	 * 2. recursividad.
	 * 3. expresion matematica.
	 * 
	 * @author uptc
	 */
	public class TestRecursivity {
	     private int max;
	     private int min;

	    public TestRecursivity(int min, int max) {
	        this.max = max;
	        this.min = min;
	    }
	     
	    /**
	     * Calcula la suma de los numeros entre N y M , utilizando iteracion
	     * @return la suma de la serie ..
	     */
	    public int sum(){
	        // to do ..
	      return 0;
	    }
	     
	    /**
	     * Calcula la suma de los numeros entre N y M , utilizando recursividad
	     * @return la suma de la serie ..
	     */
	    public int sumR(){
	    	if(max > min) {  
	              return max + (sumR()-1);
	    	}

	    }

	    /**
	     * Calcula la suma de los numeros entre N y M , utilizando aritmetica 
	     * @return la suma de la serie ..
	     */
	    public int sumM(){
	        // to do ..
	      return 0;
	    }

	    /**
	     *   Opcion 1 : trabajo grupo  --> 30 minutos
	     *   Opcion 2 : individual.    --> 60 minutos
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        /*System.out.println("caso 1a : "+(new TestRecursivity(2,5).sum()==14?" OK ":" Error"));
	        System.out.println("caso 1b : "+(new TestRecursivity(3,3).sum()==3?" OK ":" Error"));
	        System.out.println("caso 1c : "+(new TestRecursivity(0,5).sum()==15?" OK ":" Error"));
	        System.out.println("caso 1d : "+(new TestRecursivity(-2,2).sum()==0?" OK ":" Error"));
	        System.out.println("caso 1e : "+(new TestRecursivity(5,3).sum()==12?" OK ":" Error"));
	        System.out.println("caso 1f : "+(new TestRecursivity(-5,-3).sum()==-12?" OK ":" Error"));
	        */
	        System.out.println("caso 2a : "+(new TestRecursivity(2,5).sumR()==14?" OK ":" Error"));
	        System.out.println("caso 2b : "+(new TestRecursivity(3,3).sumR()==3?" OK ":" Error"));
	        System.out.println("caso 2c : "+(new TestRecursivity(0,5).sumR()==15?" OK ":" Error"));
	        System.out.println("caso 2d : "+(new TestRecursivity(-2,2).sumR()==0?" OK ":" Error"));
	        System.out.println("caso 2e : "+(new TestRecursivity(5,3).sumR()==12?" OK ":" Error"));
	        System.out.println("caso 2f : "+(new TestRecursivity(-5,-3).sumR()==-12?" OK ":" Error"));
	        /*
	        System.out.println("caso 3a : "+(new TestRecursivity(2,5).sumM()==14?" OK ":" Error"));
	        System.out.println("caso 3b : "+(new TestRecursivity(3,3).sumM()==3?" OK ":" Error"));
	        System.out.println("caso 3c : "+(new TestRecursivity(0,5).sumM()==15?" OK ":" Error"));
	        System.out.println("caso 3d : "+(new TestRecursivity(-2,2).sumM()==0?" OK ":" Error"));
	        System.out.println("caso 3e : "+(new TestRecursivity(5,3).sumM()==12?" OK ":" Error"));
	        System.out.println("caso 3f : "+(new TestRecursivity(-5,-3).sumM()==-12?" OK ":" Error"));
*/
	    }
	    
	}


