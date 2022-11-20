import java.lang.*;
import java.util.*;

class Circle{
    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2*Math.PI* radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class Square{
    public double side;
    public double area(){
        return side * side;

    }
    public double perimeter(){
        return 4*side;
    }
}

class Rectangle{
    public double length;
    public double breadth;
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    
}

class Cylinder{
    public double radius;
    public double height;
    public double area(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    public double perimeter(){
        return 4*radius+ 2*height;
    }


}



public class main {

    public static void main (String args[]){
        System.out.println("Object Oriented Programming");
        /* Principles of OOPs
         * 1. Abstraction : Hiding Internal details and showing only required features.
         * 2. Encapsulation
         * 3. Inheritance
         * 4. Polymorphism
         */

        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Cylinder cylinder = new Cylinder();
        circle.radius = 2;
        square.side = 4;
        rectangle.length = 5;
        rectangle.breadth  = 2;
        cylinder.radius = 2;
        cylinder.height = 5;
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Perimeter of Circle: " + circle.perimeter());
        System.out.println("Circumference of Circle: " + circle.circumference());
        System.out.println("Area of square: " + square.area());
        System.out.println("Perimeter of Square: " + square.perimeter());
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        System.out.println("Area of cylinder: " + cylinder.area());
        System.out.println("Perimeter of cylinder: " + cylinder.perimeter());

        
        
        
        
    }
    
}
