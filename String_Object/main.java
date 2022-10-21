import java.lang.*;

public class main {

    public static void main (String args []){

        String str = "Java Program";

        /* Constructor for creating a String
         * 1. String(char[])
         * 2. String(byte[])
         * 3. String(string)
         */

        char c[] = {'A', 'B', 'C', 'D'};
        byte b[] = {65,66,67,68};
        // First method
        String str1 = new String(c);
        System.out.println(str1);
        // Second Method
        String str2 = new String(b);
        System.out.println(str2);
        // Third Method
        String str3 = new String("Java");
        System.out.println(str3);

      
    }
    
}
