import java.lang.*;
import java.util.*;

public class nested_loops_2 {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\n 1. Pattern 1\n 2. Pattern 2\n 3. Pattern 3");
        int choice  = sc.nextInt();
        switch (choice){
            case 1: 
                int n1 = sc.nextInt();
                for (int i = 1; i<=n1; i++){
                    for (int j = 1 ; j<=i; j++){
                        System.out.print(j + " ");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                System.out.println("Pattern 2\n");
                System.out.println("Enter the limit for pattern");
                int count = 0;
                int n2 = sc.nextInt();
                for (int i = 1;i <=n2; i++){
                    for (int j = 1; j<=i; j++){
                        count ++;
                        System.out.print(count + " ");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                System.out.println("Pattern 3\n");
                System.out.println("Enter the limit for pattern");
                int n3 = sc.nextInt(); 
                for (int i = n3; i>=1;i--){
                    for (int j = 1; j<=i; j++){
                        System.out.print(j + " ");
                    }
                    System.out.println(" ");
                }
                
                
        }
    }
    
}
