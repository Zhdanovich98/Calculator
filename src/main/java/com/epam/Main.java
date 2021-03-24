package com.epam;

import java.util.Scanner;

public class Main{ 
    public static void printResult(Calculator calculator, Scanner scan){
            System.out.print("Result: ");
            System.out.println(calculator.calculate());
    }

    public static Calculator menu(Scanner scan){
        System.out.println("The following operations are available:");
        System.out.println("1) with one number");
        System.out.println("2) with two numbers");
        System.out.print("Select the type of operation: ");
        int choise = scan.nextInt();
        Calculator calc;
        System.out.println();
        switch (choise){
            case (1):
            System.out.println("The following operations are available:");
            System.out.println("1) sin");
            System.out.println("2) cos");
            System.out.println("3) sqrt");
            calc = new Calculator(scan, true); //isSingle == true
            return calc;

            case (2):
            System.out.println("The following operations are available:");
            System.out.println(" + (addition)");
            System.out.println(" - (subtraction)");
            System.out.println(" * (multiplication)");
            System.out.println(" / (division)");
            System.out.println(" % (percentage calculation)");
        
            calc = new Calculator(scan, false); //isSingle == false
            return calc;
            
            default:
            System.out.println("Incorrect input. Repeat one more time: ");    
            return menu(scan);     
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = menu(scan);
        printResult(calculator, scan);
        
    }   
}
