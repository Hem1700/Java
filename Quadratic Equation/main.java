import java.util.*;
import java.lang.*;

public class main {
    public static void main (String args[]){
        System.out.println("This is a quadratic equation Program.");
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter values of a, b and c ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double r1, r2;
        r1 = (-b + (Math.sqrt((b*b)-(4*a*c))))/(2*a);
        r2 = (-b - (Math.sqrt((b*b)-(4*a*c))))/(2*a);
        System.out.println("First root is: " +r1);
        System.out.println("Second root is: " +r2);
    }
}
