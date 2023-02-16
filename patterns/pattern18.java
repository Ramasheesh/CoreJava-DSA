package patterns;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = 2*n - 3;
        
        int row = 1;
        while(row <= n){
            //stars
            for(int cst = 1; cst <= nst; cst++){
                System.out.print("*");
            }
            //space
            for(int csp = 1; csp <= nsp; csp++){
                System.out.print(" ");
            }
            //stars
            if(row == n){
                nst = nst-1;
            }
            for(int cst = 1; cst <= nst; cst++){
                System.out.print("*");
            }
            System.out.println();
            row = row + 1;
            nsp = nsp -2;
            nst++;
        }
    }
}
