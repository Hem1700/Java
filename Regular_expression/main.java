import java.lang.*;

public class main {

    public static void main (String args[]){

        /* Regular Expression
         *  "."  - Any character
         *  "[abc]"  - Exactly given letters 
         *  "[abc][vz]" - Either first or second set
         *  "[^abc]" - Except abc
         *  "[a-z1-7]" - a-z or 1-7
         *  "A|B" - A or B
         *  "XZ" - Exactly XZ 
         */
        System.out.println("------------------------------------------");
        System.out.println("Matching Symbols");
        System.out.println("------------------------------------------");

        String str1 = "f";
        String str2 = "abc";
        String str3 = "a1";
        System.out.println(str1.matches("."));
        System.out.println(str2.matches("."));
        System.out.println(str1.matches("[afc]"));  // One single alphabet from the pattern
        System.out.println(str1.matches("[^abc]"));
        System.out.println(str1.matches("[a-z0-9]"));
        System.out.println(str3.matches("[a-z][0-9]"));
        System.out.println(str2.matches("[a-z][0-9]"));
        System.out.println(str1.matches("f|a"));



        /* Meta Character
         *  "\d" - Digits
         *  "\D" - Not Digits
         *  "\s" - Space
         *  "\S" - Not Space
         *  "\w" - Aphabets or Digit 
         *  "\W" - Neither Alphabet nor digit
         */
        System.out.println("------------------------------------------");
        System.out.println("Meta Characters");
        System.out.println("------------------------------------------");
        String str4  = "a";
        String str5 = "5";
        System.out.println(str4.matches("\\w"));
        System.out.println(str5.matches("\\w"));
        System.out.println(str5.matches("\\d"));
        System.out.println(str4.matches("\\d"));
        System.out.println(str4.matches("\\D"));
        System.out.println(str5.matches("\\s"));
        System.out.println(str5.matches("\\S"));


        /* Quantifiers
         *  "*" - 0 or more time
         *  "+" - One or more
         *  "?" - 0 or 1 time
         *  "{X}" - X times
         *  "{X,Y}" - Betweeen X and Y time
         */

        System.out.println("------------------------------------------");
        System.out.println("Quantifiers");
        System.out.println("------------------------------------------");

        String str6 = "abcd";
        String str7 = "apple";
        System.out.println(str6.matches(".*"));
        System.out.println(str6.matches("[abc]*"));
        System.out.println(str7.matches("[a-z]*"));
        

    
        
        
         
    }
    
}
