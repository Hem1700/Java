import java.lang.*;
import java.util.*;

public class array_2 {

    public static void main (String args []){

        /* Challange
         * 1. Rotating an Array
         * 2. Inserting an Element
         * 3. Deleting an Element
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Given an array: \n [5,9,6,10,12,7,3,5,4,2]\n Enter your choice\n 1. Rotating an Array\n 2. Inserting an Element\n 3. Deleting an Element");
        int choice = sc.nextInt();
        int array[] = {5,9,6,10,12,7,3,5,4,2};
        switch(choice){
            case 1:
                System.out.println("Enter your choice:\n L. Left Rotation\n R. Right Rotation");
                String rotation = sc.next();
                switch(rotation){
                case "L":
                    System.out.println("Enter your step");
                    int left_step = sc.nextInt();
                    for(int i = 0; i<left_step; i++){
                        int j , first;
                        first = array[0];
                        for (j=0; j<array.length-1; j++){
                            array[j] = array[j+1];
                        }
                        array[j] = first;
                        
                    }
                    System.out.println("Left shifted Array");
                    System.out.print("[");
                    for(int x:array){
                        System.out.print(x + " ");
                    }
                    System.out.print("]");
                    break;
                
                case "R":
                    System.out.println("Enter your step");
                    int right_step = sc.nextInt();
                    for(int i = 0; i<right_step; i++){
                        int k , last;
                        last = array[array.length-1];
                        for (k=array.length-1; k>0; k--){
                            array[k] = array[k-1];
                        }
                        array[0] = last;                        
                    }
                    System.out.println("Left shifted Array");
                    System.out.print("[");
                    for(int x:array){
                        System.out.print(x + " ");
                    }
                    System.out.print("]");
                    break;
                }
                break;
            
            case 2:
                System.out.println("Enter the element to add to the existing array: ");
                int element = sc.nextInt();
                System.out.println("Enter the position to add the element from " + 0 + " to " + array.length);
                int position = sc.nextInt();
                int new_array[] = new int [array.length+1];
                int j = 0;
                for (int i = 0; i<new_array.length;i++){
                    if (i == position){
                        new_array[position]  = element;
                    }
                    else {
                        new_array[i] = array[j];
                        j++;
                    }
                    
                   
                }
                new_array[position] = element;
                
                for (int x:new_array){
                    System.out.println(x);
                }
                break;
            

            case 3:
                System.out.println("Enter the element to delete from the existing array: ");
                int element_1 = sc.nextInt();
                int position_1 = 0;
                for (int i = 0; i<array.length; i++){
                    if (element_1 == array[i]){
                        position_1 = i;
                        break;
                    }
                    else{
                        System.out.println("Element not present");
                        break;
                    } 
                }
                for(int i = 0; i<1; i++){
                    int z , first_position;
                    for (z=position_1+1; z<array.length-1; z++){
                        array[z] = array[z+1];
                    }
                   
                    
                }
                for(int y:array){
                    System.out.print(y + "");
                }
                
                    
                
                // for (int x:new_array){
                //     System.out.println(x);
                // }
                break;
                
            
            }
    }
    
}
