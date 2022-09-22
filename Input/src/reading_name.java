import java.util.Scanner;

public class reading_name {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("Enter you name: ");
        name = s.nextLine();
        System.out.println("Welcome to Java Programming " + name);


    }
}
