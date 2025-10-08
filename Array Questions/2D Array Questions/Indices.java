import java.util.Scanner;

public class Indices {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows: ");
    int row = sc.nextInt();

    System.out.println("Enter number of columns: ");
    int cols = sc.nextInt();

    int[][] numbers = new int[row][cols];

    // input matrix
    System.out.println("Enter " + (row * cols) + " elements:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < cols; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }

    // number to search
    System.out.println("Enter number to search: ");
    int x = sc.nextInt();

    // search in matrix
    boolean found = false;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < cols; j++) {
        if (numbers[i][j] == x) {
          System.out.println("x found at location (" + i + "," + j + ")");
          found = true;
        }
      }
    }

    if (!found) {
      System.out.println("x not found in the matrix.");
    }

    sc.close();
  }
}

