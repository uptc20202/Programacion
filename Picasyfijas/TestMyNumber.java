/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picayfijas;

/**
 *
 * @author uptc
 */
public class TestMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("Caso 1a : "+ (new MyNumber(12345).digits()==5?"OK":"ERROR"));
          System.out.println("Caso 2b : "+ (new MyNumber(0).digits()==1?"OK":"ERROR"));
          System.out.println("Caso 3c : "+ (new MyNumber(1).digits()==1?"OK":"ERROR"));
          System.out.println("Caso 4d : "+ (new MyNumber(10).digits()==2?"OK":"ERROR"));
          System.out.println("Caso 5e : "+ (new MyNumber(9).digits()==1?"OK":"ERROR"));
          System.out.println("Caso 6f : "+ (new MyNumber(1234567890).digits()==10?"OK":"ERROR"));
          //System.out.println("Caso 7 : "+ (new MyNumber(1234567890123).digits()==10?"OK":"ERROR"));
          // Aun faltan casos de pueba 
          
          System.out.println("Caso 1b : "+ (new MyNumber(111).isDigitsRepeats()?"OK":"ERROR"));
          System.out.println("Caso 2b : "+ (!new MyNumber(123).isDigitsRepeats()?"OK":"ERROR"));
          System.out.println("Caso 3b : "+ (new MyNumber(10981).isDigitsRepeats()?"OK":"ERROR"));
          
          System.out.println("Caso 1c : "+ (!new MyNumber(111).isValid(3)?"OK":"ERROR"));
          System.out.println("Caso 2c : "+ (!new MyNumber(123).isValid(6)?"OK":"ERROR"));
          System.out.println("Caso 3c : "+ (!new MyNumber(10981).isValid(5)?"OK":"ERROR"));
          System.out.println("Caso 4c : "+ (new MyNumber(12345).isValid(5)?"OK":"ERROR"));
          
          // picas ...
          
          // fijas ...
          
    }
}
