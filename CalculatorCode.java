/*
    File: Calculator.java
    Author: Joshua Rabbani
    Purpose: Calculator
    Fucntions:
        * adds
        * subtracts
        * multiplies
        * divides
        * sqrts
        * natural log
        * custom base log
        ** NEW FUNCTION ** Allow the user to choose how many values to compute
 */
import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {

        //The for loop here is what causes the program to not stop, unless commanded to by the user
        // It will loop while var i equals 0.
        for (int i = 0; i == 0;) {
            i = 2;
            double a;
            double sum = 0;
            double difference = 0;
            double quotient = 0;
            double product = 1;
            Scanner scan = new Scanner (System.in); // Creates new scanner instance
            System.out.print ("Please select an option from the menu:" +
                    "\n\t\"1\" - addition (a + b + c...)" +
                    "\n\t\"2\" - subtraction (a - b - c...)" +
                    "\n\t\"3\" - multiplication (a * b * c...)" +
                    "\n\t\"4\" - division (a / b / c...)" +
                    "\n\t\"5\" - square root"  +
                    "\n\t\"6\" - natural logarithm" + 
                    "\n\t\"7\" - logarithms base whatever you want. ^.^ \n> " );

            // Lists menu, (tries to take) takes integer input from user
            // Catch initiates if an integer between 1 and 5 is not inputted

            try {
                int input = scan.nextInt(); // Collects user input
                if (input == 1 || input == 2 || input == 3 || input == 4) {
                    // Collects two doubles if the operation requires two
                    System.out.println("Enter the amount of numbers you will be computing.");
                    // User input the number of numbers they'd lke to calculate and each value for n num of nums
                    int n = scan.nextInt();
                    for (int j = 0; j < n; j++) {
                        System.out.println("Enter value " + (j + 1));
                        if (input == 1) { // Adding n nums
                           sum += scan.nextDouble();
                        } if (input == 2) { // Subtraction + division annoying, you need to ask for an original value
                            if (j == 0) {
                              difference = scan.nextDouble(); 
                            } else {
                              difference -= scan.nextDouble();
                            }
                        }
                        if (input == 3) {  // Multiplying n nums
                           product *= scan.nextDouble();
                        } if (input == 4) { // Dividing n times, first number has to be set by user
                            if (j == 0) {
                              quotient = scan.nextDouble();
                            } else {
                              quotient /= scan.nextDouble();
                            }
                        }
                    }

                    if (input == 1) { // User chose addition
                        System.out.println("The sum is " + sum);
                    } else if (input == 2) { // User chose subtraction
                        System.out.println("The difference is " + difference);
                    } else if (input == 3) { // User chose multiplication
                        System.out.println("The product is " + product);
                    } else { // User chose division
                        System.out.println("The quotient is " + quotient);
                    }
                    // For input 5/6, only one variable is necessary
                } else if (input == 5 || input == 6) {
                    System.out.print("Enter number: \n> ");
                    a = scan.nextDouble(); // Collects input

                    if (input == 5) { // User chose sqrt
                        System.out.println("The square root of " + a + " = " + Math.sqrt(a));
                    } else { // User chose natural log
                        System.out.println ("The natural log of " + a + " = " + Math.log(a));
                    }
                } else if (input == 7) { // User chose custom log
                     System.out.print("Please enter the base of the logarithm: \n> ");
                     double base = scan.nextDouble(); // Collects base of log
                     System.out.print("Please enter the value the logarithm will compute: \n> ");
                     a = scan.nextDouble(); // Collects the value the log base is computing
                     double ans = Math.log(a) / Math.log(base); // Some Euler thing to calculate custom logs. He's a smart dude. 
                     System.out.println("The log base " + base + " of " + a + " is = " + ans);

                } else { // User entered integer not between 1 and 5
                  System.out.println("Please enter an integer value from the menu (1, 2, 3, 4, 5, 6, or 7).");
                }

            } catch (Exception e) { // Activates if input is not an int, or if a and b are not doubles
                System.out.println ("ERROR: Please enter an integer value from the menu to start the program (1, 2, 3, " +
                        "4, 5, 6, or 7)" +
                        "\nOnly input numbers for your calculations.");
                scan.nextLine(); // ** AFTER CATCH ERROR: Clear inputs with .nextLine()!
            }
            while (i != 0 && i != 1) { // Allows user to do another calculation without rerunning
                System.out.print("Go again? 0 for yes, 1 for no. \n> ");
                // Try/catch goated.
                try {
                    i = scan.nextInt();
                } catch (Exception e) {
                    System.out.println ("ERROR: Type either 0 to continue the program or 1 to quit.");
                    i = 2; // GG fam it's done. i = 2 wil just make this loop repeat until the user quits or continues
                    scan.nextLine();

                }
            }

        }
    }
}
