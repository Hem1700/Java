import java.lang.*;
import java.util.*;


public class variable_argument_1 {


    /* Challange
     * 1. Maximum numbers using varargs
     * 2. Sum of all elements using varargs
     * 3. Calculate discount using varargs
     */

    static void max(int ...x){
        int max = 0;
        for(int a:x){
            if(a>max){
                max = a;
            }
        }
        System.out.println("Maximum Number is: " + max);
    }

    static void sum(int ...x){
        int sum = 0;
        for(int a:x){
            sum = sum+a;
        }
        System.out.println("Sum of elements is: " + sum);
    }

    static void discount(int ...x){
        int discount = 0;
        for(int a:x){
            discount = ((10*a)/100);
            System.out.println("Discount for " + a + " is " + discount);
        }
    }




    public static void main (String args[]){
        
        max(10,20,30,40);
        sum(10,20,30,40);
        discount(10,20,30,40);

    }
    
}
