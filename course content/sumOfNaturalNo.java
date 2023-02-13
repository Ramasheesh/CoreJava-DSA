import java.util.Scanner;
public class sumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int counter  = 1;
        int sum =0;
        while(counter <=n){
            // System.out.println(counter); print the n number till witch you want
            sum = sum + counter;
            counter++;
        }
        System.out.println(sum);
    }
}
