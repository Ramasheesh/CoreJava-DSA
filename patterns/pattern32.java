package patterns;

import java.util.Scanner;

public class pattern32 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nr = 2*n-1;//n is also acceted
        int row = 1;
        while(row <= nr){
            //stars
            int val = 1;

            
            if(row <= nr/2)
                val =  row;
            else
                val = nr -row +1;


            for(int cst = 1; cst <= nst; cst++){
                if(cst % 2 == 0){
                    System.out.print("*");
                }else{
                    System.out.print(val);
                }
            }
            System.out.println();
            if(row <= nr/2){
                nst+=2;
             }
            else{
                nst-=2;
            }
            row++;
        }
    }    
}
