public class linearSearch {
 public static void main(String[] args) {
  int [] arr = {10,20,50,35,100};
  System.out.println(linearSearch(arr,50));
 }
 public static int linearSearch(int [] arr , int item) {
   for(int i = 0 ; i<= arr.length-1 ; i++){
    if(arr[i] == item){
     return i;
    }
   }
   return -1;
 }
}
