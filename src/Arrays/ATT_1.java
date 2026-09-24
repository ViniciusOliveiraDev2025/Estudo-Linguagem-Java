package Arrays;
//Teste de Array.

import java.util.Arrays;

public class ATT_1 {
    public static void main(String[] args) {
        double[] notas = new double[3];
        notas[0] = 50;
        notas[1] = 70;
        notas[2] = 90;

        System.out.println("Notas: " + Arrays.toString(notas));


        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        System.out.println("Total: " + total);
        System.out.println("Media: " + total / notas.length);

    }

}
