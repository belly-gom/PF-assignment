
import java.util.Scanner;

public class Sigma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double voltage = 220;
        double current = 5;

        double watts = voltage * current;

        System.out.println( voltage + " V");
        System.out.println( current + " A");
        System.out.println( watts + " Watts");

        sc.close();
    }
}
