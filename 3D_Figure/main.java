import java.util.*;
import java.lang.*;

public class main {
    public static void main(String args[]){
        System.out.println("This is a 3D Diagram Program");
        Scanner sc = new Scanner(System.in);
        double length, height, breadth;
        System.out.println("Enter the length, height, breadth of a cuboid");
        length = sc.nextDouble();
        height = sc.nextDouble();
        breadth = sc.nextDouble();
        double volume = length * height * breadth;
        double total_surface_area = 2* (length*breadth+ length*height + breadth*height);
        double longest_diagonal = Math.sqrt((length*length) + (height*height) + (breadth*breadth));
        System.out.println("Volume of Cuboid is: " +volume);
        System.out.println("Total Surface Area of Cubiod is: " +total_surface_area);
        System.out.println("Longest Diagonal of the cubiod is: " +longest_diagonal);

    }
}
