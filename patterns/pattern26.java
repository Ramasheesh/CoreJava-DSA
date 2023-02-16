package patterns;

import java.util.Scanner;

public class pattern26 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;//n is also acceted
        // int val = 1;
        int row = 1;
        
        while(row <= n){
            //space
            
            int val = 1;

            for(int csp =1 ; csp <=nsp ; csp++){
                System.out.print(" ");
            }
            // stars
            for(int cst =1 ; cst <=nst ; cst++){
                System.out.print(val);
                
                if(cst <= nst/2){
                    // val = row;
                    val++;
                }else{
                    val--;
                }
            }
            System.out.println();
            nsp=nsp-1;
            nst = nst +2;
            row++;
        }   
    }
}
