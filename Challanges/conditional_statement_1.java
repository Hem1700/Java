import java.lang.*;
import java.util.*;

public class conditional_statement_1 {

    public static void main (String args[]){

        /* Challanges
         * 1. Find if a number is odd or even
         * 2. Find a person is young or not yong
         * 3. Find grades for given marks
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a choice \n 1. To find if the number is odd or even. \n 2. To find if the person is young or not \n 3. To find grades for a given marks.");
         int choice = sc.nextInt();
         switch(choice){
            case 1: 
                System.out.println("Enter a number to check if it is odd or even");
                int number = sc.nextInt();
                if (number % 2 == 0){
                    System.out.println(number + " is even");
                }
                else {
                    System.out.println(number + " is odd");
                }
                break;
            case 2:
                System.out.println("Enter your age.");
                int age = sc.nextInt();
                if (age > 18){
                    System.out.println("You are old");
                }  
                else {
                    System.out.println("You are young");
                }
                break;

            case 3:
                System.out.println("Enter your marks to caculate your grades.");
                int marks = sc.nextInt();
                if (marks > 90 && marks < 100){
                    System.out.println("Your grade is 'A'");
                }
                if (marks > 75 && marks < 90 ){
                    System.out.println("Your grade is 'B'");
                }
                if (marks > 50 && marks < 75){
                    System.out.println("Your grade is 'C'");
                }
                if (marks < 50)
                {
                    System.out.println("Your grade is 'D'");
                }
                break;

         }
                 

        
    }
    
}
