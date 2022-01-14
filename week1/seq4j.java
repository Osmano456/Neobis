public class seq4j {

    public static void main(String[] args){

        double i;
        double j;

        for (i = 0; i <= 2; i += 0.2) {
            for (j = 1; j <= 3; j++) {
                double tot = j;
                tot += i;
                if (i == 0){
                    System.out.printf("I=0 J=0\n");
                }
                else{System.out.printf("I=%.1f J=%.1f\n",i,tot);}
            }
        }
    }
}