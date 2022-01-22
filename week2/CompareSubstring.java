package week2;

import java.util.Scanner;

public class CompareSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()){
            String s1 = scan.nextLine();
            String s2 = scan.nextLine();

            int longest = 0;
            int start = 0;
            int end = 1;
            for (int i = 0; i < s1.length(); i++) {

                String sub = s1.substring(start,end);
                if (s2.contains(sub)){
                    end++;
                    longest = Math.max(longest, sub.length());

                }
                else {
                    start++;
                    end++;
                }



            }
            System.out.println(longest);
        }
    }


}
