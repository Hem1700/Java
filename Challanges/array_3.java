import java.lang.*;
import java.util.*;

public class array_3 {

    public static void main (String args[]){

        /* Challange
         * 1. Copying an Array
         * 2. Reverse Copying an Array
         * 3. Increasing Size of Array
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice\n 1. Copying an Array\n 2. Reverse Copying an Array\n 3. Increasing Size of Array");
        int choice = sc.nextInt();
        switch (choice){

            case 1:
                System.out.println("Enter the size of the array");
                int size_1 = sc.nextInt();
                int array_1[] = new int[size_1]; 
                int copy_array[] = new int[size_1];
                System.out.println("Enter the elements of the array");
                for(int i=0; i<size_1;i++){
                    array_1[i] = sc.nextInt(); 
                }
                // Copying the array
                for (int i = 0; i<size_1;i++){
                    copy_array[i] = array_1[i];
                }
                System.out.println("Copying the array......");
                for(int x:copy_array){
                    System.out.println(x);
                }
                break;
            
            case 2:
                System.out.println("Enter the size of the array");
                int size_2 = sc.nextInt();
                int array_2[] = new int[size_2]; 
                int reverse_copy_array[] = new int[size_2];
                int j = size_2;
                System.out.println("Enter the elements of the array");
                for(int i=0; i<size_2;i++){
                    array_2[i] = sc.nextInt(); 
                }
                // Copying the array
                for (int m= 0; m < size_2; m++) {
                    reverse_copy_array[j - 1] = array_2[m];
                    j = j - 1;
                }
                System.out.println("Printing the copied reverse array.....");
                for(int k = 0; k<size_2; k++ ){
                    System.out.println(reverse_copy_array[k]);
                }
                break;

            case 3:
                System.out.println("Enter the size of the array");
                int size_3 = sc.nextInt();
                int array_3[] = new int[size_3]; 
                System.out.println("Enter the elements of the initial array");
                // Taking value for the first array
                for(int i=0; i<size_3;i++){
                    array_3[i] = sc.nextInt(); 
                }
                System.out.println("Enter the value by which you want to increase the size of the array");
                int value = sc.nextInt();
                int new_length = size_3 + value;
                int increased_array[] = new int[new_length];

                // Copying values to the new array
                for (int i = 0; i<size_3;i++){
                    increased_array[i] = array_3[i];
                }
                System.out.println("The new array with incremented size......");
                // Printing the new array
                for(int i = 0; i<new_length; i++){
                    System.out.println(increased_array[i]);
                }


                 
                    
               
        }

    }
    
}
