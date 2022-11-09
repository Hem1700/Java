import java.lang.*;
import java.util.*;


public class nested_loops_3 {

    public static void main (String args []){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\n 1. Pattern 1\n 2. Pattern 2\n 3. Pattern 3");
        int choice  = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Pattern 1\n");
                System.out.println("Enter the limit for pattern");
                int n1 = sc.nextInt();
                for (int i = 1; i<=n1; i++){
                    for (int j = 1; j<=n1; j++){
                        if (j>=i){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
                break;

            case 2:
                System.out.println("Pattern 2\n");
                System.out.println("Enter the limit for pattern");
                int n2 = sc.nextInt();
                    for (int i = n2; i>=1 ; i--){
                        for (int j = 1; j<=n2; j++){
                            if (j >=i){
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                break;
            
            case 3:
                System.out.println("Pattern 3\n");
                System.out.println("Enter the limit for pattern");
                int n = sc.nextInt();
                int st = 1;
                int sp =  n - 1; 
                
         
                for(int i = 0; i < n ; i++){ 
                    for(int j = 1; j <= sp; j++){ 
                        System.out.print(" ");
                    }
                    for(int j = 1; j <= st; j++){ 
                        System.out.print("*");
                    }
                    st+=2;
                    sp--;
                    System.out.println();
                }
                        
                break;





        }
    }
    
}
