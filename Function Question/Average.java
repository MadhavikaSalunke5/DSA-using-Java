import java.util.Scanner;

public class Average{
  public static void AverageofThreeNumbers(int a,int b,int c){
      double avg=(a+b+c)/3.0;
      System.out.println("The Average is: "+ avg);

    }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st Number: ");
    int num1=sc.nextInt();

  
    System.out.println("Enter 2nd Number: ");
    int num2=sc.nextInt();

    System.out.println("Enter 2nd Number: ");
    int num3=sc.nextInt();

    AverageofThreeNumbers(num1,num2,num3);

    sc.close();
  }
  
}
