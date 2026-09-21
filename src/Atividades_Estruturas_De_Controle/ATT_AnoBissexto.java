package Atividades_Estruturas_De_Controle;

import java.util.Scanner;

public class ATT_AnoBissexto {
    public static void main(String[] args) {
        int ano;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano para verificar se é bissexto ou não:");
        ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

    }
}
