import java.util.*;
import java.util.Scanner;

public class Prime{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
         int t = scn.nextInt();
       
        for(int i = 0;i < t;i++){
            int n = scn.nextInt();

            int count = 0;
            for(int div = 1;div <= n;div++){
                if(n % div == 0){
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
        scn.close();
    }
}