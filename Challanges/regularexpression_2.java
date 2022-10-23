import java.lang.*;

public class regularexpression_2 {
    
    public static void main (String args []){

        /* Challanges
         * 1. Remove Special Characters from a string
         * 2. Remove Extra spaces from a string
         * 3. Find number of words in a string
         */

        // Removing Special Characters
        String str1 = "This#string%contains^special*characters&.";
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);
        // Removing Extra spaces
        String str2 = "    This is a sentence with extra spaces      ";
        str2 = str2.trim();
        System.out.println(str2);
        // Find the number of words in a string
        String str3 = "This is to check number of words in a string";
        str3 = str3.trim();
        int len = str3.length();
        System.out.println(len);

       


    }
}
