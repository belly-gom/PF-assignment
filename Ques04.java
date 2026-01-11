
import java.util.Scanner;

public class Calculas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dsp = 850;
        double discount = 15;

        //for osp
        double osp = dsp / (1 - discount / 100);

        System.out.println(osp);

        sc.close();
    }
}
