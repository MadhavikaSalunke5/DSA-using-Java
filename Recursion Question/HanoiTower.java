public class HanoiTower {
  public static void Transfer(int n,String src, String help,String dest){
    if(n==1){
      System.out.println("Transfer disk  " + n+ " from " +src+ " to " +dest);
      return;
      
    }
    Transfer(n-1,src,dest,help);
    System.out.println("Transfer disk  " + n+ " from " +src+ " to " +dest);
    Transfer(n-1,help,src,dest);

  }
  public static void main(String[]args){
    int n=3;
    Transfer(n,"S","H","D");

  }
  
}
