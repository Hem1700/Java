import java.lang.*;
import java.util.*;

public class main {

    public static void main (String args[]){

        System.out.println("This is Program about 2D Array");
        
        // Creating an Array
        int A[][] = new int[3][4];  // first is rows and second is column. This is created inside heap
        int B[][] = {{1,2,3,4}, {2,4,6,8}, {3,5,7,9}};
        int C[][];
        C = new int[3][4];
        int []E[] = new int[5][5];
        int[] F, G[];
        // F is single dimensional array and G is 2D Array
 
        //Access the array
        System.out.println("B Array\n");
        for (int i =0; i<B.length; i++){
            for (int j =0; j<B[0].length; j++){
                System.out.print(B[i][j]+ " ");
            }
            System.out.println("\n");
        }
        System.out.println("A Array\n");
        // For each loop
        for(int x[]:A){
            for(int y: x){
                System.out.print(y+ " ");
            }
            System.out.println("\n");
        }

        // Created a jagged or ragged array
        int D[][];
        D = new int [3][];
        D[0] = new int[2];
        D[1] = new int[4];
        D[2] = new int[3];

        System.out.println("D Array\n");
        for (int i = 0; i<D.length; i++){
            for (int j = 0 ; j<D[i].length; j++){
                System.out.print(D[i][j]+ " ");
            }
            System.out.println("\n");
        }



    }
    
}
