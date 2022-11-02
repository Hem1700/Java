import java.lang.*;;

public class main {

    public static void main (String args []){
        int a = 5, b = 10, c = 15;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        if (a > b && a > c){
            System.out.println(a + " is the largest number. ");
        }
        else if( b > a && b > c ){
            System.out.println(b + " is the largest number");
        }
        else {
            System.out.println(c + " is the largest number");
        }
    }
    
}
