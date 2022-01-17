import java.util.Scanner;

public class grenais {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int inter = 0;
        int gremio = 0;
        int draw= 0;
        int tot = 0;


        do {
            int a =scan.nextInt();
            int b = scan.nextInt();
            if (a > b){ inter++;}
            else if (a < b){ gremio++;}
            else { draw++;}
            tot++;
            System.out.println("Novo grenal (1-sim 2-nao)");

        }while (scan.nextInt()==1);


        String winner;

        if (inter > gremio){ winner = "Inter venceu mais";}
        else if (inter < gremio){winner = "Gremio venceu mais";}
        else {winner = "Não houve vencedor";}

        System.out.printf("%s grenais\nInter: %d\nGremio: %d\nEmpates: %d\n%s\n",tot,inter,gremio,draw,winner);

    }
}
