import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class tiragletypes {

    public static void main(String[] args) {
        ArrayList<Double> sides = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        sides.add(scan.nextDouble());
        sides.add(scan.nextDouble());
        sides.add(scan.nextDouble());


        Collections.sort(sides);
        Collections.reverse(sides);


        double a = sides.get(0);
        double b = sides.get(1);
        double c = sides.get(2);

        if (a >= b +c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else
        {
            if (a*a == b*b +c*c){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if (a*a > b*b +c*c){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if (a*a < b*b +c*c){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b ==c  ){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (a == b && b !=c  || c== b &&  a !=b){
            System.out.println("TRIANGULO ISOSCELES");
        }
        }

    }
}
