public class Palindrome {
  public static void main(String[] args) {
      String str="MadaM";
      StringBuilder sb=new StringBuilder(str);
      String rev=sb.reverse().toString();

      if(str.equals(rev)){
        System.out.println(str+ "is a Palindrome");
      }
      else{
        System.out.println(str+"not palindrome");
      }
  }
  
}
