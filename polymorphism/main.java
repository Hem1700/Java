import java.util.*;
import java.io.*;


class Test{
    public int max(int a, int b){
        return a>b?a:b;
    }
    public int max(int a, int b, int c){
        if(a>b) return a;
        else if(b>c) return b;
        else return c;
    }
}


public class main {

    public static void main (String args []){
        System.out.println("Polymorphism");
        Test t1 = new Test();
        System.out.println(t1.max(10, 1));
        System.out.println(t1.max(1, 2, 3));
    }
    
}
