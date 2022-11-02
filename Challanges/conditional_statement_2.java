import java.lang.*;
import java.util.*;


public class conditional_statement_2 {

    public static void main (String args[]){

        /* Challanges
         * 1. Find radix of a number given in a string.
         * 2. Find if a given year is a leap year
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice\n 1. To find radix of a number given in a string\n 2. Find if the given year is a leap year or not.");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter a number to check its radix");
                String number;
                number = sc.next();    
                if (number.matches("[01]+")){
                    System.out.println("It is a binary number");
                }  
               else if (number.matches("[0-7]+")){
                    System.out.println("It ia Octal Number");
                }
                else if (number.matches("[0-9]+")){
                    System.out.println("It is a decimal value");
                }
                else if (number.matches("-?[0-9a-fA-F]+")){
                    System.out.println("It is a hexadecimal value");
                }
    
                break;
            case 2: 
                System.out.println("Enter a year to check if it is leap year or not.");
                int year = sc.nextInt();
                if (year % 4 != 0){
                    System.out.println(year + " is not a leap year");
                }
                else if (year % 400 == 0){
                    System.out.println(year + " is a leap year");
                }
                else if (year % 100 == 0){
                    System.out.println(year + " is not a leap year");
                }
                else {
                    System.out.println(year + " is a leap year");
                }
                break;
        }
        

    }
    
}
