import java.util.Scanner;

public class Age {
  public static void CheckEligible(int a){
    if(a>=18){
      System.out.println("Your are Eligible to vote: "+a);
    }else{
      System.out.println("Not Eligible to Vote");
    }

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Age:");
    int a=sc.nextInt();

    CheckEligible(a);

    sc.close();

      
  }
  
}
