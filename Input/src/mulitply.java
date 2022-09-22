import java.util.Scanner;

public class mulitply {
    public static void main(String args[]){
        System.out.println("Welcome to multiplication programming");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to multiply: ");
        float a,b,c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = a * b;
        System.out.println("The multiplication of two number is: " + c);
    }
}
