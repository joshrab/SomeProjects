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
  
  public static double addNumbers() {
    
    Scanner scanDouble = new Scanner (System.in);
    System.out.println ("Type the values you'd like to add.");
    double a = scanDouble.nextDouble(); 
    double b = scanDouble.nextDouble(); 
    
    return a+b; 
  }

  public static double subtractNumbers() {
    
    Scanner scanDouble = new Scanner (System.in);
    System.out.println ("Type the values you'd like to subtract.");
    double a = scanDouble.nextDouble(); 
    double b = scanDouble.nextDouble(); 
   
    return a-b; 
  }
    
  public static double multiplyNumbers() {
   
    Scanner scanDouble = new Scanner (System.in);
    System.out.println ("Type the values you'd like to multiply.");
    double a = scanDouble.nextDouble(); 
    double b = scanDouble.nextDouble(); 
   
    return a*b; 
  }
    
  public static double divideNumbers() {
  
    Scanner scanDouble = new Scanner (System.in);
    System.out.println ("Type the values you'd like to divide.");
    double a = scanDouble.nextDouble(); 
    double b = scanDouble.nextDouble(); 
  
    return a/b; 
  }
  
  public static double sqrtNumbers() {
  
    Scanner scanDouble = new Scanner (System.in);
    System.out.println ("Type the value you'd like to sqrt.");
    double a = scanDouble.nextDouble();  
     
    return Math.sqrt(a); 
     }
  public static double sqNumbers() {
  
    Scanner scanDouble = new Scanner (System.in);
    System.out.println ("Type the value you'd like to square.");
    double a = scanDouble.nextDouble();  
     
    return (a*a); 
     }
    
  public static double xPowOfy() {
  
    Scanner scanDouble = new Scanner (System.in);
    System.out.println ("Type the values you'd like to take the power of.");
    double a = scanDouble.nextDouble(); 
    double b = scanDouble.nextDouble(); 
   
    return Math.pow(a, b); 
  }
    
 
   public static void main (String[] args) {

      int i = 0;
      while (i == 0) {
      
         System.out.println("State the function you'd like to call. State HELP for a function list.");
         Scanner scanLine = new Scanner (System.in);
         String initialInput = scanLine.nextLine();
         String desiredFunction = initialInput.toUpperCase();
         
         
         if (desiredFunction.equals("HELP")) {
            System.out.println ("Functions include:\n" +
         "* 'ADDITION' \n" +
         "* 'SUBTRACTION'\n" +
         "* 'DIVISION'\n" + 
         "* 'MULTIPLICATION'\n" +
         "* 'SQRT'\n" +
         "* 'XPOWY'\n" +
         "* 'SQUARING'\n" + 
         "* 'QUIT'");
         } else if (desiredFunction.equals("ADDITION")) {
            System.out.println(addNumbers());
         } else if (desiredFunction.equals("SUBTRACTION")) {
            System.out.println(subtractNumbers());
         } else if (desiredFunction.equals("DIVISION")) {
            System.out.println(subtractNumbers());
         } else if (desiredFunction.equals("MULTIPLICATION")) {
            System.out.println(multiplyNumbers());
         } else if (desiredFunction.equals("SQRT")) {
            System.out.println(sqrtNumbers());
         } else if (desiredFunction.equals("SQUARING")) {
            System.out.println(sqNumbers());
         } else if (desiredFunction.equals("XPOWY")) {
            System.out.println(xPowOfy());
         } else if (desiredFunction.equals("QUIT")) {
            i = 1;
         } else {
            System.out.println ("System Error: Please enter the specified commands."); 
         }
       }  
            
   
   }
} 