
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius = 7;

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        sc.close();
    }
}
