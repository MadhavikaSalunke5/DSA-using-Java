public class Reverse {
  public static void Print(String str,int idx){
    if(idx==0){
      System.out.println(str.charAt(idx));
      return;
    }
    System.out.println(str.charAt(idx));
    Print(str,idx-1);
  }

  public static void main(String[] args) {
    String str="abcd";
    Print(str,str.length()-1);

       
  }
  
}
