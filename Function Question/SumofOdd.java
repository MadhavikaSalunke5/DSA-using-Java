import java.util.Scanner;

public class SumofOdd {
public static void PrintOddNumbers(int n){
  System.out.println("Odd Numbers From 1 to "+n+":");
  int sum=0;
  for(int i=1;i<=n;i++){
      if(i%2!=0){
        System.out.print(i+"  ");
        sum += i;
      }
    }
    System.out.println("The Sum of NUmbers is:" +sum);

}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        PrintOddNumbers(n);

        sc.close();
  
    
      
  }
  
}
