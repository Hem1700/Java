import java.util.Scanner;

public class division {
    public static void main(String args[]){
        System.out.println("Welcome to the divsion program");
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.println("Enter two numbers: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = a/b;
        System.out.println("The division of two numbers is: " + c);

    }
}
