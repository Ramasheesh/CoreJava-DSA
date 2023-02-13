package patterns;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nr  = 2*n - 1;
        int nst = 1;
        
        /*
        int row = 1;
        while(row <= nr){
            // work for star
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            if(row <= nr/2){
                nst++;
            }else{
                nst--;
            }
            row++;
        }
        */
        for(int row =1 ;row<=nr ; row++){
            for(int cst = 1; cst<=nst ;cst++){
                System.out.print("*");
            }
            System.out.println();
            if(row < nr/2){
                nst++;
            }
            else{
                nst--;
            }
        }
    }
}
