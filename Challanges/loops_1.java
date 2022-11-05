import java.lang.*;
import java.util.*;

public class loops_1 {

    public static void main (String args[]){

        /* Challanges
         * 1. Display Multiplication Table
         * 2. Find Sum of n Numbers
         * 3. Factorial of a Number
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a choice \n 1. Display Multiplication Table\n 2. Find Sum of n Numbers\n 3. Factorial of a Number");
        int choice = sc.nextInt();
        switch (choice){
            case 1: 
                System.out.println("Enter the number to find its multiplication Table.");
                int number = sc.nextInt();
                System.out.println("Enter the multiplication table limit");
                int limit = sc.nextInt();
                System.out.println("Multiplication Table of " + number);
                for (int i = 1; i<=limit; i++){
                    System.out.println(number + "x" + i +  " = " + i*number);
                }
                break;
            case 2: 
                System.out.println("Enter Limit");
                int sum_limit = sc.nextInt();
                System.out.println("Enter numbers to find their sums");
                int sum = 0;
                for (int i = 1; i <=sum_limit; i++){
                    int number1 = sc.nextInt();
                    sum = sum+ number1;
                }
                System.out.println("Sum of "+ sum_limit + " number is " + sum);
                break;
            case 3:
                System.out.println("Enter a number to find its factorial");
                int factorial_number = sc.nextInt();
                int factorial = 1;
                for (int i = factorial_number; i >0; i--){
                    factorial = factorial*i;
                    
                }
                System.out.println("Factorial of "+ factorial_number + " is " + factorial);
                break;
            default: 
                System.out.println("Invalid Input. Try again.");
        }


    }
    
}
