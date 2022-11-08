import java.lang.*;
import java.util.*;

public class loops_3 {
    
    public static void main (String args[]){

       /* Challange
        * Display a number in words even with tailing 0
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to display it in words.");
        int number  = sc.nextInt();
        String str = "";
        while (number > 0){
            int digit = number % 10;
            number = number / 10; 
            str = str + digit;
        }
        //System.out.println(str);
        for (int i = str.length() - 1 ; i>= 0; i--){
            char c = str.charAt(i);
            switch (c){
                case '0': 
                    System.out.print("Zero\t");
                    break;
                case '1': 
                    System.out.print("One\t");
                    break;
                case '2': 
                    System.out.print("Two\t");
                    break;
                    case '3': 
                    System.out.print("Three\t");
                    break;
                case '4': 
                    System.out.print("Four");
                    break;
                case '5': 
                    System.out.print("Five\t");
                    break;
                case '6': 
                    System.out.print("Six\t");
                    break;
                case '7': 
                    System.out.print("Seven\t");
                    break;
                case '8': 
                    System.out.print("Eight\t");
                    break;
                case '9': 
                    System.out.print("Nine\t");
                    break;
            }
        }


    }



}
