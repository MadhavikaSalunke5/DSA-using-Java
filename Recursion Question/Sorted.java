public class Sorted {
  public static boolean Print(int arr[],int idx){
    if(idx==arr.length-1){
      return true;
    }
    if(arr[idx]<arr[idx+1])
    {
      return Print(arr,idx+1);
    }else{
      return false;
    }

  }
  public static void main(String[] args) {
      int []arr={1,2,3,6,5};
      Print(arr,0);
      System.out.println(Print(arr,0));

  }
  
}
