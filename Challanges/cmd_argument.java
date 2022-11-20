import java.lang.*;
import java.util.*;



public class cmd_argument {

    public static void main (String args[]){
        int sum = 0;
        if(args[0].equals("add")){
            for (int i = 0; i<args.length-1; i++){
                sum = sum + Integer.parseInt(args[i+1]);     
        }
        System.out.println(sum);
        }
        
            
          
    }
    
}
