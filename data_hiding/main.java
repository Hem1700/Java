import java.lang.*;
import java.util.*;

class Rectangle{

    private double length;
    private double breadth;
// we write get and set method
    double getLength(){
        return length;
    }
    void setLength(double l ){
        length  = l;
    }
    double getBreadth(){
        return breadth;
    }
    void setBreadth(double b){
        breadth = b;
    }

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}

public class main {

    public static void main (String args[]){

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10.5);
        rectangle.setBreadth(5.76);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
    
}
