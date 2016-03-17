
package recurisive.power.method;

import java.util.Scanner;

/**
 *
 * @author Zach Murphy
 */
public class RecurisivePowerMethod {


    
    //main method 
    public static void main(String[] args) {
        //scanner object
        Scanner a= new Scanner(System.in);
        //declarations 
        double x, y;
        //getting some variables from user and setting them with keyboard scanner
        System.out.println("Enter a number to be raised to a power.");
        x = a.nextDouble();
        System.out.println("Enter the exponent to rase the base to.");
        y = a.nextDouble();
        
        //output from recursion method
        System.out.println(x + " raised to the power of " + y + " is " + pow(x ,y));
    }
    
    //recursive method
    public static double pow (double x, double y){
        
        //setting calculations of power.
        if ( y  > 0){
            return x * pow(x, y-1);
        }else{
            return 1;
        }
    }
}
