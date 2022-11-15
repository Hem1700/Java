import java.lang.*;
import java.util.*;

public class main {

    //method overloading
    static int max(int x, int y){
        return x>y?x:y;
    }
    
    static float max(float x, float y){
        return x>y?x:y;
    }

    static int max(int x, int y, int z){
        return x>y && x>z?x:(y>z?y:z);
    }

    public static void main(String args[]){
        float a = 14.12f , b = 1244.21f;
        System.out.println(max(a,b));
        int x =1, y=2,z = 3;
        System.out.println(max(x, y,z));
        System.out.println(max(x, y));

    }
}
