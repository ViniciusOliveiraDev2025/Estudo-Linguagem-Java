package Classe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {
        Scanner Data = new Scanner(System.in);

        Data data1 = new Data();
        data1.dia = Data.nextInt();
        data1.mes = Data.nextInt();
        data1.ano = Data.nextInt();
        data1.imprimirData();

        Data data2 = new Data();
        data2.dia = Data.nextInt();
        data2.mes = Data.nextInt();
        data2.ano = Data.nextInt();
        data2.imprimirData();


        // Testando o construtor com e sem parâmetros
        Data data3 = new Data();
        data3.imprimirData();

        Data data4 = new Data(31, 12, 2023);
        data4.imprimirData();


    }
}
