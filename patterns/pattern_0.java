package patterns;

import java.util.Scanner;

public class pattern_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row =1; row<=n; row++){
            System.out.print("*\n");
        }
    }
}
