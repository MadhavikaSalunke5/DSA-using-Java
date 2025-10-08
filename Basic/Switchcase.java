import java.util.Scanner;

public class Switchcase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number (1, 2, or 3): ");
    int num = sc.nextInt();  // reads integer input

    switch (num) {
      case 1:
        System.out.println("Hello");
        break;

      case 2:
        System.out.println("Namaste");
        break;

      case 3:
        System.out.println("Bonjour");
        break;

      default:
        System.out.println("Invalid choice");
    }

    sc.close(); // always good to close Scanner
  }
}
