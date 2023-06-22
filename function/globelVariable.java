public class globelVariable {
 public static int val = 500;
 public static void main(String[] args) {
  // if i dec val =100, as local val we face fight with in witch
    System.out.println(val);
  int val = 100;
  System.out.println(val);
  int one =55;

  int ans = demoGlobleScope(one);
  System.out.println(ans);
  System.out.println("part 2: block scope");
  int two = 20;
  if(one < two || two < one){
   int three = 10;
   System.out.println(three);
  }
    // System.out.println(three);// you can not decleare out side of the condition

  System.out.println("part 3: pass By value , swap Function");
   System.out.println("one "+one +" and "+ "two "+two);
  swap(one , two);
 }
 //1
 public static int demoGlobleScope(int one) {
    int sum = one + val;

    return sum;
  }
  //2
   public static void swap(int one ,int two) {
    int temp = one;
    one = two ;
    two = temp;
  System.out.println(  "answer is:--" + "one "+one + " and "+ "two "+two);
  }


}
