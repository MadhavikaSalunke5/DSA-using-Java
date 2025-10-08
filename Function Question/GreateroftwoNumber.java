import java.util.Scanner;

public class GreateroftwoNumber {
  public static void Twonumber(int num1,int num2){
     if (num1 > num2) {
            System.out.println("Number 1st is the greater Number: " + num1);
        } else if (num2 > num1) {
            System.out.println("Number 2nd is the greater Number: " + num2);
        } else {
            System.out.println("Both numbers are equal: " + num1);
        }


  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 1st  Number:");
    int num1=sc.nextInt();

    System.out.println("Enter the 2nd  Number:");
    int num2=sc.nextInt();

    Twonumber(num1,num2);

    sc.close();

    


      
  }
  
}
