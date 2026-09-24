package Arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas da matriz: ");
        int linhas = sc.nextInt();
        System.out.println("Digite o número de colunas da matriz: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Valores da matriz: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
