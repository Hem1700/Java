import java.io.*;
import java.lang.*;

import javax.sound.midi.SysexMessage;

class Parent {
    public Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}


public class main {
    
    public static void main (String args []){

        //Parent p  = new Parent();
        //Child c  = new Child();
        GrandChild gc = new GrandChild();


    }
}
