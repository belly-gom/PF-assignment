
import java.util.Scanner;

public class Octane {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 7;

        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        sc.close();
    }
}
