public class Factorial{
  public static int CalculateFact(int n){
    if(n==1 || n==0){
      return 1;
    }
    int m=CalculateFact(n-1);
    int mm=n*m;
    return mm;

  }

  public static void main(String[] args) {
    int n=5;
    int ans=CalculateFact(n);
    System.out.println("The Factorial of " +n+ " is " +ans);
      
  }
  
}
