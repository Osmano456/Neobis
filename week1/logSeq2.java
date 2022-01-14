import java.util.Scanner;

public class logSeq2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 1;
        for (int i = 0; i < b/a ; i++) {

            for (int j = 0; j < a && c <= b; j++) {
                if (j == a-1){System.out.print(c);}
                else{System.out.print(c+ " ");}

                c++;
            }
            System.out.println();
        }
    }
}
