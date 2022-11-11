import java.lang.*;
import java.util.*;

public class array_1 {

    public static void main (String args []){

        /* Challanges
         * 1. Finding sum of all elements
         * 2. Searching an element
         * 3. Finding maximum element
         * 4. Finding second largest Element
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice\n 1. Finding sum of all elements\n 2. Searching an element\n 3. Finding maximum element\n 4. Finding second largest Element");
        int choice = sc.nextInt();
        switch(choice){

            case 1:
                System.out.println("Enter the length of an array");
                int length = sc.nextInt();
                int sum = 0;
                int array_1[] = new int[length]; 
                System.out.println("Enter the elements of an array");
                for (int i = 0;i<length;i++){
                    array_1[i] = sc.nextInt();
                }
                System.out.println("Elements of array are: ");
                System.out.print("[");
                for(int x:array_1){
                    System.out.print(x + ",");
                }
                System.out.print("]");
                System.out.println();
                System.out.println("Adding the elements of an array.........");
                for(int x:array_1){
                    sum = sum + x;
                }
                System.out.println("Sum:" + " " + sum);
                break;

            case 2:
                System.out.println("Enter the length of an array");
                int length_1 = sc.nextInt();
                int array_2[] = new int[length_1]; 
                int flag = 0;
                System.out.println("Enter the elements of an array");
                for (int i = 0;i<length_1;i++){
                    array_2[i] = sc.nextInt();
                }
                System.out.println("Elements of array are: ");
                System.out.print("[");
                for(int x:array_2){
                    System.out.print(x + ",");
                }
                System.out.print("]");
                System.out.println();
                System.out.println("Enter a number to find from the array");
                int search_number = sc.nextInt();
                for(int x:array_2){
                    if (x == search_number){
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1){
                    System.out.println(search_number + " is present in the array");
                }
                else{
                    System.out.println(search_number + " is not present in the array");
                }
                break;
                
            case 3:
                System.out.println("Enter the length of an array");
                int length_2 = sc.nextInt();
                int largest = 0;
                int array_3[] = new int[length_2]; 
                System.out.println("Enter the elements of an array");
                for (int i = 0;i<length_2;i++){
                    array_3[i] = sc.nextInt();
                }
                System.out.println("Elements of array are: ");
                System.out.print("[");
                for(int x:array_3){
                    System.out.print(x + ",");
                }
                System.out.print("]");
                System.out.println();
                for(int i = 0; i<length_2; i++){
                    if (array_3[i] > largest){
                        largest = array_3[i];
                    }
                }
                System.out.println("Largest:" + " " + largest);
                break;
                
            case 4:
                System.out.println("Enter the length of an array");
                int length_3 = sc.nextInt();
                int array_4[] = new int[length_3]; 
                System.out.println("Enter the elements of an array");
                for (int i = 0;i<length_3;i++){
                    array_4[i] = sc.nextInt();
                }
                int secondlargest ,largest_1;
                secondlargest = largest_1 = array_4[0];
                System.out.println("Elements of array are: ");
                System.out.print("[");
                for(int x:array_4){
                    System.out.print(x + " ");
                }
                System.out.print("]");
                System.out.println();
                for(int i = 0; i<length_3; i++)
                {

                    if (array_4[i] > largest_1){
                        secondlargest = largest_1;
                        largest = array_4[i];
                    }
                    else if(array_4[i] > secondlargest){
                        secondlargest = array_4[i];
                    }
                }
                System.out.println("Second Largest:" + " " + secondlargest);
                break;
                
        }


    }
    
}
