package VariablesAndDatatypes;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[]args){
        Scanner UserInput = new Scanner(System.in);
//        System.out.println("Type your name");
//        String message = UserInput.nextLine();
//        System.out.println("Hello " + message);
        
        System.out.println("Type the first number");
        int Num1 = UserInput.nextInt();
        System.out.println("Type the second  number");
        int Num2 = UserInput.nextInt();
        int sum = Num1 + Num2;
        int product = Num1 * Num2;
        int difference = Num1 - Num2;
        int quotient = Num1 / Num2;
        System.out.println("The sum of " + Num1 + " + " + Num2 + " = " + sum);
        System.out.println("The product of " + Num1 + " * " + Num2 + " = " + product);
        System.out.println("The difference of " + Num1 + " - " + Num2 + " = " + difference);
        System.out.println("The quotient of " + Num1 + " / " + Num2 + " = " + quotient);


        
        
        
        
        
        
    }
    
}
