import java.lang.*;
import java.util.*;
import java.util.function.Function;



public class main {
    public static void main(String args[])
    {
    System.out.println("Welcome to Area programme");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter\n 1: Area of Square\n 2: Area of Rectangle\n 3: Area of Triangle ");
    float height,breadth,area;
    System.out.println("Enter height: ");
    height = sc.nextFloat();
    System.out.println("Enter breadth: ");
    breadth = sc.nextFloat();
    area = (height*breadth)/2;
    System.out.println(area);



    }
    
}