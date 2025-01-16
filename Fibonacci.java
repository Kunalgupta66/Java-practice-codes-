import java.util.*;

public class Fibonacci{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the range :");
        int n = scr.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 0; i<=n ; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }

    scr.close();
    }
}