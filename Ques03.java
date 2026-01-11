
import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double osp = 2000;
        double discount = 15;

        double dsp = osp * (1 - discount / 100);

        System.out.println(osp);
        System.out.println(dsp);

        sc.close();
    }
}
