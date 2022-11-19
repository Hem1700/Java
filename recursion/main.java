import java.lang.*;
import java.util.*;

public class main {


    static void fun(int n){
        if(n>0){
            System.out.println(n);
            fun(n-1);
        }
    }

    static void fun1(int n){
        if (n>0){
            fun(n-1);
            System.out.println(n);
        }
    }
    public static void main (String args[]){


        System.out.println("Recursive Method");
        System.out.println("fun");
        fun(3);
        System.out.println("fun1");
        fun1(3);
    }
    
}
