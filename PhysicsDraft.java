/* 
  File: PhysicsDraft.java
  Author: Joshua Rabbani
  Purpose: An all-purpose physics calculator
  Funtions: 
    * Free fall
    * Projectiles
*/
import java.util.*;

public class PhysicsDraft {
  public static void main (String[] args) {
    // Commence free fall stuff? Let's try with methods
    freeFallResults();
  }
  private static void freeFallResults () {
    Scanner scan = new Scanner (System.in); 
    // Vf = Vi + a * t
    // Vf^2 = Vi^2 + 2a * d
    // d = Vi * t + 1/2 * a * t^2
    // v = d/t
    // a = -9.8m 
    double halfTripTime;
    System.out.print ("Initial Velocity?  Type NA if not known.");
    String initalVelocity = scan.nextLine(); 
    System.out.print ("Max height?  Type NA if not known.");
    String maxHeight = scan.nextLine(); 
    System.out.print ("Total trip time?  Type NA if not known.");
    String totalTime = scan.nextLine(); 
    if (!totalTime.equals("NA")) 
    halfTripTime = Double.parseDouble(totalTime)/2;
    System.out.print ("Final Velocity?  Type NA if not known.");
    String finalVelocity = scan.nextLine(); 
    
    if (initalVelocity.equals("NA")) {
      if (!finalVelocity.equals("NA")) initialVelocity = finalVelocity;
      if (!totalTime.equals("NA") && !maxHeight.equals("NA")) initialVelocity = ((Double.parseDouble(maxHeight))/(4.9 * halfTripTime * halfTripTime))/halfTripTime;
    }
    
  }
}
