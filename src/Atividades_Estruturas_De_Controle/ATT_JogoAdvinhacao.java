package Atividades_Estruturas_De_Controle;

import java.util.Scanner;

public class ATT_JogoAdvinhacao {
    public static void main(String[] args) {
        int numeroSecreto = (int) (Math.random() * 100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativa;
        int tentativasRestantes = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");
        System.out.println("Você tem " + tentativasRestantes + " tentativas.");
        System.out.println();
        while (tentativasRestantes > 0) {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();

            if (tentativa < 1 || tentativa > 100) {
                System.out.println("Por favor, digite um número entre 1 e 100.");
                System.out.println();
            }

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);
            } else if (tentativa < numeroSecreto) {
                System.out.println("O número secreto é maior. Tente novamente.");
                System.out.println();
                break;
            } else {
                System.out.println("O número secreto é menor. Tente novamente.");
                System.out.println();
            }

            tentativasRestantes--;
            System.out.println("Tentativas restantes: " + tentativasRestantes);
        }

        if (tentativasRestantes == 0) {
            System.out.println("Suas tentativas acabaram! O número secreto era: " + numeroSecreto);
        }
    }
}
