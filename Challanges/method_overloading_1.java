import java.lang.*;
import java.util.*;

public class method_overloading_1 {

    static double area(double l, double b)
    {
        return l*b;
    }

    static double area(double r)
    {
        return Math.PI * r * r;
    }

    static int reverse(int num)
    {
        int reverse = 0;
        while(num!=0){
            reverse = reverse * 10 + num%10;
            num = num/10;
        }
        return reverse;
    }

    static int[] reverse(int a[])
    {
        int b[] = new int[a.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++) 
        {
            b[j - 1] = a[i];
            j = j - 1;
        }
        return b;
    }


    static boolean validate(String name){

        return name.matches("[a-zA-z\\s]*");
   
    }
 
    static boolean validate(int age){
        if (age>=3 && age<=15){
            return true;
        }
        else 
            return false;

    }


    public static void main (String args[]){


        /* Challange
         * 1. Overloaded Method to calculate area
         * 2. Overload method to reverse an int or an array
         * 3. Overload method to validate name and age
         */

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your choice\n 1, Overloaded method to caclulate area\n 2. Overloaded method to reverse an integer or an array\n 3. Overloaded method to valideate name and age.");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter your choice\n R. Area of Rectangle\n C. Area of Circle");
                String choice1 = sc.next();
                switch(choice1){
                    case "R":
                        System.out.println("Area of a Rectangle");
                        System.out.println("Enter length and breadth");
                        Double l = sc.nextDouble();
                        Double b = sc.nextDouble();
                        System.out.println("Area of rectangle is: " + area(l, b));
                        break;
                    case "C":
                        System.out.println("Area of a Circle");
                        System.out.println("Enter radius");
                        Double r = sc.nextDouble();
                        System.out.println("Area of rectangle is: " + area(r));
                        break;
                    default:
                        System.out.println("Invalid Input. Try Again");
            
                }
                break;
            case 2:
                System.out.println("Enter your choice\n I. Reverse an Integer\n A. Reverse an Array");
                String choice2 = sc.next();
                switch(choice2){
                    case "I":
                        System.out.println("Enter an integer");
                        int i = sc.nextInt();
                        System.out.println("Reversed Integer is: " + reverse(i));
                        break;
                    case "A":
                        System.out.println("Enter the length of the array");
                        int length = sc.nextInt();
                        int array_1[] = new int[length]; 
                        int reversed_array[] = new int[length];
                        System.out.println("Enter the elements of an array");
                        for (int j = 0;j<length;j++){
                            array_1[j] = sc.nextInt();
                        }
                        reversed_array =  reverse(array_1);
                        System.out.println("Reversed Array:");
                        for(int k =0; k<length; k++){
                            System.out.println(reversed_array[k]);
                        }
                        break;
                    default:
                        System.out.println("Invalid Input. Try Again");
            
                }
                break;
            case 3:
                System.out.println("Enter your choice\n N. Validate a name\n Age. Validate an age");
                String choice3 = sc.next();
                switch(choice3){
                    case "N":
                        System.out.println("Enter a name");
                        String name = sc.next();
                        System.out.println(validate(name));
                        break;
                    case "Age":
                        System.out.println("Enter an age");
                        int age = sc.nextInt();
                        System.out.println(validate(age));
                        break;
                       
                    default:
                        System.out.println("Invalid Input. Try Again");
                }
                break;
            default:
                System.out.println("Invalid Input. Try Again");

        }
                   
                
        
    }



}