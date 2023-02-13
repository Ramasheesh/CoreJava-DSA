import java.util.*;
public class else_ifDemo {
    public static void main(String[] args) {
        // age calculation by using &&_and condition else if condition
        Scanner scn= new Scanner(System.in);
        int age = scn.nextInt();
        if(age <=11){
            System.out.println("You are child");
        }else if(age>=11 && age<=18){
            System.out.println("You are teenager");
        }else if(age>=18 && age<=40){
            System.out.println("You are adult");
        }else{
            System.out.println("You are old");
        }
    }//this is colled nested if else concept
}
