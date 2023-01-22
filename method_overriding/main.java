import java.util.*;
import java.io.*;

 // Method Overriding
    /* Redefining a method of a super class in sub class */

class Super{
    public void display(){
        System.out.println("Super Class");
    }
}

class Sub extends Super{
    public void display(){

        System.out.println("Sub Class");
    }
}

public class main {

    public static void main (String args []){
        System.out.println("Method Overriding");
        Super super1 = new Super();
        Sub su = new Sub();
        super1.display();
        su.display();

        // Dynamic Method Dispatch
        // Method is called depending upon the object(sub class) and not the reference(super class). 
        Super su1 = new Sub();
        su1.display();
    }
    
}
