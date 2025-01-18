import java.util.*;

public class Permutation{
    public static int fact (int x){
        int rv = 1;
        for(int i = 1 ; i <= x ; i++){
            rv = rv * i;
        }
        return rv;
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int r = scr.nextInt();

        int nfact = fact(n);
        int nmfact = fact(n-r);

        int npr = nfact/nmfact;
        System.out.println(n + "P" + r + "=" + npr);

        scr.close();
    }
}
