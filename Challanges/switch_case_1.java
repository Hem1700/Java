import java.lang.*;
import java.util.*;

public class switch_case_1 {

    public static void main (String args []){

        /* Challanges
         *  1. Display the name of day based on number
         *  2. Display name of a month based on number
         *  3. Display type of website
         */
        System.out.println("Enter a choice.\n 1. Display the name of day based on number\n 2. Display name of a month based on number\n 3. Display type of website ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
            System.out.println("Enter a number to find its day (1-7)");
            int day = sc.nextInt();
            switch (day){
                case 1: 
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Input. Try again. (1-7)");
                }
                break;
            case 2:
                System.out.println("Enter a number to find its month (1-12)");
                int month = sc.nextInt();
                switch (month){
                case 1: 
                    System.out.println("January");
                    break;
                case 2: 
                    System.out.println("February");
                    break;
                case 3: 
                    System.out.println("March");
                    break;
                case 4: 
                    System.out.println("April");
                    break;
                case 5: 
                    System.out.println("May");
                    break;
                case 6: 
                    System.out.println("June");
                    break;
                case 7: 
                    System.out.println("July");
                    break;
                case 8: 
                    System.out.println("August");
                    break;
                case 9: 
                    System.out.println("September");
                    break;
                case 10: 
                    System.out.println("October");
                    break;
                case 11: 
                    System.out.println("November");
                    break;
                case 12: 
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Invalid Input. Try Again (1-12)");
                    break;
                }
                break;
            case 3:
                System.out.println("Enter a website to check its type");
                String url = sc.next();
                String ext = url.substring(url.lastIndexOf("."));
                switch (ext){
                    case ".com":
                        System.out.println("Commercial");
                        break;
                    case ".net":
                        System.out.println("Network");
                        break;
                    case ".org":
                        System.out.println("Organization");
                        break;
                    default:
                        System.out.println("Invalid Input");

                }
                break;

            
            default:
                System.out.println("Enter a valid Input (1-3)");




        }



    }
    
}
