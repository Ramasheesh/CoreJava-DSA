import java.util.Scanner;

public class fibonoicciSerise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int counter = 0;// here counter = 0 or 1 or 2 or 3... no should be eluminate 
        while(counter <= n-1){
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
            counter++;
        }
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
    
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
    
        for (int i = 2; i < n; i++) {
          c = a + b;
          System.out.print(" " + c);
          a = b;
          b = c;
        }
        */
    }
}
