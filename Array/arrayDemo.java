public class arrayDemo {
 public static void main(String[] args) {
  // System.out.println("45");
  //declare
  int[] arr = null;
  System.out.println(arr);
  //allocate address
  arr = new int[5];
  System.out.println(arr);
  //get the value
  arr[0] = 10;
  arr[1] = 20;
  arr[2] = 30;
  arr[3] = 40;
  arr[4] = 50;

  System.out.println(arr[0]);
  System.out.println(arr[1]);
  System.out.println(arr[2]);
  System.out.println(arr[3]);
  System.out.println(arr[4]);
  System.out.println("An other way by loop");

  //print arr by loop
  for(int i = 0 ; i<= arr.length-1 ; i++){
   System.out.println(arr[i]);
  }
  //in reverse order
  // for(int i = arr.length-1 ; i <= 0 ; i++){
  //  System.out.println(arr[i]);
  // }

  // enhance the for loop
  for(int val : arr){
   System.out.println("hello  "+val);
  }
    // swap array
    int i = 0 , j = 3;
       System.out.println(arr[i] + "    " + arr[j]);
    // swap(arr, arr[i], arr[j]);
     swap(arr, i, j);
     System.out.println("One1-------");
    //another way swap array
     int[] other = { 100,200,300};
     System.out.println(arr[0] + " ... " + other[2]);

     swap(arr,other);
     System.out.println(arr[0] + " answer " + other[2]);
          // System.out.println(other[2]);


; }


  // swap array
  public static void swap(int one[] , int two[]  ){

   int[] temp = one;
   one = two;
   two = temp;
    // return temp; // waiting for void ---> int
  }

    public static void swap(int arr[] , int i , int j  ){

     System.out.println(arr[i] + " answer " + arr[j]);
  }

}