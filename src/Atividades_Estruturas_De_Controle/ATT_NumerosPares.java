package Atividades_Estruturas_De_Controle;

import java.util.Scanner;

public class ATT_NumerosPares {
    public static void main(String[] args) {
        int Num;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero de 0 a 10: ");
        Num = scanner.nextInt();
        if (Num < 0 || Num > 10) {
            System.out.println("Numero fora do intervalo permitido.");
        } else {
            if (Num % 2 == 0) {
                System.out.println("O numero " + Num + " e par.");
            } else {
                System.out.println("O numero " + Num + " e impar.");
            }
        }

    }
}
