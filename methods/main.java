import java.lang.*;
import java.util.*;

public class main {

    static int max(int a,int b){
        if (a>b)
            return a;
        else 
            return b;
        
    }

    static void update(int A[]){
        A[0] = 25;
    }
    public static void main(String args[]){

        System.out.println("Methods");
       
        int a = 10, b = 5, c;
        // Ways of calling a method
        c = max(a,b);
        System.out.println(c);
        main mp = new main();
        System.out.println(mp.max(a, b));


        // Passing Object as Parameters

        int A[]  = {2,3,4,5,6,7};
        update(A);
        System.out.println(A[0]);

    }
    
}

