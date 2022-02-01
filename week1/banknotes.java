package week1;

import java.util.Scanner;

public class banknotes {

    public static void main(String[] args) {
        int[] notes = {100,50,20,10,5,2,1};
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(n);
        for (int note:
            notes ) {
            int tot = n/note;
            n -= tot*note;
            System.out.printf("%d nota(s) de R$ %d,00\n",tot,note);
        }
    }


}
