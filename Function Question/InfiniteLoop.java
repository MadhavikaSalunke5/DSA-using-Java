public class InfiniteLoop {
  public static void main(String[] args) {
    int i=1;
    {
    do { 
      System.out.print("The loop is on: " +i);
      i++;
        
    } while (true);
  }
      
  }
  
}
