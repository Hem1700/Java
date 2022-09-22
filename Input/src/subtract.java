import java.util.Scanner;

public class subtract {
    public static void main(String args[]){
        System.out.println("Welcome to the subtraction program");
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a-b;
        System.out.println("Subtraction of two numbers is: " + c);

    }
}
