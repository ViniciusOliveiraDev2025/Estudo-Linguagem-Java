package Atividades_Estruturas_De_Controle;

public class ATT_NumeroPrimo {
    public static void main(String[] args) {
        int numero;
        boolean Primo = true;

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        if (numero <= 1) {
            Primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    Primo = false;
                }
            }
        }

        if (Primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
