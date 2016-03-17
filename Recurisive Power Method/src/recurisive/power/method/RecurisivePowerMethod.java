/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurisive.power.method;

import java.util.Scanner;

/**
 *
 * @author zacha
 */
public class RecurisivePowerMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        double x, y;
        System.out.println("Enter a number to be raised to a power.");
        x = a.nextDouble();
        System.out.println("Enter the exponent to rase the base to.");
        y = a.nextDouble();
        System.out.println(x + " raised to the power of " + y + " is " + pow(x ,y));
    }
    
    
    public static double pow (double x, double y){
        if ( y  > 0){
            return x * pow(x, y-1);
        }else{
            return 1;
        }
    }
}
