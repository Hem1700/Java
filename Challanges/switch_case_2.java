import java.lang.*;
import java.util.*;

public class switch_case_2 {

    public static void main (String args[]){

        /* Make a menu driven program for arithmetic Operations */
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:\n 1. ADD\n 2. SUB\n 3. MUL\n 4. DIV ");
        System.out.println("Enter two numbers");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("Enter your choice of operation from the above menu");
        String choice = sc.next();
        switch (choice){
            case "ADD":
               float sum =  num1 + num2;
               System.out.println(sum);
               break;
            case "SUB":
               float difference = num1 - num2;
               System.out.println(difference);
               break;
            case "MUL":
                float multiply = num1 * num2;
                System.out.println(multiply);
                break;
            case "DIV":
                float division = num1 / num2;
                System.out.println(division);
                break;
            default: 
                System.out.println("Invalid Input");
        }


    }
    
}
