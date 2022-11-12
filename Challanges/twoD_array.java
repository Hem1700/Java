import java.lang.*;
import java.util.*;

public class twoD_array {
    public static void main (String args[]){

        /* Challange
         * 1. Adding 2 Matrices
         * 2. Multiplying 2 Matrices
         * 3. Sorting array of strings
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice\n 1. Adding 2 Matrices\n 2. Multiplying 2 Matrices\n 3. Sorting array of strings");
        int choice = sc.nextInt();
        switch(choice){

            case 1:
                System.out.println("Enter the row and column of the matrix");
                int row = sc.nextInt();
                int column = sc.nextInt();
                int first[][] = new int[row][column];
                int second[][] = new int[row][column];
                int sum[][] = new int[row][column];
                System.out.println("Enter the elements of the first Matrix");
                for (int i = 0; i<row; i++){
                    for (int j=0; j<column; j++){
                        first[i][j] = sc.nextInt(); 
                    }
                }
                System.out.println("The first Matrix\n");
                for (int i = 0; i<row; i++){
                    for (int j=0; j<column; j++){
                        System.out.print(first[i][j] + " "); 
                    }
                  
                    System.out.println("\n");
                }
                System.out.println("Enter the elements of the second Matrix");
                for (int i = 0; i<row; i++){
                    for (int j=0; j<column; j++){
                        second[i][j] = sc.nextInt(); 
                    }
                }
                System.out.println("The Second Matrix\n");
                for (int i = 0; i<row; i++){
                    for (int j=0; j<column; j++){
                        System.out.print(first[i][j] + " "); 
                    }
                  
                    System.out.println("\n");
                }

                System.out.println("Adding the two matrix........");
                for (int i = 0; i<row;i++){
                    for (int j = 0; j<column;j++){
                        sum[i][j] = first[i][j]+ second[i][j];
                    }
                }
                for (int i = 0; i<row; i++){
                    for (int j=0; j<column; j++){
                        System.out.print(sum[i][j] + " "); 
                    }
                  
                    System.out.println("\n");
                }

                break;

            case 2:
                System.out.println("Enter the row and column of the matrix");
                int row_1 = sc.nextInt();
                int column_1 = sc.nextInt();
                int first_1[][] = new int[row_1][column_1];
                int second_1[][] = new int[row_1][column_1];
                int multi[][] = new int[row_1][column_1];
                System.out.println("Enter the elements of the first Matrix");
                for (int i = 0; i<row_1; i++){
                    for (int j=0; j<column_1; j++){
                        first_1[i][j] = sc.nextInt(); 
                    }
                }
                System.out.println("The first Matrix\n");
                for (int i = 0; i<row_1; i++){
                    for (int j=0; j<column_1; j++){
                        System.out.print(first_1[i][j] + " "); 
                    }
                  
                    System.out.println("\n");
                }
                System.out.println("Enter the elements of the second Matrix");
                for (int i = 0; i<row_1; i++){
                    for (int j=0; j<column_1; j++){
                        second_1[i][j] = sc.nextInt(); 
                    }
                }
                System.out.println("The second Matrix\n");
                for (int i = 0; i<row_1; i++){
                    for (int j=0; j<column_1; j++){
                        System.out.print(first_1[i][j] + " "); 
                    }
                  
                    System.out.println("\n");
                }

                System.out.println("Multiplying the two matrix........");
                for (int i = 0; i<row_1;i++){
                    for (int j = 0; j<column_1;j++){
                        for(int k = 0; k<row_1;k++){
                            multi[i][j] += first_1[i][k] * second_1[k][j];
                        }
                        System.out.print(multi[i][j] + " "); 
                    }
                    System.out.println("\n");
                }
               
                break;

            case 3:
                System.out.println("Enter a string to sort it");
                String str= sc.nextLine();
                String[] chr = str.split(" ");
                System.out.println(Arrays.toString(chr));
                java.util.Arrays.sort(chr);
                for (String x:chr){
                    System.out.println(x);
                }
                
                // String arr[] = {"java", "python" , "pascal", "smalltalk", "ada", "basic"};
                // java.util.Arrays.sort(arr);
                // for (String x:arr){
                //     System.out.println(x);
                // }
                


                break;

            default:
                System.out.println("Invalid Input. Try again");
                

        }
    }
    
}
