public class FirstNaturalNum {
  public static void PrintSumofNaturalNum(int i,int n,int sum){
    if(i==n){
      sum+=i;
      System.out.println(sum);
      return;
    }
    sum+=i;
    PrintSumofNaturalNum(i+1,n,sum);
    
  } 
  public static void main(String[] args) {
    PrintSumofNaturalNum(1,5,0);
      
  }
  
}
