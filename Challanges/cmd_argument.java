import java.lang.*;
import java.util.*;



public class cmd_argument {

    public static void main (String args[]){
        int sum = 0;
        System.out.println(args[0]);
            for (int i = 0; i<args.length-1; i++){
                sum = sum + Integer.parseInt(args[i+1]);     
        }
        System.out.println(sum);
          
    }
    
}
