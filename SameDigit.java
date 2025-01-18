import java.util.*;

public class SameDigit{

    public static int getFreq(int n , int d){
        int rv = 0;
    
        while(n > 0){
            int dig = n % 10;
            n = n / 10;
    
            if(dig == d){
                rv++;
            }
        }
        return rv;
    }

  public static void main(String[] args){
    Scanner scr = new Scanner(System.in);
    System.out.println("Enter the digit");
    int n = scr.nextInt();
    System.out.println("Enter the digit which you have to find ");
    int d = scr.nextInt();
    int f = getFreq(n, d);
    System.out.println(f);

    scr.close();
  }


}