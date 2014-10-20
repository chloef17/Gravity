/**
* 
* Determines the acceleration due to gravity at some distance
* from the center of the moon.  The distance is read as input
* from the user.
*
* @author <Chloe>
* @version <N/A>
*/

import java.util.Scanner;

public class MoonGravity {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      double G = 1.11e-11;
      double M = 7.3477e22;
      double accelGravity = 0.0;
      double distCenter   = 0.0;
      
      System.out.println("What is your distance from the center of the moon?");
      distCenter = scnr.nextDouble();
      
      accelGravity = (G*M)/(distCenter*distCenter);
      System.out.print("accelGravity: ");
      System.out.println(accelGravity);
   }
}
