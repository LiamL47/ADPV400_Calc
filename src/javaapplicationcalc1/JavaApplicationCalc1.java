/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationcalc1;
import java.util.Scanner;
/**
 *
 * @author Liam
 */
public class JavaApplicationCalc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        
        int minus, n, menu, add, subtract, multiply;
        double divide;
        
        
        
        System.out.print("Specify first number:");
        minus = s.nextInt();
        System.out.print("Specify second number:");
        n = s.nextInt();
        
        while(true)
        {
            System.out.println("Select 1 for addition");
            System.out.println("Select 2 for subtraction");
            System.out.println("Select 3 for multiplication");
            System.out.println("Select 4 for division");
            System.out.println("Select 5 to Exit Calculator");
            menu = s.nextInt();
            
            switch(menu)
            {
                case 1:
                add = minus + n;
                System.out.println("Result:"+add);
                break;
 
                case 2:
                subtract = minus - n;
                System.out.println("Result:"+subtract);
                break;
 
                case 3:
                multiply = minus * n;
                System.out.println("Result:"+multiply);
                break;
 
                case 4:
                divide = (double)minus / n;
                System.out.println("Result:"+divide);
                break;    
 
                case 5:
                System.exit(0);
            }
        }
    }
    
}
