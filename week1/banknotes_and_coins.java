package week1;

import java.util.Scanner;

public class banknotes_and_coins {

    public static void main(String[] args) {
        int[] notes = {100,50,20,10,5,2};
        int[] coins = {50, 25, 10, 5 , 1};
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();
        String[] ns = n.split("\\.");
        int[] NC = {Integer.parseInt(ns[0]),Integer.parseInt(ns[1])};

        System.out.println("NOTAS:");
        for (int note:
                notes ) {
            int tot = NC[0]/note;
            NC[0] -= tot*note;
            System.out.printf("%d nota(s) de R$ %d.00\n",tot,note);


        }

        System.out.println("MOEDAS:");

        if (NC[0] == 1 ){ System.out.println("1 moeda(s) de R$ 1.00");}
        else { System.out.println("0 moeda(s) de R$ 1.00"); }

        for (int coin :coins) { int tot = NC[1] / coin;
            NC[1] -= tot*coin;


            if (coin == 5 || coin == 1){
                System.out.printf("%d moeda(s) de R$ 0.0%d\n",tot,coin); }
            else{
                System.out.printf("%d moeda(s) de R$ 0.%d\n",tot,coin);  }

        }



    }


}

