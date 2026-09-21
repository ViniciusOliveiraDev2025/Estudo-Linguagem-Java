package Atividades_Estruturas_De_Controle;

import java.util.Scanner;

public class ATT_MediaNotas {
    public static void main(String[] args) {

        double nota1, nota2, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;
        System.out.println("A média das notas é: " + media);

        if (media >= 7 ) {
            System.out.println("Aprovado");
        }else if (media < 7 && media >= 4) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }


    }
}
