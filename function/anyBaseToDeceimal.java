import java.util.Scanner;

public class anyBaseToDeceimal {
 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in);
  int n = sn.nextInt();
  // int sb = sn.nextInt();
  int db = sn.nextInt();

  // int ans1 = anyBaseToDeceimal(n , sb);
  // System.out.println(ans1);
  int ans2  = deceimalToAnyBase(n , db);
  System.out.println(ans2);

 }
 public static int  anyBaseToDeceimal(int n , int sb) {//sb =source base
  int ans = 0 ;
  int multiplier = 1;
  while (n != 0) {
   int rem = n%10 ;
   ans =ans+ (rem * multiplier);
   multiplier = multiplier * sb;
   n = n/10;
  }
  return ans;

 }
 public static int  deceimalToAnyBase(int n , int db) {//sb =source base n=238,destination base db =5
  int ans = 0 ;
  int multiplier = 1;
  while (n != 0) {
   int rem = n%db ;
   ans =ans+ (rem * multiplier);
   multiplier = multiplier * 10;
   n = n/db;
  }
  return ans;

 }

}
