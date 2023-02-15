package patterns;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n;
        int row = 1;
        while(row <= n){
            //space
            for(int csp =1 ; csp <=nsp ; csp++){
                System.out.print(" ");
            }
            // stars
            for(int cst =1 ; cst <=nst ; cst++){
                System.out.print("1");
            }
            System.out.println();
            nsp=nsp-1;
            nst = nst +2;
            row++;
        }   
    }
}
