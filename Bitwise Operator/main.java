import java.lang.*;
import java.util.*;

public class main {

    public static void main(String args []){
       int x = 10;
       int y = 6;
       int z = x^y;  
       int a = x & y;
       int b = x | y;
       int ls = x<<1;
       int rs = x>>1;
       System.out.println("XOR: " +z);
       System.out.println("AND: " +a);
       System.out.println("OR: " +b);
       System.out.println("LEFT SHIFT: " +ls);
       System.out.println("RIGHT SHIFT: " + rs);

    }
    
}
