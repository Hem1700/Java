import java.lang.*;
import java.util.*;

public class main {

    public static void main (String args[]){

        System.out.println("--------------------------------------------------------------");
        System.out.println("For loop - Print 0-10");
        System.out.println("--------------------------------------------------------------");
        for(int i = 0; i<=10;i++){
            System.out.println(i);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("While Loop");
        System.out.println("--------------------------------------------------------------");
        int j = 0;
        while(j<=10){
            System.out.println(j);
            j++;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Do While Loop");
        System.out.println("--------------------------------------------------------------");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        }
        while(k<=10);


    }
    
}
