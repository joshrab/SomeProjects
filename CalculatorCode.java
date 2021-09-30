/* 
    CalculatorCode.java   Author: Joshua Rabbani
    
    Source code for basic calculatory functions. 
    Functions include: 
      * Addition
      * Subtraction
      * Division
      * Multiplication
      * Square root (possible any root)
      * Logarithms
      * x to the power of y
      * Squaring
*/
import java.util.Scanner; 
public class CalculatorCode {
  
  public static addNumbers(double a, double b) {
    
    Scanner scanDouble = new Scanner (System.in);
    a = scanDouble.nextDouble(); 
    b = scanDouble.nextDouble(); 
    
    return a+b; 
  }

  public static subtractNumbers(double a, double b) {
    
    Scanner scanDouble = new Scanner (System.in);
    a = scanDouble.nextDouble(); 
    b = scanDouble.nextDouble(); 
   
    return a-b; 
  }
    
  public static multiplyNumbers(double a, double b) {
   
    Scanner scanDouble = new Scanner (System.in);
    a = scanDouble.nextDouble(); 
    b = scanDouble.nextDouble(); 
   
    return a*b; 
  }
    
  public static divideNumbers(double a, double b) {
  
    Scanner scanDouble = new Scanner (System.in);
    a = scanDouble.nextDouble(); 
    b = scanDouble.nextDouble(); 
  
    return a/b; 
  }
    
  public static xPowOfy(double a, double b) {
  
    Scanner scanDouble = new Scanner (System.in);
    a = scanDouble.nextDouble(); 
    b = scanDouble.nextDouble(); 
   
    return Math.pow(a, b); 
  }
    
 }
}
