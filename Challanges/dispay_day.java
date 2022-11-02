import java.lang.*;
import java.util.*;

public class dispay_day {

    public static void main(String args[]){

        /* Challange
         * 1. Display name of a day based on number
         * 2. Find type of website and the protocol used.
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a choice\n 1. Display name of a day based on number \n 2. Find type of website and the protocol used. ");
         int choice  = sc.nextInt();
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
                        System.out.println("Invalid Input. Try again.");
                    }


                break;

            case 2: 
                System.out.println("Enter a website to check its type and its protocol");
                String url = sc.next();
                String protocol = url.substring(0, url.indexOf(":"));
                if (protocol.equals("http")){
                    System.out.println("HyperText Transfer Protocol");
                }
                else if(protocol.equals("https")){
                    System.out.println("HyperText Transfer Protocol Secure");
                }
                else if(protocol.equals("ftp")){
                    System.out.println("File Transfer Protocol");
                }
                String ext = url.substring(url.lastIndexOf("."));
                if(ext.equals(".com")){
                    System.out.println("Commercial");
                }
                else if(ext.equals(".org")){
                    System.out.println("Organization");
                }
                else if(ext.equals(".net")){
                    System.out.println("network");
                }



                break;
         }

        
    
    }
    
}
