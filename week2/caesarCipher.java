package week2;

import java.util.ArrayList;
import java.util.Scanner;

public class caesarCipher {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String s = scan.next();
            int shift = scan.nextInt();
            StringBuilder news = new StringBuilder() ;
            int[] chars = s.chars().toArray();

            for (int c: chars
                 ) {
                c= c-shift;
                if (c <65 ){
                    c += 26;
                }
                news.append((String.copyValueOf(Character.toChars(c))));

            }
            System.out.println(news);

        }
    }

}
