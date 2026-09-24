package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        double quantidadeNotas, total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas notas voce quer digitar? ");
        quantidadeNotas = sc.nextDouble();

        double[] notas = new double[(int) quantidadeNotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            double nota = sc.nextDouble();
            notas[i] = nota;
            total += nota;
        }
        System.out.println(Arrays.toString(notas) + " ");
        System.out.println();
        System.out.println("Total das notas: " + total);
        System.out.println("Média das notas: " + (total / quantidadeNotas));
    }
}

