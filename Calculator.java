/*
    File: Calculator.java
    Author: Joshua Rabbani
    Purpose:
        * adds
        * subtracts
        * mutliplies
        * divides
        * sqrts
 */
import java.util.Scanner; // Imports Scanner class

public class Calculator {
    public static void main (String[] args) {

        //The for loop here is what causes the program to not stop, unless commanded to by the user
        // It will loop while var i != 0.
        for (int i = 0; i != 1;) {
            Scanner scan = new Scanner (System.in); // Creates new scanner instance
            System.out.print ("Please select an option from the menu:" +
                    "\n\t\"1\" - addition" +
                    "\n\t\"2\" - subtraction" +
                    "\n\t\"3\" - multiplication" +
                    "\n\t\"4\" - division" +
                    "\n\t\"5\" - sqrt \n> ");
            // After listing the menu, the code will try to receive user input in the form of an
            // integer. If it does not receive an integer, the catch will iniatate and tell the
            // user to enter a integer on the menu. Then, they can choose to restart the program
            try {
                int input = scan.nextInt(); // Initializing input var with an integer from the
                // Functions 1 - 4 require two inputs, so if 1 - 4 is selected, we collect both i
                // inputs before the calculations.
                if (input == 1 || input == 2 || input == 3 || input == 4) {
                    System.out.print("Enter first number: \n> ");
                    double a = scan.nextDouble();
                    System.out.print("Enter second number: \n> ");
                    double b = scan.nextDouble();
                    // Nested if statement does the calculation for each function that requires two inputs
                    if (input == 1) {
                        System.out.println("" + a + " + " + b + " = " + (a + b));
                    } else if (input == 2) {
                        System.out.println("" + a + " - " + b + " = " + (a - b));
                    } else if (input == 3) {
                        System.out.println("" + a + " * " + b + " = " + (a * b));
                    } else if (input == 4) {
                        System.out.println("" + a + " / " + b + " = " + (a / b));
                    }
                // If the input is 5, it only requires one input and we can list it separately
                } else if (input == 5) {
                    // Collects the input
                    System.out.print("Enter number: \n> ");
                    double a = scan.nextDouble();
                    // Uses methods from the math class to find the square root of a
                    System.out.println("The square root of " + a + " = " + Math.sqrt(a));
                // User entered an integer not between 1 and 5, so code gives direction on
                // how to amend the mistake.
                } else {
                    System.out.println("Please enter an integer value from the menu (1, 2, 3, 4, or 5).");
                }
            // Catch for the original try, which will activate if the user inputs anything but
            // an integer for the original input var, and anything but a double for the following
            // a and b vars. Gives direction on how to amend the mistake
            } catch (Exception e) {
                System.out.println ("ERROR: Please enter an integer value from the menu to start the prorgam (1, 2, 3, 4, or 5)" +
                        "\nOnly input numbers for your calculations.");
            }
                // Another for loop to determine whether or not the program will continue based on user
                // input. p is set = 0, and while it's less than 1 the code block will loop.
                for (int p = 0; p < 1;) {
                    System.out.print("Go again? 1 for yes, 2 for no. \n> ");
                    Scanner scanLine = new Scanner(System.in);
                    // Declaring goAgain var as a String and accepting String input because I don't
                    // want to use another "try/catch" here.
                    String goAgain = scanLine.nextLine();
                    if (goAgain.equals("1")) {
                        p = 1;
                        // p = 1; this for loop ends (for now, it'll start again after the next calculation)
                        // larger one continues.
                    } else if (goAgain.equals("2")) {
                        p = 1;
                        // This for loop ends
                        i = 1;
                        // Larger for loop ends, too, program is exited
                    } else {
                        System.out.println("Please enter either 1 or 2 to continue or quit the program.");
                        // User did not input a valid response, this code block repeats until they do.
                    }
                }

      }
    }
}
