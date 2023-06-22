public class binarySearch {
 public static int BinarySearch(int [] arr, int item ) {
  //binarySearch better the linear serarch but array must be sorted
  int lo = 0 ;
  int hi = arr.length-1;
  while(lo <= hi){
   int mid = (lo + hi)/2;
   if(arr[mid] < item){
    lo = mid + 1;
   }
   else if( arr[mid] > item){
    lo = mid - 1;
   }
   else{
    return mid;
   }
  }
  return -1;
 }
 public static void main(String[] args) {
  int arr[] = {10,15,20,101,150,200,450,1507,10001};
  System.out.println(BinarySearch(arr , 150));
 }
}