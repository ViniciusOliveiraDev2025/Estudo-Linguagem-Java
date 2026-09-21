package Atividades_Conceitos_Basicos;

import java.util.Scanner;

public class ATT_Temperatura2 {
    public static void main(String[] args) {

        double fahrenheit, celsius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");
    }
}
