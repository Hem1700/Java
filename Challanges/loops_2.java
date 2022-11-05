import java.lang.*;
import java.util.*;

public class loops_2 {

    public static void main (String args[]){

        /* Challanges
         * 1. Display Digits
         * 2. Count digits of a Number
         * 3. Finding if a nymber is Armstrong or not
         * 4. Reverse a number
         * 5. Check a number is palindrome
         */

         Scanner sc = new Scanner (System.in);
         System.out.println("Enter your choice\n 1. Display Digits \n 2. Count digits of a Number\n 3. Finding if a nymber is Armstrong or not\n 4. Reverse a number\n 5. Check a number is palindrome ");
         int choice = sc.nextInt();
         switch (choice){
            case 1:
                System.out.println("Enter a number to display its digit");
                int number_1 = sc.nextInt();
                int length = String.valueOf(number_1).length();
                for(int i= 1; i<=length; i++){
                    int digit = number_1%10;
                    System.out.println(digit);
                    number_1  = number_1 /10;
                }
               
                break;
            case 2:
                System.out.println("Enter a number to count its digits");
                int number_2 = sc.nextInt();
                int count = 0;
                while (number_2 != 0){
                    int digit_2 = number_2 %10;
                    count++;
                    number_2 = number_2/10;
                }
                System.out.println("It is a " + count+ " digit number.");


                break;
            case 3:
                System.out.println("Enter a number to check if it is an Armstrong number");
                int number_3 = sc.nextInt();
                int new_number1 = number_3;
                int new_number = 0;
                while (new_number1!=0){
                    int digit_3 = new_number1 % 10;
                    new_number = new_number + (digit_3*digit_3*digit_3);
                    new_number1 = new_number1/10;
                }
                if (new_number == number_3){
                    System.out.println(number_3 + " is an Armstrong number");
                }
                else{
                    System.out.println(number_3 + " is not an Armstrong number");
                }
                break;
            case 4:
                System.out.println("Enter a number to reverse it.");
                int number_4 = sc.nextInt();
                int new_number2 = number_4;
                int reverse_number = 0;
                while (number_4!=0){
                    int digit_4 = number_4 %10;
                    reverse_number =reverse_number*10 + digit_4;
                    number_4 = number_4/10;

                }
                System.out.println("The reversed of " + new_number2 + " is " + reverse_number);
                break; 
            case 5:
                System.out.println("Enter a number to check if it is palindrome");
                int number_5 = sc.nextInt();
                int new_number3 = number_5;
                int reverse_number1 = 0;
                while (new_number3 !=0){
                    int digit_5 = new_number3 %10;
                    reverse_number1 =reverse_number1*10 + digit_5;
                    new_number3 = new_number3/10;
                }
                if (reverse_number1 == number_5){
                    System.out.println(number_5 + " is a palindrome number");
                }
                else{
                    System.out.println(number_5 + " is not a palindrome number");
                }
                break;
            default:
                System.out.println("Invalid Input. Try Again.");
         }

    }
    
}
