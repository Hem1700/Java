import java.lang.*;
import java.util.*;


public class method_1 {

    static boolean prime(int x){
        for(int i=2;i<x;i++){
            if (x%i==0){
                return false;
            }
        }
        return true;

        }


    static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    static int max(int A[]){
        int max = 0;
        for(int i = 0;i<A.length;i++){
            if (max<A[i]){
                max = A[i];
            }
        }
        return max;
    }


    public static void main (String args[]){

        /* Challange
         * 1. Find if a number is prime
         * 2. Find GCD of 2 numbers
         * 3. Find the Max element in an array
         */

        Scanner sc = new Scanner(System.in);
        int A[] = {2,3,4,5,6};
        System.out.println("Enter your choice\n 1. Find if a number is prime\n 2. Find GCD of 2 numbers\n 3. Find max element in an array");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter a number to check if it is prime or not.");
                int number_1 = sc.nextInt();
                Boolean is_prime;
                is_prime = prime(number_1);
                if (is_prime == true){
                    System.out.println(number_1 + " is a prime number");
                }
                else {
                    System.out.println(number_1+ " is not a prime number");
                }
                break;
            case 2:
                System.out.println("Enter two number to find their GCD");
                int number_2 = sc.nextInt();
                int number_3 = sc.nextInt();
                int GCD = gcd(number_2, number_3);
                System.out.println("GCD of " + number_2 + " and " + number_3 + " is " + GCD);
                break;

            case 3:
                System.out.println("Enter the size of an array");
                int length = sc.nextInt();
                int array_1[] = new int[length]; 
                System.out.println("Enter the elements of an array");
                for (int i = 0;i<length;i++){
                    array_1[i] = sc.nextInt();
                }
                System.out.println("The greatest element from the given array is " + max(array_1));


        }
    }
    
}



