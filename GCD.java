import java.util.*;

public class GCD {
    public static void main(String[] args){
        Scanner scr =  new Scanner(System.in);

        System.out.println("Enter the first number ");
        int n1 = scr.nextInt();
        System.out.println("Enter the second number ");
        int n2 = scr.nextInt();

        int on1 = n1;
        int on2 = n2;

        while( n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd =  n2;
        int lcm = (on1 * on2) /  gcd;

        System.out.println("Greatest common divisor is : " + gcd);
        System.out.println("LCM is " + lcm);

        scr.close();
    }
}
