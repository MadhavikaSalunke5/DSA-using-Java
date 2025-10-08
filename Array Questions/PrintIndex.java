import java.util.Scanner;

public class PrintIndex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
    int numbers[] = new int[size];

    System.out.println("Enter " + size + " elements:");
    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }

    System.out.print("Enter number to search: ");
    int x = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == x) {
        System.out.println("x Found at index: " + i);
        found = true;
        break;   // stops after first match
      }
    }

    if (!found) {
      System.out.println("x not found in the array");
    }

    sc.close();
  }
}
