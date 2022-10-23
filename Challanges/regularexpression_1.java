import java.lang.*;

public class regularexpression_1 {
    
    public static void main (String args []){

        /* Challanges
         * 1. Find if a number is binary or not
         * 2. Find if a number is Hexa-Decimal or not
         * 3. Find if the data is in Date Format (dd/mm/yyyy)
         */

        int b = 1011001;
        String str = b + "";
        String str1 = "234A";
        String str2 = "17/02/2000";
        System.out.println("Checking for Binary Number");
        System.out.println(str.matches("[01]*"));
        System.out.println("Checking for Hexa-Decimal Number");
        System.out.println(str1.matches("[0-9A-Z]+"));
        System.out.println("Checking for Date Format");
        System.out.println(str2.matches("[0-3][1-9]/[0-1][0-9]/[0-9]{4}"));



    }
}
