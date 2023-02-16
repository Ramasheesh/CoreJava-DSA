package patterns;

import java.util.Scanner;

public interface pattern01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int col =1 ; col <= 5; col++){
            for(int row = 1 ; row <=n; row ++){
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }
}
