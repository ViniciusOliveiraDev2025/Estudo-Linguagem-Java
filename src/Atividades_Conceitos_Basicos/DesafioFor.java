package Atividades_Conceitos_Basicos;

public class DesafioFor {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        String valor = "#";

        for (int i = a; i <= b; i++) {
            System.out.println(valor);
            valor += "#";
        }
    }
}
