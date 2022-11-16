import java.lang.*;
import java.util.*;

public class main {

    static void show (int... x)    // int []x
    {
        for (int a:x){
            System.out.print(a + " " );
        }
        System.out.println();

    }

    static void showList(String ...S){
        for(int i = 0; i < S.length; i++){
            System.out.println(i+1 + ". " + S[i]);
        }
    }

    public static void main (String args [])
    {
        System.out.println("Variable Argument");
        show();
        show(10,20,30);
        show(10,20,30,40,50);
        show(new int[]{10,30,50,70});

        showList("John" , "Smith", "Ajay" , "Walter");
    }
    
}
