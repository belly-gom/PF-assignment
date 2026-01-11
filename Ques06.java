
import java.util.Scanner;

public class Semi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = 8;
        double b = 5;
        double h = 4;

        double area = (a + b) * h / 2;

        //area of Trapezoid
        System.out.println("Area of the trapezoid: " + area);

        sc.close();
    }
}
