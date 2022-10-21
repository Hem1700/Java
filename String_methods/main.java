import java.lang.*;

public class main {
    
    public static void main (String args[]){

        String str = "Java";
        int l = str.length();
        System.out.println(l);

        System.out.println("---------------------------------------------");

        String lower = str.toLowerCase();
        System.out.println(lower);

        System.out.println("---------------------------------------------");

        String upper = str.toUpperCase();
        System.out.println(upper);

        System.out.println("---------------------------------------------");

        String str1 = "  Welcome  ";
        System.out.println(str1);
        System.out.println(str1.trim());

        System.out.println("---------------------------------------------");

        String str2 = "Welcome to Java Programming";
        System.out.println(str2.substring(0, 14));

        System.out.println("---------------------------------------------");

        String str3 = "Javb";
        System.out.println(str3);
        System.out.println(str3.replace("b", "a"));

        System.out.println("---------------------------------------------");

        String str4 = "netbeans";
        System.out.println(str4.endsWith("s"));
        System.out.println(str4.startsWith("n"));

        System.out.println("---------------------------------------------");

        String str5 = "Welcome to Java";
        System.out.println(str5.charAt(5));

        System.out.println("---------------------------------------------");

        String str6 = "JAVA";
        String str7 = "java";
        String str8 = "python";
        String str9 = "python";
        System.out.println(str9.equals(str8));
        System.out.println(str9.equals(str7));
        System.out.println(str6.equalsIgnoreCase(str7));
        System.out.println(str7.compareTo(str9));
        System.out.println(str9.valueOf(1));





    }

}
