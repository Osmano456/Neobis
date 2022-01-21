package week2;

import java.util.Scanner;

public class Combiner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            String s = scan.nextLine();

            StringBuilder newS = new StringBuilder();
            int count = 0;
            int s1 = 0;
            int s2 = 0;
            String str1 = scan.next();
            String str2 = scan.next();

            while (s1 < str1.length() && s2 < str2.length() ){

                if (count % 2 ==0 ){
                    newS.append(str1.charAt(s1));
                    s1++;
                }
                else
                {
                    newS.append(str2.charAt(s2));
                    s2++;
                }
                count++;
//                System.out.println(newS);
            }

            String big = str1.length() > str2.length() ? str1 : str2;

            newS.append(big.substring(s1-1));
            System.out.println(newS);

        }
    }
}
