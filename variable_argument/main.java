import java.lang.*;
import java.util.*;

public class main {

    static void show (int... x)    // int []x
    {
        for (int a:x){
            System.out.println(a);
        }

    }

    public static void main (String args []){
        System.out.println("Variable Argument");
        show();
        show(10,20,30);
        show(10,20,30,40,50);
        show(new int[]{10,30,50,70});
    }
    
}
