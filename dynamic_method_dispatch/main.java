import java.util.*;
import java.io.*;

class Super{
    void meth1(){
        System.out.println("Super Class: Method 1");
    }
    void meth2(){
        System.out.println("Super Class: Method 2");
    }
}

class Sub extends Super{
    void meth2(){
        System.out.println("Sub Class: Method 2");
    }
    void meth3(){
        System.out.println("Sub Class: Method 3");
    }
}


public class main {

    public static void main (String args []){
        System.out.println("Dynamic Method Dispatch");
        Super su = new Super();
        su.meth1();
        su.meth2();
        Sub sb = new Sub();
        sb.meth1();
        sb.meth2();
        sb.meth3();


        //Dynamic Method Dispatch
        Super s1 = new Sub();
        s1.meth1();
        s1.meth2();
        // Not Allowed : Because reference is super class
        //s1.meth3();

        
    }
    
}
