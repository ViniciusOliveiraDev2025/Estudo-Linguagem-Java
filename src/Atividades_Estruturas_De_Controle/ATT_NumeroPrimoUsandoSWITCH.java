package Atividades_Estruturas_De_Controle;

public class ATT_NumeroPrimoUsandoSWITCH {
    public static void main(String[] args) {
        int numero;
        boolean Primo = true;

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        switch (numero) {
            case 1:
                Primo = false;
                break;
            default:
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        Primo = false;
                        break;
                    }
                }
                break;
        }

        if (Primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
