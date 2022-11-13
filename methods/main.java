import java.lang.*;
import java.util.*;

public class main {

    static int max(int a,int b){
        if (a>b)
            return a;
        else 
            return b;
        
    }
    public static void main(String args[]){

        System.out.println("Methods");
       
        int a = 10, b = 5, c;
        // Ways of calling a method
        c = max(a,b);
        System.out.println(c);

        main mp = new main();
        System.out.println(mp.max(a, b));

    }
    
}

