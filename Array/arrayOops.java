import java.util.Scanner;

public class arrayOops {
   static Scanner scn = new Scanner(System.in);
 public static void main(String[] args) {
  int []  array =  takeInput();
  // display(array);
  // System.out.println("max value is --- "+maxInArray(array));
  System.out.println(linearSearch(array,25));
 }
 // taking input in array
 public static int[] takeInput() {
  int n = scn.nextInt();
  int[] arr = new int[n];

  for(int i = 0  ; i<= arr.length - 1 ; i++){
   System.out.println("Enter the value for index i" + i + "index ?");
   arr[i] = scn.nextInt();
  }
  return arr;
 }
  // display array
 public static void display( int [] arr) {
  for(int i = 0 ; i<= arr.length -1 ; i++ ){
   System.out.println(arr[i]);
  }
 }
 // max in array
  public static int maxInArray(int [] arr) {
  int max = Integer.MIN_VALUE;
  for(int i = 0 ; i<= arr.length-1; i++){
   if(arr[i] > max){
    max = arr[i];
   }
  }
  return max;
 }
 // linear search
 public static int linearSearch(int [] arr , int item) {
   for(int i = 0 ; i<= arr.length-1 ; i++){
    if(arr[i] == item){
     return i;
    }
   }
   return -1;
 }
}

