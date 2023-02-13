import java.util.Scanner;

public class printOddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1 ;
        while(count<=n){
            if(count%2==1)
                System.out.println(count);
                count++;
            
        }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the maximum number: ");
        // int n = sc.nextInt();
    
        // System.out.println("The odd numbers from 1 to " + n + " are:");
        // for (int i = 1; i <= n; i++) {
        //   if (i % 2 != 0) {
        //     System.out.print(i + " ");
        //   }
        // }
    }
}
