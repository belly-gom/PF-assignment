import java.util.Scanner;

public class Ice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = 5;
        double b = 6;
        double c = 7;

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        //area of triangle
        System.out.println("Area of Triangle: " + area);

        sc.close();
    }
}
