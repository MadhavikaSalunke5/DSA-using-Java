public class Missingelements {
  public static void main(String[] args) {
    int []arr={1,2,4,5,6};
    int n=arr.length+1;
    int total=n*(n+1)/2;
    int sum=0;

    for(int num:arr){
      sum+=num;
    }
    System.out.println("Missing Number="+(total-sum));
  }
  
}
