import java.util.Scanner;
public class ifElseDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n<5){
            System.out.println("I'm in if condition");
        }else{
            System.out.println("I'm in else condition");
        }

    }
}
