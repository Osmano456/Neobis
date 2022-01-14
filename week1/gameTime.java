import java.util.ArrayList;
import java.util.Scanner;

public class gameTime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> time = new ArrayList<>();
        time.add(scan.nextInt());
        time.add(scan.nextInt());
        time.add(scan.nextInt());
        time.add(scan.nextInt());

        int t1 = time.get(0);
        int t2 = time.get(2);
        int m1 = time.get(1);
        int m2 = time.get(3);

        int t = 0;
        int m = 0;

        if (t1 > t2){ t = t2-t1 +24;}
        else { t= t2-t1 ;}

        if (m1 > m2 ){ t -= 1; m = m2-m1 +60;}
        else {m = m2-m1;}


        if (t1==t2 && m1==m2 ){t= 24; m = 0;}
        if (t1==t2 && m1>m2 ){t= 23; m = m2-m1 +60;}
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n",t,m );


    }
}
