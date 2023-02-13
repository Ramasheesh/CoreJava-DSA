import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        if(n%2 == 0){//give the reminders by using modulas operator(== is use for comperision)
            System.out.println("this is even number");
        }else{
            System.out.println("This is odd number");
        }
    }
}
