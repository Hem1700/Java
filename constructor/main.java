import java.lang.*;
import java.util.*;

class Rectangle{

    private double length;
    private double breadth;

    // A constructor will not have any return type.

    public Rectangle(double l, double b){
      setLength(l);
      setBreadth(b);
    }

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

   public void setBreadth(double b){
    if(b>=0){
        breadth = b;

    }
    else {
        breadth = 0;
    }
   }

   public void setLength(double l){
    if(l>=0){
        length = l;
    }
    else{
        length = 0;
    }
   }

    public double area() {
        return getBreadth()*getLength();
    }


}



public class main {

    public static void main (String args[])
    {
        Rectangle rectangle = new Rectangle(-10,5);
        // rectangle.setlength(10);
        // rectangle.setBreadth(5);
        System.out.println("Area: " +rectangle.area());

    }
    
}
