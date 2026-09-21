package Atividades_Estruturas_De_Controle;

import java.util.Scanner;

public class ATT_SomaNumerosPares {
    public static void main(String[] args) {
        int soma, repeticoes, numero;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Quantos numeros voce quer digitar?");
        repeticoes = scanner.nextInt();

        soma = 0;
        for (int i = 1; i <= repeticoes; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                soma += numero;
            }
        }

        System.out.println("A soma dos números pares é: " + soma);
    }
}
