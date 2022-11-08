import java.lang.*;
import java.util.*;

public class nested_loops_1 {

    public static void main (String args []){

        /* Challange
         *  1. Pattern 1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice\n 1. Pattern 1\n 2. Pattern 2\n 3. Pattern 3\n 4. Pattern 4");
        int choice = sc.nextInt();
        switch (choice){
            case 1: 
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 1");
                System.out.println("------------------------------------------------------");
                System.out.println("Enter the limit for Pattern");
                int n = sc.nextInt();
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 1 Starts");
                System.out.println("------------------------------------------------------");
                for(int i = 1; i<=n; i++){
                    for(int j = 1; j<=n; j++){
                        System.out.print(j + " ");
                    }
                    System.out.println("");
                }
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 1 Ends");
                System.out.println("------------------------------------------------------");
                break;
            case 2:
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 2");
                System.out.println("------------------------------------------------------");
                System.out.println("Enter the limit for Pattern");
                int n1 = sc.nextInt();
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 2 Starts");
                System.out.println("------------------------------------------------------");
                for(int i = 1; i<=n1; i++){
                    for(int j = 1; j<=n1; j++){
                        System.out.print(i + " ");
                    }
                    System.out.println("");
                }
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 2 Ends");
                System.out.println("------------------------------------------------------");
                break;
            case 3:
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 3");
                System.out.println("------------------------------------------------------");
                System.out.println("Enter the limit for Pattern");
                int n2 = sc.nextInt();
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 3 Starts");
                System.out.println("------------------------------------------------------");
                for(int i = 1; i<=n2; i++){
                    for(int j = 1; j<=n2; j++){
                        System.out.print(j+i + " ");
                    }
                    System.out.println("");
                }
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 3 Ends");
                System.out.println("------------------------------------------------------");
                break;
            case 4:
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 4");
                System.out.println("------------------------------------------------------");
                System.out.println("Enter the limit for Pattern");
                int n3 = sc.nextInt();
                int count = 0;
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 4 Starts");
                System.out.println("------------------------------------------------------");
                for(int i = 1; i<=n3; i++){
                    for(int j = 1; j<=n3; j++){
                        System.out.print(++count + " ");
                    }
                    System.out.println("");
                }
                System.out.println("------------------------------------------------------");
                System.out.println("Pattern 4 Ends");
                System.out.println("------------------------------------------------------");
                break;
                
                

        }
    }
    
}
