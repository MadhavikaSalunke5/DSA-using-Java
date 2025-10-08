public class Printxn {
  public static int Print(int x,int n){
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    int m=Print(x,n-1);
    int mm=x*m;
    return mm; 
  }
  public static void main(String[] args) {
    int x=2;
    int n=5;
    int ans=Print(x,n);
    System.out.println(ans);
      
  }
  
}
