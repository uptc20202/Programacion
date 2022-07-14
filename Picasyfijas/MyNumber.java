/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picayfijas;

/**
 * manejer las funcionalidades y reglas debe tener un numero
 * @author uptc
 * @date 25 06 2021
 */
public class MyNumber {
    private int value;

    /**
     * constrye un objeto de la clase nuymero, con un valor dado
     * @param value el valor que tenendra el objeto
     */
    public MyNumber(int value) {
        this.value = value;
    }
        
    
    /**
     * contar la cantidad de digitos que tiene el value
     * @return un valor entero correspondiente l # de digitos...
     */
    public int digits() {
        int cont = 1;  // inicializar contador en 1
        while (value >= 10) { // mientras numero sea mayor o igual a 10
            value /= 10;  //divido numero entre 10
            cont++; // incrementa contador
        }
        return cont; //retorne es contador
    }
    
    /**
     * detertmina si hay o no digitos repetdos en un numero
     * @return  true si hay digits o false si no los hay
     */
    public boolean isDigitsRepeats(){
        // to do
        return false;
    }
    
    /**
     * determian si el valor es valido para el juego
     * @param size el tamaño que debe tener el numero para que sea valido
     * @return true si es valido  o false si no lo es
     */
    public boolean isValid(int size){
       return !isDigitsRepeats() && digits()==size;
    }
    
    /**
     * calcula el numero de picas de l valor actual con  respeto al numero parametro
     * @param myNumber el numero a compara..
     * @return cantidad
     */
    public int picas(MyNumber myNumber){
      // to do 
      
      return 0;
    }
    
    public int fijas(MyNumber myNumber) {
     // to do 
     return 0;
    }
}

