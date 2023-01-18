import java.lang.*;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

import java.io.*;


class Parent {
    Parent(){
        System.out.println("Non-parameterized Constructor of Parent");
    }
    Parent(int x){
        System.out.println("Parameterized Constructor of Parent");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Non-parameterized Constructor of Child");
    }
    Child(int y){
        System.out.println("Parameterized Constructor of child");
    }
    Child (int x, int y){
        super(x);
        System.out.println("Two parameterized of Child Class");
    }
}

class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        length = breadth = 1;
    }
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
}

class Cubiod extends Rectangle{
    int height;

    Cubiod(){
        height = 1;
    }
    Cubiod(int h){
        height = h;
    }

    Cubiod(int l , int b, int h){
        super(l,b);
        height = h;
    }

    int volume (){
        return length*breadth*height;
    }
}



public class main {

    public static void main (String args []){

       // Parent p = new Parent();
      // Child c = new Child(20, 10); 
       Cubiod cb = new Cubiod();
       System.out.println("Volume before assigning valuses");
       System.out.println(cb.volume());
    //    cb.breadth = 1;
    //    cb.height = 2;
    //    cb.length = 3;
    //    System.out.println("Volume after assigning valuses");
        Cubiod cb1 = new Cubiod(1,2,3);
       System.out.println(cb1.volume());
    }
    
}
