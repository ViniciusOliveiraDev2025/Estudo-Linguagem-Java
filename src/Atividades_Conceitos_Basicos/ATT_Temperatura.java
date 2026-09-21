package Atividades_Conceitos_Basicos;

import java.util.Scanner;

public class ATT_Temperatura {
    public static void main(String[] args) {

        double fahrenheit, celsius;

        Scanner  scanner = new Scanner(System.in);

        System.out.println("Digite o temperatura em fahrenheit:");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius é:"+ celsius + "°C");
    }
}
