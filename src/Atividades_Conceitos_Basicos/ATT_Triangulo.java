package Atividades_Conceitos_Basicos;

import java.util.Scanner;

public class ATT_Triangulo {
    public static void main(String[] args) {
        double base, altura,area;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Digite a base do triângulo: ");
        base=scanner.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        altura=scanner.nextDouble();

        area=(base*altura)/2;
        System.out.printf("A area do triangulo e de: %.2f%n", area);
    }
}
