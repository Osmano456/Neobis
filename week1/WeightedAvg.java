import java.util.Scanner;

public class WeightedAvg {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {

            double tot = 0;

            tot += scan.nextDouble()*2;
            tot += scan.nextDouble()*3;
            tot += scan.nextDouble()*5;

            tot =tot/10;

            System.out.printf("%.1f\n", tot);
        }
    }
}
