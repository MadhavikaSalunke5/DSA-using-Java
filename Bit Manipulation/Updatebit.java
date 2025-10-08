import java.util.Scanner;

public class Updatebit {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int oper=sc.nextInt(); // 1 for set, 0 for clear
    int n=5;
    int pos=1;

    int bitmask = 1 << pos;  // ✅ define outside

    if(oper == 1){
        // set bit
        int newNumber = bitmask | n;
        System.out.println("New Number: " + newNumber);
    } else {
        // clear bit
        int newBitmask = ~bitmask;
        int newNumber = newBitmask & n;
        System.out.println("New Number: " + newNumber);
    }
  }
}
