import java.lang.*;
import java.util.*;


public class loops_4 {

    public static void main (String args []){

        /* Challange
         * 1. Display AP Series
         * 2. Display GP Series
         * 3. Display Fibonacci Series
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: \n1. Display AP Series \n2. Display GP Series \n3. Display Fibonacci Series");
        int choice = sc.nextInt();
        switch (choice){
            case 1: 
                System.out.println("------------------------------------------------------------------");
                System.out.println("Arithmetic Progression");
                System.out.println("------------------------------------------------------------------");
                System.out.println("Enter the first number 'a'");
                int a = sc.nextInt();
                System.out.println("Enter the common difference 'd'");
                int d = sc.nextInt();
                System.out.println("Enter the last digit 'n'");
                int n = sc.nextInt();
                int current_term = a;
                for (int i = 1; i<=n; i++){
                    System.out.println(current_term);
                    current_term = current_term + d;
                }
                break;
            case 2: 
                System.out.println("------------------------------------------------------------------");
                System.out.println("Geometric Progression");
                System.out.println("------------------------------------------------------------------");
                System.out.println("Enter the first number 'b'");
                int b = sc.nextInt();
                System.out.println("Enter the common ratio 'r'");
                int r = sc.nextInt();
                System.out.println("Enter the last digit 'x'");
                int x = sc.nextInt();
                int term;
                for (int i = 0; i < x; i++){
                    term = b * (int)Math.pow(r, i);
                    System.out.println(term);
                }

                break;
            case 3: 
                System.out.println("------------------------------------------------------------------");
                System.out.println("Fibonacci Series");
                System.out.println("------------------------------------------------------------------");
                int num1 = 0, num2 = 1, num3, count;
                System.out.println("Enter the limit of Fibonacci Series");
                count = sc.nextInt();
                System.out.println(num1);
                System.out.println(num2);
                for (int i = 2; i<count ; i++){
                    num3 = num1 + num2;
                    System.out.println(num3);
                    num1 = num2;
                    num2 = num3;
                }
                break;
            default:
                System.out.println("Invalid Input. Try again");
        }


    }
    
}
