package Atividades_Conceitos_Basicos;

import java.util.Scanner;

public class ATT_ValorCubo {
    public static void main(String[] args) {
        double valor, cubo, quadrado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        valor = sc.nextDouble();

        cubo = valor * valor * valor ;
        quadrado = valor * valor;

        System.out.println("O cubo do valor é: " + cubo);
        System.out.println("O quadrado do valor é: " + quadrado);
    }
}
