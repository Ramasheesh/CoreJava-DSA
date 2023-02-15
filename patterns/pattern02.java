package patterns;

import java.util.Scanner;

public class pattern02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int nst  = 1;
        for(int row = 1; row<=n ; row++){
            for(int col =1 ; col<=nst; col++){
                System.out.print("  "+"*");
            }
            System.out.println("");
            nst = nst +1;
        } 

        /*
        //2nd method
        int row = 1;
        while(row<=n){
            int cst = 1;
            while(cst <= nst){
                System.out.print(" "+"*");
                cst++;
            }
            System.out.println("");
            nst = nst +1;
            row = row +1;
        }
        */
    }
}
