public class maxArray {
 public static int maxInArray(int [] arr) {
  int max = Integer.MIN_VALUE;
  for(int i = 0 ; i<= arr.length-1; i++){
   if(arr[i] > max){
    max = arr[i];
   }
  }
  return max;
 }
 public static void main(String[] args) {
  int[] array = {10,50,20,500,80,25};
  System.out.println(maxInArray(array));
 };
}
