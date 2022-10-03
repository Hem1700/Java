public class Main {
    public static void main(String[] args) {

        System.out.println("Operators and Expression");
        System.out.println("-----------------------------------------------------------");
        int x = 10%3;
        int y =  10/3;
        System.out.println("'%' will give us the remainder. For example 10 % 3: " + x);
        System.out.println("'/' will give us the quotient. For example 10/3: " + y );
        double z = 12.7 % 3.1;
        System.out.println(z);
        int a = 10, b = 5, c = 2;
        double expression1 =  a + b/2 *c;
        double expression2 = (a+b)/(2*c);
        System.out.println(expression1);
        System.out.println(expression2);

        System.out.println(10/2*5);
        System.out.println(5*2/10);
    }
}