import java.lang.*;

public class string_methods {

    public static void main (String args []){

        /* 1. Find if the email id is on gmail
         * 2. Find username and domain name from email
         */

        String str = "programmer@gmail.com";
        boolean  value  = str.matches("^[A-Za-z0-9._]{1,16}+@{1}+[a-z]{1,7}\\.[a-z]{1,3}$");
        if (value == true){
            System.out.println("String contains an email id");
        }
        else{
            System.out.println("String does not contain an email id");
        }
       
        int i = str.indexOf("@");
        int len = str.length();
        System.out.println("Username: " +str.substring(0,i));
        System.out.println("Doman Name: " +str.substring(i+1, len));
        
        

    }
    
}
