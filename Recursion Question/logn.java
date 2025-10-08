public class logn {
  public static int Print(int x,int n){
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    //if n is even
    if(n%2==0){
      return Print(x,n/2)*Print(x,n/2);
    }
    else{//n is odd
      return Print(x,n/2)*Print(x,n/2)*x;
    
    }
  }
  public static void main(String[] args) {
    int x=2;
    int n=5;
    int ans=Print(x,n);
    System.out.println(ans);
      
  }
  
}