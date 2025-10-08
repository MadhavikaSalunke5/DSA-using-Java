import java.util.Scanner;

public class CircumferenceofCircle {
    
    // Function to return circumference
    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double r = sc.nextDouble();

        double circumference = getCircumference(r);  // function call
        System.out.println("Circumference of circle = " + circumference);

        sc.close();
    }
}
