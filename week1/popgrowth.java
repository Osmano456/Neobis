import java.util.Scanner;

public class popgrowth {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {

            int pa = scan.nextInt();
            int pb = scan.nextInt();
            double ga = scan.nextDouble();
            double gb = scan.nextDouble();
            int year = 0;

            while (pa <= pb ){
                year++;
                pa += (int)((ga/100)*pa);
                pb += (int)((gb/100)*pb);

                if (year > 100){break;}
            }

            String s = (year > 100)?("Mais de 1 seculo."):(year + " anos.");
            System.out.println(s);
        }
    }
}
