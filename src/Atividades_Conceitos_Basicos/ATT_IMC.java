package Atividades_Conceitos_Basicos;

import java.util.Scanner;

public class ATT_IMC {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner scanner    = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        peso = scanner.nextDouble();
        System.out.print("Digite sua altura: ");
        altura = scanner.nextDouble();

        imc = peso/(altura*altura);

        System.out.printf("Seu IMC é: %.2f ", imc);
    }
}
