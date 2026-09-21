package Atividades_Estruturas_De_Controle;

import java.util.Scanner;

public class ATT_MaiorNumero {
    public static void main(String[] args) {
        int valores = 10;
        int MaiorNumero = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= valores; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            if (numero > MaiorNumero) {
                MaiorNumero = numero;
            }
        }
        System.out.println("O maior número digitado foi: " + MaiorNumero);
    }
}
