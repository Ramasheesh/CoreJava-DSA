package patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp  =  n-1 ;
        int nst = 1;
        // row
        /*
        int row = 1;
        while(row<=n){
            //work for spaces
            int csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            //work for stars
            int cst = 1;
            while(cst<=nst){
                System.out.print(" "+"*");
                cst++;
            }
            //prepration for pattern
            System.out.println();
            row++;
            nst++;
            nsp--; 
        }
        */
        //row
        for(int row = 1; row<=n; row++){
            for(int csp =1; csp<=nsp ; csp++){
                System.out.print(" ");
            }
            for(int cst = 1; cst<=nst ; cst++){
                System.out.print("*");
            }
            System.out.println();
            row = row+1;
            nst++;
            nsp--; 
        }
        // System.out.println();
        // row++;
    }
}
