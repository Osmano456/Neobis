package week2;

import java.util.Scanner;

public class Huaauhahhuahau {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String line =  scan.next();
        StringBuilder b = new StringBuilder("");
        for (int i = 0; i < line.length(); i++) {
            String c = String.valueOf(line.charAt(i)) ;

            if (c.matches("[aeuio]")){
                b.append(c);
            }
//            System.out.println(c);

        }
//        System.out.println(b);
        String bnor = b.toString();
        if (b.reverse().toString().equals(bnor)){
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }
//        System.out.println(b);
    }
}
