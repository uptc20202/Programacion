package model;

public class Number {
   private int number1;
   private int number2;
   
   public Number(int num1, int num2){
       number1 = num1;
       number2 = num2;
   }
   public String calculateMultiple(){
       String multiple = "";
       multiple = number1%number2==0?"Si es multiplo ":"No es multiplo ";
       
       return multiple;
   }
}
