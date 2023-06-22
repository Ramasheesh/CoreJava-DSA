
import java.util.*;
public class sum {
  
  public static void sumOperation() {
   int a = 10;
   int b = 20;
   int c = a+b;
   System.out.println(c);
  }
  // 2:-addtion by parameters
  public static void sumByparams(int a  , int b) {
    System.out.println(a+b);
  }
   // 3:-
  public static int addtionReturn(int a , int b){
    int sum = a+b;//sum1
    return sum;
  }
   // 4:-
   public static int demoScope(int one , int another){
    int sum = one + another;//sum1
        // int sum = one + two;//sum1 / two can not decleare

    return sum;
  }
 public static void main(String[] args) {
  System.out.println("hello");
  sumOperation();
  sumByparams(10 ,100);
    int sum = addtionReturn(40 , 50);//sum2 {sum1 and sum2 isdeffrent  to each other}
    System.out.println(sum);
    System.out.println("sir");
    int one = 220;
    int two = 100;
    int res = demoScope(one, two);
    System.out.println(res);

 }
}