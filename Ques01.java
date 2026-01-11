
import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double obtained = 750;
        double maximum = 900;

        double percentage = (obtained / maximum) * 100;
       //output
        System.out.println("Percentage Marks: " + percentage + "%");

        sc.close();
    }
}
