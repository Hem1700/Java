import java.lang.*;
import java.util.*;


class Cylinder{

    private double radius;
    private double height;

    public Cylinder(double h, double r){
        setHeight(h);
        setRadius(r);
    }

    public double getHeight(){
        return height;
    }
    public double getRadius(){
        return radius;
    }

    public void setHeight(double h){
        if(h>=0){
            height = h;
        }
        else{
            height = 0;
        }
    }

    public void setRadius(double r){
        if(r>=0){
            radius = r;
        }
        else{
            radius = 0;
        }
    }

    public double area(){
        return 2*Math.PI*getRadius()*getHeight() + 2*Math.PI*getRadius()*getRadius();
    }



}


public class constructor_1 {

    public static void main (String args[]){

        Cylinder cylinder = new Cylinder(10, 5);
        System.out.println("Area: " + cylinder.area());

    }
        

    
    
}
