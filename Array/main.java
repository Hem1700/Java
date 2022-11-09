import java.lang.*;
import java.util.*;

public class main {

  
    public static void main (String args []){

    /* Arrays */
    // Initializing Array methods
    int A[] = new int[5]; // creation of array
    System.out.println(A.length);
    int B[] = {2,4,6,8,10};
    int []C = new int [5];
    int[] D = new int[10];

    // Accessing elements of array
    for(int i = 0; i<5;i++){
        System.out.println(B[i]); 
    }

    for (int j = B.length-1; j>=0; j--){
        System.out.println(B[j]);
    }
    for(int x: B){
        System.out.println(x);
    }
    }

    
}
