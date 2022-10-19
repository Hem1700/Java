import java.lang.*;

public class main {

    public static void main(String args []){

        int a = 10, b = 15;

        // Swapping of values using BITWISE OR operator.
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);


        // Masking and Merging

        int x = 1, y = 5;
        //Masking
        x = x & y;
        System.out.println("Masked Value of x: " + x);

        int c = 1, d = 5;
        //Merging
        c = c^d; 
        System.out.println("Merged value of c: " +c);

        //Storing value in single variable
        byte v = 9, w = 12;
        byte z; 
        
        z= (byte)(v<<4);
        z = (byte)(z | w);

        System.out.println((z&0b11110000)>>4);
        System.out.println((z&0b00001111));





    }
    
}
