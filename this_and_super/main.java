import java.io.*;
import java.util.*;

class Rectangle{
    int breadth;
    int length;
    int x = 10;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void display(){
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }
}

class Cuboid extends Rectangle{
    int height;
    int x = 20;

    Cuboid(int l, int b, int h){
        super(l, h);
        this.height = h;
    }

    void display(){
        System.out.println(super.x);
        System.out.println(x);
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
        System.out.println("Height: " + this.height);
        
    }
}



public class main {

    public static void main(String args[]){

        Rectangle r1 = new Rectangle(10, 5);
        r1.display();
        Cuboid c1 = new Cuboid(15, 5, 10);
        c1.display();
    }

   
    
}
